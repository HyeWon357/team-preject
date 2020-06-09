package com.javalec.ex.controller;



import org.apache.ibatis.session.SqlSession;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;

import com.javalec.ex.Dao.MemberDAO;
import com.javalec.ex.Dto.MemberDTO;

@Controller
public class MemberController {
	
	@Autowired
	private SqlSession sqlSession;
	
//	
//	@RequestMapping("member/signUp")
//	public String signUp(MemberDTO dto, Model model) {
//		
//		MemberDAO dao = sqlSession.getMapper(MemberDAO.class);
//		dao.signUp(dto.getD_name(), dto.getD_id(), dto.getD_pw(), dto.getD_email1(), dto.getD_email2(), dto.getD_email_check(), dto.getD_zipcode(),
//					dto.getD_address(), dto.getD_phone1(), dto.getD_phone2(), dto.getD_phone3(), dto.getD_sms(), dto.getD_tel1(), dto.getD_tel2(),
//					dto.getD_tel3(), dto.getD_birth_yy(), dto.getD_birth_mm(), dto.getD_birth_dd(), dto.getD_sl(), dto.getD_date());
//		
//		return "redirect:step04";
//	}
	
	
	
//	@Inject
//	private MemberService memberService;
//	
//	@RequestMapping(value = "/signUp", method = RequestMethod.GET)
//	public void getsignUp() {
//	}
//	
//	@RequestMapping(value = "/signUp", method = RequestMethod.POST)
//	public String postsignUp(MemberDTO dto){
//		
//		memberService.insertMember(dto);
//		return "main";
//	}
//	
	
	
	@RequestMapping("member/main")
	public String main() {
		
		return "member/main";
	}
	
	@RequestMapping("member/login")
	public String login() {
		
		return "member/login";
	}
	
	@RequestMapping("member/agree")
	public String agree() {
		
		return "member/agree";
	}
	
	@RequestMapping("member/signUp")
	public String signUp() {
		
		return "member/signUp";
	}
	
	@RequestMapping("member/step04")
	public String step04(@ModelAttribute("dto") MemberDTO memberDto) {
			
		return "member/step04";
	}
//	
//	@RequestMapping(value = "member/signUp", method = RequestMethod.POST)
//	public String signUpPOST(MemberDTO dto) {
//		memberService.insertMember(dto);
//		return "member/step04";
//	}
//	
}
