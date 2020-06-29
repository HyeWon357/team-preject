package com.javalec.ex.controller;


import java.util.List;

import javax.inject.Inject;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

import org.apache.ibatis.session.SqlSession;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

import com.javalec.ex.dao.MemberDAO;
import com.javalec.ex.dto.MemberDTO;
import com.javalec.ex.service.MemberService;

@Controller
public class MemberController {
	
	private static final Logger Logger = LoggerFactory.getLogger(MemberController.class);
	
	@Inject
	private MemberService memberService;
	
	@Autowired
	BCryptPasswordEncoder passEncoder;
	
	//회원리스트
	@RequestMapping("member/list")
	public String memberList(Model model) throws Exception {
		
		List<MemberDTO> list  = memberService.memberList();
		model.addAttribute("list",list);
		return "member/list";
	}
	
	
	//회원가입 get
	@RequestMapping(value = "member/signUp", method = RequestMethod.GET)
	public void getSignUp() throws Exception{
		Logger.info("get signUp"); //작동됨
		
		String email1 = "ddddd";
		String email2 = "daum.net";
		
		String emailConcat = email1 + "@" + email2;
		System.out.println(emailConcat);
	}
	
	
	//회원가입post //암호화완료
	@RequestMapping(value = "member/signUp", method = RequestMethod.POST)
	public String postSignUp(@ModelAttribute("dto") MemberDTO dto) throws Exception{
		Logger.info("post signUp");
		
		int result = memberService.idChk(dto);
		
		try {
			if(result == 1 ) {
				return "member/signUp";
			}else if(result == 0) {
				String inputPass = dto.getD_pw();
				String pass = passEncoder.encode(inputPass);
				dto.setD_pw(pass);
				memberService.signUp(dto);
			}
			
		} catch (Exception e) {
			throw new RuntimeException();
		}
		
		return "member/step04";
	} 

	
	
		//메인화면
		@RequestMapping("member/main")
		public String main() {
			return "member/main";
		}

		//약관동의
		@RequestMapping(value = "member/agree", method = RequestMethod.GET)
		public String agree() {
			
			return "member/agree";
		}
	
		//가입인사
		@RequestMapping("member/step04")
		public String step04() {
			
			return "member/step04";
		}
		
		//로그인페이지이동
		@RequestMapping(value="member/login", method = RequestMethod.GET)
		public String login(HttpSession session, MemberDTO dto, Model model) {
		
			if(session.getAttribute("member") != null) {
				return "redirect:main";
			}	
			return "member/login";
		}
		
	
	//로그인
	@RequestMapping(value = "member/login", method = RequestMethod.POST)
	public String loginCheck(MemberDTO dto, HttpSession session, RedirectAttributes rttr) throws Exception{
		Logger.info("post loginCheck");
				
		session.getAttribute("member");
		MemberDTO loginCheck = memberService.loginCheck(dto);
		
		boolean pwdMatch;
		if(loginCheck != null) {
			pwdMatch = passEncoder.matches(dto.getD_pw(), loginCheck.getD_pw());
		}else {
			pwdMatch = false;
		}
		
		if(loginCheck != null && pwdMatch == true) {
			session.setAttribute("member", loginCheck);
			return "redirect:main";	
		}else {
			session.setAttribute("member", null);
			rttr.addFlashAttribute("msg", false);
			return "member/login";
		}
	}
	
	//로그아웃
	@RequestMapping("member/logout")
	public String logout(HttpSession session) {
		session.invalidate();
		return "redirect:main";
	}
	
	//아이디찾기
	@RequestMapping("member/idsearch")
	public String idsearch() {
		
		return "member/idsearch";
	}

	//회원수정 뷰페이지
	@RequestMapping(value = "member/memberUpdateView", method = RequestMethod.GET)
	public void memberUpdateView() {
		Logger.info("get memberUpdateView");
	}
	
	
	//회원수정
	@RequestMapping(value = "member/memberUpdateView", method = RequestMethod.POST)
	public String memberUpdate(MemberDTO dto, HttpSession session) throws Exception{
		
		Logger.info("post memberupdateView");
		
		String inputPass = dto.getD_pw();
		String pass = passEncoder.encode(inputPass);
		dto.setD_pw(pass);

		memberService.memberUpdate(dto);
		
		session.invalidate();
		
		return "member/login";
	}
	
	//아이디중복체크
	@ResponseBody
	@RequestMapping(value = "member/idChk", method = RequestMethod.POST)
	public int postIdCheck(MemberDTO dto) throws Exception{
		
		Logger.info("post idCheck");
		
		int result = memberService.idChk(dto);
		
		return result;
		
	}
	

	
	
	
	
	
	//아이디중복검사
//	@ResponseBody
//	@RequestMapping(value = "member/idCheck", method = RequestMethod.POST)
//	public int postIdCheck(HttpServletRequest request) throws Exception{
//		
//		Logger.info("post idCheck");
//		
//		String d_id = request.getParameter("d_id");
//		MemberDTO idCheck = memberService.idCheck(d_id);
//		
//		int result = 0;
//		
//		if(idCheck != null) {
//			result = 1;
//		}
//		return result;
//	}
	
	
//	@RequestMapping("member/step04")
//	public String step04() {
//		
//		return "member/step04";
//	}
//	
//	
//	@RequestMapping("member/login")
//	public String login() {
//		
//		return "member/login";
//	}
//	
//	@RequestMapping(value = "member/agree", method = RequestMethod.GET)
//	public String agree() {
//		
//		return "member/agree";
//	}
//	
//	
//	//메인페이지
//	@RequestMapping("member/main")
//	public String main() {
//		
//		return "member/main";
//	}
//	
//	//회원가입 페이지
//	@RequestMapping(value = "member/signUp", method = RequestMethod.GET)
//	public void signUpGET() {
//		
//	}
//	
//	//회원가입 POST
//	@RequestMapping(value = "member/signUpPost", method = RequestMethod.POST)
//	public String signUpPost(@ModelAttribute("dto") MemberDTO dto) {
//		memberService.insertMember(dto);
//		
//		return "member/step04";
//	}
	

}
