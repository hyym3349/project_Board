package com.project.service;

import javax.inject.Inject;

import org.springframework.stereotype.Service;

import com.project.dao.MemberDAO;
import com.project.vo.MemberVO;

@Service
public class MemberServiceImpl implements MemberService {
	
	@Inject MemberDAO dao;
	
	// 회원가입
	@Override
	public void register(MemberVO vo) throws Exception {
		
		dao.register(vo);
	}
	
	// 로그인
	@Override
	public MemberVO login(MemberVO vo) throws Exception {
		
		return dao.login(vo);
		
	}
	
	// 업데이트
	@Override
	public void memberUpdate(MemberVO vo) throws Exception {
		
		dao.memberUpdate(vo);
	}
	
	// 삭제
	@Override
	public void memberDelete(MemberVO vo) throws Exception {
		
		dao.memberDelete(vo);
	}
	
	// 패스워드 체크
	@Override
	public int passChk(MemberVO vo) throws Exception {
		int result = dao.passChk(vo);
		return result;
	}
	
	// 아이디 중복 체크
	@Override
	public int idChk(MemberVO vo) throws Exception {
		int result = dao.idChk(vo);
		return result;
	}

	@Override
	public void memberPassUpdate(MemberVO vo) throws Exception {
		// TODO Auto-generated method stub
		dao.memberPassUpdate(vo);
	}

	
}