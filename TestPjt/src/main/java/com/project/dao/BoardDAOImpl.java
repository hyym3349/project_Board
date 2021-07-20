package com.project.dao;

import java.util.List;

import javax.inject.Inject;

import org.apache.ibatis.session.SqlSession;
import org.springframework.stereotype.Repository;

import com.project.vo.BoardVO;
import com.project.vo.MemberVO;
import com.project.vo.SearchCriteria;


@Repository
public class BoardDAOImpl implements BoardDAO {

	@Inject
	private SqlSession sqlSession;
	
	// 게시글 작성
	@Override
	public void write(BoardVO boardVO) throws Exception {
		sqlSession.insert("boardMapper.insert", boardVO);
		
	}
	
	// 게시물 목록 조회
	@Override
	public List<BoardVO> list(SearchCriteria scri) throws Exception {
	
		return sqlSession.selectList("boardMapper.listPage", scri);
	}
	
	// 게시물 총 개수
	@Override
	public int listCount(SearchCriteria scri) throws Exception {
		
		return sqlSession.selectOne("boardMapper.listCount", scri);
	}
	
	// 게시물 조회
	@Override
	public BoardVO read(int bno) throws Exception {
			
		return sqlSession.selectOne("boardMapper.read", bno);
	}
	
	// 게시물 수정
	@Override
	public void update(BoardVO boardVO) throws Exception {
		
		sqlSession.update("boardMapper.update", boardVO);
	}

	// 게시물 선택삭제
	@Override
	public void delete(String bno) throws Exception {
		
		sqlSession.delete("boardMapper.delete", bno);
	}
	
	
	// 게시판 조회수
	@Override
	public void boardHit(int bno) throws Exception {

		sqlSession.update("boardMapper.boardHit", bno);
	}
	
	@Override
	public int boardDelete(MemberVO vo) {
		
		return sqlSession.delete("boardMapper.boardDelete", vo);
	}

}