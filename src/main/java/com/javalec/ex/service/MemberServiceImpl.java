package com.javalec.ex.service;

import java.util.List;

import javax.inject.Inject;

import org.springframework.stereotype.Service;

import com.javalec.ex.dao.MemberDAO;
import com.javalec.ex.dto.MemberDTO;

@Service
public class MemberServiceImpl implements MemberService {

	
	@Inject
	private MemberDAO dao;
	
	//회원가입
	@Override
	public void signUp(MemberDTO dto) throws Exception {
		dao.signUp(dto);
	}
	
	//로그인
	@Override
	public MemberDTO loginCheck(MemberDTO dto) throws Exception {
		
		return dao.loginCheck(dto);
	}

	//회원리스트
	@Override
	public List<MemberDTO> memberList() throws Exception {

		return dao.memberList();
	}

	//회원정보수정
	@Override
	public void memberUpdate(MemberDTO dto) throws Exception {

		dao.memberUpdate(dto);
	}

	//아이디중복체크
	@Override
	public int idChk(MemberDTO dto) throws Exception {

		int result = dao.idChk(dto);
		return result;
	}

	

}
