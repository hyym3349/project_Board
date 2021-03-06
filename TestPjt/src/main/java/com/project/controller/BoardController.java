package com.project.controller;

import java.io.File;
import java.net.URLEncoder;
import java.util.List;
import java.util.Map;

import javax.inject.Inject;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.multipart.MultipartHttpServletRequest;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

import com.project.service.BoardService;
import com.project.service.ReplyService;
import com.project.vo.BoardVO;
import com.project.vo.MemberVO;
import com.project.vo.PageMaker;
import com.project.vo.ReplyVO;
import com.project.vo.SearchCriteria;

@Controller
@RequestMapping("/board/*")
public class BoardController {

	private static final Logger logger = LoggerFactory.getLogger(BoardController.class);

	@Inject
	BoardService service;

	@Inject
	ReplyService replyService;

	// 게시판 글 작성 화면123
	@RequestMapping(value = "/writeView", method = RequestMethod.GET)
	public void writeView() throws Exception {
		/* logger.info("writeView"); */

	}

	// 게시판 글 작성
	@RequestMapping(value = "/write", method = RequestMethod.POST)
	public String write(BoardVO boardVO, MultipartHttpServletRequest mpRequest) throws Exception {
		/* logger.info("write"); */

		service.write(boardVO, mpRequest);

		return "redirect:/board/list";
	}

	// 게시판 목록 조회
	@RequestMapping(value = "/list", method = RequestMethod.GET)
	public String table(Model model, @ModelAttribute("scri") SearchCriteria scri) throws Exception {
		/*
		 * logger.info("list");
		 */
		PageMaker pageMaker = new PageMaker();
		model.addAttribute("list", service.list(scri));

		pageMaker.setCri(scri);
		pageMaker.setTotalCount(service.listCount(scri));
		model.addAttribute("pageMaker", pageMaker);
		// System.out.println(pageMaker);
		/* System.out.println(service.list(scri)); */
		return "board/list";
	}

	// 게시판 조회
	@RequestMapping(value = "/readView", method = RequestMethod.GET)
	public String read(BoardVO boardVO, HttpSession session, @ModelAttribute("scri") SearchCriteria scri, Model model)
			throws Exception {

		/* logger.info("read"); */

		BoardVO writer = service.read(boardVO.getBno());
		
		/*
		 * System.out.println("작성자 : " + writer); System.out.println("세션 아이디 : " +
		 * (MemberVO)session.getAttribute("member"));
		 */
		
		MemberVO login = (MemberVO) session.getAttribute("member");
		if (login != null && !login.getUserId().equals(writer.getWriter())) {
			service.boardHit(boardVO.getBno());
		}

		model.addAttribute("read", service.read(boardVO.getBno()));
		model.addAttribute("scri", scri);

		/*
		 * System.out.println("게시판조회 : " + service.read(boardVO.getBno()));
		 * System.out.println("세션 아이디 : " + (MemberVO)session.getAttribute("member"));
		 */
		List<ReplyVO> replyList = replyService.readReply(boardVO.getBno());
		model.addAttribute("replyList", replyList);

		List<Map<String, Object>> fileList = service.selectFileList(boardVO.getBno());
		model.addAttribute("file", fileList);

		return "board/readView";
	}

	// 게시판 수정뷰
	@RequestMapping(value = "/updateView", method = RequestMethod.GET)
	public String updateView(BoardVO boardVO, @ModelAttribute("scri") SearchCriteria scri, Model model)
			throws Exception {
		/* logger.info("updateView"); */

		model.addAttribute("update", service.read(boardVO.getBno()));
		model.addAttribute("scri", scri);

		List<Map<String, Object>> fileList = service.selectFileList(boardVO.getBno());
		model.addAttribute("file", fileList);

		return "board/updateView";
	}

	// 게시판 수정
	@RequestMapping(value = "/update", method = RequestMethod.POST)
	public String update(BoardVO boardVO, @ModelAttribute("scri") SearchCriteria scri, RedirectAttributes rttr,
			@RequestParam(value = "fileNoDel[]") String[] files, MultipartHttpServletRequest mpRequest)
			throws Exception {
		/* logger.info("update"); */

		service.update(boardVO, files, mpRequest);

		rttr.addAttribute("page", scri.getPage());
		rttr.addAttribute("perPageNum", scri.getPerPageNum());
		rttr.addAttribute("searchType", scri.getSearchType());
		rttr.addAttribute("keyword", scri.getKeyword());

		return "redirect:/board/readView?bno=" + boardVO.getBno() + "&page=" + scri.getPage() + "&perPageNum="
				+ scri.getPerPageNum() + "&searchType=" + scri.getSearchType() + "&keyword=" + scri.getKeyword();

	}

	// 게시물 선택삭제
	@RequestMapping(value = "/delete")
	public String ajaxTest(HttpServletRequest request, @ModelAttribute("scri") SearchCriteria scri,
			RedirectAttributes rttr) throws Exception {

		String[] ajaxMsg = request.getParameterValues("valueArr");
		int size = ajaxMsg.length;
		for (int i = 0; i < size; i++) {
			service.delete(ajaxMsg[i]);

			rttr.addAttribute("page", scri.getPage());
			rttr.addAttribute("perPageNum", scri.getPerPageNum());
			rttr.addAttribute("searchType", scri.getSearchType());
			rttr.addAttribute("keyword", scri.getKeyword());
		}
		return "redirect:/board/list?&page=" + scri.getPage() + "&perPageNum=" + scri.getPerPageNum() + "&searchType="
				+ scri.getSearchType() + "&keyword=" + scri.getKeyword();

	}

	// 페이지 홈
	@RequestMapping(value = "/index", method = RequestMethod.GET)
	public void index() throws Exception {
		/* logger.info("index"); */

	}

	// 댓글 작성
	@RequestMapping(value = "/replyWrite", method = RequestMethod.POST)
	public String replyWrite(ReplyVO vo, HttpSession session, SearchCriteria scri, RedirectAttributes rttr)
			throws Exception {
		/* System.out.println(vo); */
		replyService.writeReply(vo);

		rttr.addAttribute("bno", vo.getBno());
		rttr.addAttribute("page", scri.getPage());
		rttr.addAttribute("perPageNum", scri.getPerPageNum());
		rttr.addAttribute("searchType", scri.getSearchType());
		rttr.addAttribute("keyword", scri.getKeyword());

		return "redirect:/board/readView";
	}

	// 댓글 수정 GET
	@RequestMapping(value = "/replyUpdateView", method = RequestMethod.GET)
	public String replyUpdateView(ReplyVO vo, HttpSession session, SearchCriteria scri, Model model) throws Exception {
		/* logger.info("reply Write"); */

		model.addAttribute("replyUpdate", replyService.selectReply(vo.getRno()));
		model.addAttribute("scri", scri);

		return "/board/replyUpdateView";
	}

	// 댓글 수정 POST
	@RequestMapping(value = "/replyUpdate", method = RequestMethod.POST)
	public String replyUpdate(ReplyVO vo, HttpSession session, SearchCriteria scri, RedirectAttributes rttr)
			throws Exception {
		/* logger.info("reply Write"); */

		replyService.updateReply(vo);

		rttr.addAttribute("bno", vo.getBno());
		rttr.addAttribute("page", scri.getPage());
		rttr.addAttribute("perPageNum", scri.getPerPageNum());
		rttr.addAttribute("searchType", scri.getSearchType());
		rttr.addAttribute("keyword", scri.getKeyword());

		return "redirect:/board/readView";
	}

	// 댓글 삭제 GET
	@RequestMapping(value = "/replyDeleteView", method = RequestMethod.GET)
	public String replyDeleteView(ReplyVO vo, HttpSession session, SearchCriteria scri, Model model) throws Exception {
		/* logger.info("reply Write"); */

		model.addAttribute("replyDelete", replyService.selectReply(vo.getRno()));
		model.addAttribute("scri", scri);

		return "/board/replyDeleteView";
	}

	// 댓글 삭제
	@RequestMapping(value = "/replyDelete", method = RequestMethod.POST)
	public String replyDelete(ReplyVO vo, HttpSession session, SearchCriteria scri, RedirectAttributes rttr)
			throws Exception {
		/* logger.info("reply Write"); */

		replyService.deleteReply(vo);

		rttr.addAttribute("bno", vo.getBno());
		rttr.addAttribute("page", scri.getPage());
		rttr.addAttribute("perPageNum", scri.getPerPageNum());
		rttr.addAttribute("searchType", scri.getSearchType());
		rttr.addAttribute("keyword", scri.getKeyword());

		return "redirect:/board/readView";
	}

	// 첨부파일 다운
	@RequestMapping(value = "/fileDown")
	public void fileDown(@RequestParam Map<String, Object> map, HttpServletResponse response) throws Exception {
		Map<String, Object> resultMap = service.selectFileInfo(map);
		String storedFileName = (String) resultMap.get("STORED_FILE_NAME");
		String originalFileName = (String) resultMap.get("OGN_FILE_NAME");

		// 파일을 저장했던 위치에서 첨부파일을 읽어 byte[]형식으로 변환한다.
		byte fileByte[] = org.apache.commons.io.FileUtils
				.readFileToByteArray(new File("C:\\mp\\file\\" + storedFileName));

		response.setContentType("application/octet-stream");
		response.setContentLength(fileByte.length);
		response.setHeader("Content-Disposition",
				"attachment; fileName=\"" + URLEncoder.encode(originalFileName, "UTF-8") + "\";");
		response.getOutputStream().write(fileByte);
		response.getOutputStream().flush();
		response.getOutputStream().close();

	}

	/*
	 * // 파일첨부 에러
	 * 
	 * @RequestMapping(value = "/attachFileOverSizeErr", method = RequestMethod.GET)
	 * public void attachFileOverSizeErr() throws Exception{ logger.info("index");
	 * 
	 * }
	 */

}