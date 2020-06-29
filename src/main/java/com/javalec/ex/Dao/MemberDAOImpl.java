package com.javalec.ex.Dao;

import java.util.List;

import javax.inject.Inject;

import org.apache.ibatis.session.SqlSession;
import org.springframework.stereotype.Repository;

import com.javalec.ex.Dto.MemberDTO;


@Repository
public class MemberDAOImpl implements MemberDAO {

	@Inject
	private SqlSession sqlSession;
	
	//회원가입
	@Override
	public void signUp(MemberDTO dto) throws Exception {
		
		//System.out.println(dto);
		sqlSession.insert("com.javalec.ex.dao.MemberDAO.insertMember",dto);
	}
	
	//로그인
	@Override
	public MemberDTO loginCheck(MemberDTO dto) throws Exception {
		
		return sqlSession.selectOne("com.javalec.ex.dao.MemberDAO.loginCheck", dto);
	}

	
	//회원리스트
	@Override
	public List<MemberDTO> memberList() throws Exception {

		return sqlSession.selectList("com.javalec.ex.dao.MemberDAO.memberList");
	}

	//회원정보수정
	@Override
	public void memberUpdate(MemberDTO dto) throws Exception {
		sqlSession.update("com.javalec.ex.dao.MemberDAO.memberUpdate", dto);
	}

	//아이디중복체크
	@Override
	public int idChk(MemberDTO dto) throws Exception {
		int result = sqlSession.selectOne("com.javalec.ex.dao.MemberDAO.idChk", dto);
		return result;
	}

	
}

