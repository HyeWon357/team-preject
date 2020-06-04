package com.javalec.ex.controller;

import javax.servlet.http.HttpServletRequest;

import org.apache.ibatis.session.SqlSession;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import com.javalec.ex.Dao.NDao;

@Controller
public class CustomerController {
	
	@Autowired
	SqlSession sqlSession;
	
	
	
	//공지사항
	@RequestMapping("main/main")
	public String main(Model model) {
		
		return "main/main";
	}
	
	@RequestMapping("cus/notice_list")
	public String notice_list(Model model) {
		
		NDao dao = sqlSession.getMapper(NDao.class);
		model.addAttribute("notice_list", dao.notice_list());
		return "cus/notice_list";
	}
	
	@RequestMapping("cus/notice_content")
	public String notice_content(HttpServletRequest request, Model model) {
		
		NDao dao = sqlSession.getMapper(NDao.class);
		dao.upHit(request.getParameter("hNnum"));
		model.addAttribute("notice_content",dao.notice_content(request.getParameter("hNnum")));
		return "cus/notice_content";
	}
	
	
	
	//1:1문의
	@RequestMapping("mypage/notice_list")
	public String inquiry_list(Model model) {
		
		return "mypage/notice_list";
	}
	
	@RequestMapping("mypage/inquiry_content")
	public String inquiry_content(Model model) {
		
		return "mypage/inquiry_content";
	}
	
	@RequestMapping("cus/inquiry_write")
	public String inquiry_write (Model model) {
		
		return "cus/inquiry_write";
	}
	
	@RequestMapping("mypage/inquiry_write2")
	public String inquiry_write2(Model model) {
		
		return "mypage/inquiry_write2";
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
