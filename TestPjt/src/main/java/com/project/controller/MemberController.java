package com.project.controller;

import javax.inject.Inject;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

import com.project.service.BoardService;
import com.project.service.MemberService;
import com.project.util.FileSecurityMd;
import com.project.vo.MemberVO;

@Controller
@RequestMapping("/member")
public class MemberController {

	private static final Logger logger = LoggerFactory.getLogger(MemberController.class);

	@Inject
	MemberService service;
	@Inject
	BoardService Boardservice;

	// 회원가입 get
	@RequestMapping(value = "/register", method = RequestMethod.GET)
	public void getRegister() throws Exception {
		/* logger.info("get register"); */
	}

	// 회원가입 post
	@RequestMapping(value = "/register", method = RequestMethod.POST)
	public String postRegister(MemberVO vo) throws Exception {
		/* logger.info("post register"); */
		int result = service.idChk(vo);
		try {
			if (result == 1) {
				return "/home";
			} else if (result == 0) {
				String enpassword = FileSecurityMd.MD5(vo.getUserPass());
				vo.setUserPass(enpassword);

				service.register(vo);
			}
			// 요기에서~ 입력된 아이디가 존재한다면 -> 다시 회원가입 페이지로 돌아가기
			// 존재하지 않는다면 -> register
		} catch (Exception e) {
			throw new RuntimeException();
		}

		return "redirect:/home";
	}

	// 로그인 POST
	@RequestMapping(value = "/home", method = RequestMethod.POST)
	public String login(MemberVO vo, HttpServletRequest req, RedirectAttributes rttr) throws Exception {
		/* logger.info("post login"); */

		HttpSession session = req.getSession();
		MemberVO login = service.login(vo);
		String pwdMatch = FileSecurityMd.MD5(vo.getUserPass());

		if (login != null && pwdMatch.equals(login.getUserPass()) == true) {
			session.setAttribute("member", login);

		} else {

			session.setAttribute("member", null);
			rttr.addFlashAttribute("msg", false);
		}
		/* System.out.println("로그인 세션 : " + login); */
		return "redirect:/home";
	}

	// 로그아웃
	@RequestMapping(value = "/logout", method = RequestMethod.GET)
	public String logout(HttpSession session) throws Exception {

		session.invalidate();

		return "redirect:/home";
	}

	// 회원정보 수정 GET
	@RequestMapping(value = "/memberUpdateView", method = RequestMethod.GET)
	public String registerUpdateView() throws Exception {

		return "member/memberUpdateView";
	}

	// 회원정보 수정 POST
	@RequestMapping(value = "/memberUpdate", method = RequestMethod.POST)
	public String registerUpdate(MemberVO vo, HttpSession session) throws Exception {
		/*
		 * MemberVO login = service.login(vo); String pwdMatch =
		 * FileSecurityMd.MD5(vo.getUserPass());
		 * 
		 * if(pwdMatch.equals(login.getUserPass())) { service.memberUpdate(vo);
		 * session.invalidate(); } else { return "/home"; }
		 */
		service.memberUpdate(vo);
		session.invalidate();
		return "redirect:/home";
	}

	// 회원 탈퇴 get
	@RequestMapping(value = "/memberDeleteView", method = RequestMethod.GET)
	public String memberDeleteView() throws Exception {
		return "member/memberDeleteView";
	}

	// 회원 탈퇴 post
	@RequestMapping(value = "/memberDelete", method = RequestMethod.POST)
	public String memberDelete(MemberVO vo, HttpSession session, RedirectAttributes rttr) throws Exception {

		/*
		 * // 세션에 있는 member를 가져와 member변수에 넣기 MemberVO member = (MemberVO)
		 * session.getAttribute("member"); // 세션에있는 비밀번호 String sessionPass =
		 * member.getUserPass(); // vo로 들어오는 비밀번호 String voPass = vo.getUserPass();
		 * 
		 * if(!(sessionPass.equals(voPass))) { rttr.addFlashAttribute("msg", false);
		 * return "redirect:/member/memberDeleteView"; }
		 */
		service.memberDelete(vo);
		Boardservice.boardDelete(vo);
		session.invalidate();
		return "redirect:/home";
	}

	// 패스워드 체크
	@ResponseBody
	@RequestMapping(value = "/passChk", method = RequestMethod.POST)
	public boolean passChk(MemberVO vo) throws Exception {
		MemberVO login = service.login(vo);
		String pwdChk = FileSecurityMd.MD5(vo.getUserPass());
		/*
		 * System.out.println("login.getUserPass()=>"+login.getUserPass());
		 * System.out.println("pwdChk=>"+pwdChk);
		 */
		boolean result = pwdChk.equals(login.getUserPass());
		return result;
	}

	// 아이디 중복 체크
	@ResponseBody
	@RequestMapping(value = "/idChk", method = RequestMethod.POST)
	public int idChk(MemberVO vo) throws Exception {
		int result = service.idChk(vo);
		return result;
	}

	// 회원 수정 GET
	@RequestMapping(value = "/memberCheckView", method = RequestMethod.GET)
	public String memberCheckView() throws Exception {
		return "member/memberCheckView";
	}

	// 회원 수정다음 GET
	@RequestMapping(value = "/memberModifyView", method = RequestMethod.GET)
	public String memberModifyView() throws Exception {
		return "member/memberModifyView";
	}

	// 회원 비밀번호 수정 GET
	@RequestMapping(value = "/memberPassView", method = RequestMethod.GET)
	public String memberPassViewGet() throws Exception {
		return "member/memberPassView";
	}

	// 비밀번호 수정 POST
	@RequestMapping(value = "/memberPass", method = RequestMethod.POST)
	public String memberPassPost(MemberVO vo, HttpSession session, RedirectAttributes rttr) throws Exception {
		
		service.memberPassUpdate(vo);
		
		String enpassword = FileSecurityMd.MD5(vo.getUserPass());
		vo.setUserPass(enpassword);
		service.memberPassUpdate(vo);
		/* System.out.println(FileSecurityMd.MD5(vo.getUserPass())); */
		session.invalidate();
		return "redirect:/home";
	}

}