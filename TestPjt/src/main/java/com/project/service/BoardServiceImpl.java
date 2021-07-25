package com.project.service;


import java.util.List;

import javax.inject.Inject;

import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Isolation;
import org.springframework.transaction.annotation.Transactional;

import com.project.dao.BoardDAO;
import com.project.vo.BoardVO;
import com.project.vo.MemberVO;
import com.project.vo.SearchCriteria;

@Service
public class BoardServiceImpl implements BoardService {

	@Inject
	private BoardDAO dao;
	
	// 게시글 작성
	@Override
	public void write(BoardVO boardVO) throws Exception {
		dao.write(boardVO);
	}
	
	// 게시물 목록 조회
	@Override
	public List<BoardVO> list(SearchCriteria scri) throws Exception {
		scri.setrStart(dao.listCount(scri));
		return dao.list(scri);
	}
	
	// 개시물 총 개수
	@Override
	public int listCount(SearchCriteria scri) throws Exception {
		
		return dao.listCount(scri);
	}
	
	// 페이지 스타트
	@Override
	public int rStart(SearchCriteria scri) throws Exception {
		
		return dao.rStart(scri);
	}
	
	// 게시물 조회
	@Transactional(isolation = Isolation.READ_COMMITTED)
	@Override
	public BoardVO read(int bno) throws Exception {
		dao.boardHit(bno);
		return dao.read(bno);
	}
	
	// 게시물 목록 수정
	@Override
	public void update(BoardVO boardVO) throws Exception {

		dao.update(boardVO);
	}

	// 게시물 목록 삭제
	@Override
	public void delete(String bno) throws Exception {
		
		dao.delete(bno);
	}
	
	// 회원탈퇴 + 게시물 삭제
	@Override
	public int boardDelete(MemberVO vo) {
		return dao.boardDelete(vo);
	}

}