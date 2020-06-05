package com.javalec.ex.controller;

import javax.servlet.http.HttpServletRequest;

import org.apache.ibatis.session.SqlSession;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import com.javalec.ex.Dao.AdminDao;
import com.javalec.ex.Dao.UserDao;
import com.javalec.ex.Dto.IDto;

@Controller
public class CustomerController {
	
	@Autowired
	SqlSession sqlSession;
	
	
	@RequestMapping("main/main")
	public String main(Model model) {
		
		return "main/main";
	}

	
	
	//공지사항
	@RequestMapping("cus/notice_list")
	public String notice_list(Model model) {
		
		UserDao dao = sqlSession.getMapper(UserDao.class);
		model.addAttribute("notice_list", dao.notice_list());
		return "cus/notice_list";
	}
	
	@RequestMapping("cus/notice_content")
	public String notice_content(HttpServletRequest request, Model model) {
		
		UserDao dao = sqlSession.getMapper(UserDao.class);
		dao.notice_upHit(request.getParameter("hNnum"));
		model.addAttribute("notice_content",dao.notice_content(request.getParameter("hNnum")));
		return "cus/notice_content";
	}
	
	
	
	//1:1문의
	@RequestMapping("cus/inquiry_list")
	public String inquiry_list(Model model) {
		
		UserDao dao = sqlSession.getMapper(UserDao.class);
		model.addAttribute("inquiry_list", dao.inquiry_list());
		return "mypage/inquiry_list";
	}
	
	@RequestMapping("cus/inquiry_content")
	public String inquiry_content(HttpServletRequest request, Model model) {
		
		UserDao dao = sqlSession.getMapper(UserDao.class);
		model.addAttribute("inquiry_content", dao.inquiry_content(request.getParameter("hInum")));
		return "mypage/inquiry_content";
	}
	
	@RequestMapping("cus/inquiry_write")
	public String inquiry_write (IDto idto, Model model) {
		
		return "cus/inquiry_write";
	}
	
	@RequestMapping("cus/inquiry_write2")
	public String inquiry_write2(Model model) {
		
		return "mypage/inquiry_write2";
	}
	
	@RequestMapping("cus/Uinquirywrite")
	public String Uinquirywrite (IDto idto, Model model) {
		
		UserDao dao = sqlSession.getMapper(UserDao.class);
		dao.Uinquirywrite(idto.gethIname(), idto.gethItitle(), idto.gethIcontent());
		return "redirect:inquiry_content";
	}
	
	
	//FAQ
	@RequestMapping("cus/faq_list")
	public String faq_list(Model model) {
		
		return "cus/faq_list";
	}
	
	//이용안내
	@RequestMapping("cus/guide")
	public String guide(Model model) {
		
		return "cus/guide";
	}
	
	
}
