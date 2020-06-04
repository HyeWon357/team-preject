package com.javalec.ex.controller;

import javax.servlet.http.HttpServletRequest;

import org.apache.ibatis.session.SqlSession;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import com.javalec.ex.Dao.AdminDao;
import com.javalec.ex.Dto.NDto;

@Controller
public class AdminController {
	
	
	@Autowired
	SqlSession sqlSession;
	
	
	//공지사항
	@RequestMapping("admin/admin_noticelist")
	public String admin_noticelist(Model model) {
		
		AdminDao dao = sqlSession.getMapper(AdminDao.class);
		model.addAttribute("admin_noticelist", dao.admin_noticelist());
		return"admin/admin_noticelist";
	}
	
	@RequestMapping("admin/admin_noticecontent")
	public String admin_noticecontent(HttpServletRequest request, Model model) {
		
		AdminDao dao = sqlSession.getMapper(AdminDao.class);
		model.addAttribute("admin_noticecontent", dao.admin_noticecontent(request.getParameter("hNnum")));
		//관리자에서 uphit은 제외.
		return "admin/admin_noticecontent";
	}
	
	@RequestMapping("admin/admin_noticewrite")
	public String admin_noticewrite(Model model) {
		
		return "admin/admin_noticewrite";
	}
	
	@RequestMapping("admin/noticewrite")
	public String noticewrite(NDto ndto, Model model) {
		
		AdminDao dao = sqlSession.getMapper(AdminDao.class);
		dao.noticewrite(ndto.gethNname(), ndto.gethNtitle(),ndto.gethNcontent());
		return "redirect:admin_noticelist";
	}
	
	@RequestMapping("admin/noticedelete")
	public String noticedelete(HttpServletRequest request, Model model) {
		
		AdminDao dao = sqlSession.getMapper(AdminDao.class);
		dao.noticedelete(request.getParameter("hNnum"));
		return "redirect:admin_noticelist";
	}
	
	@RequestMapping("admin/admin_noticemodify")
	public String admin_noticemodify(HttpServletRequest request, Model model) {
		
		AdminDao dao = sqlSession.getMapper(AdminDao.class);
		model.addAttribute("admin_noticemodify", dao.admin_noticemodify(request.getParameter("hNnum")));
		return "admin/admin_noticemodify";
	}
	
	@RequestMapping("admin/noticemodify")
	public String noticemodify(NDto ndto, Model model) {
		
		AdminDao dao = sqlSession.getMapper(AdminDao.class);
		dao.noticemodify(ndto.gethNtitle(), ndto.gethNcontent(), ndto.gethNnum());
		return "redirect:admin_noticelist";
	}
	
	
	
	//1:1문의
	@RequestMapping("admin/admin_inquirylist")
	public String admin_inquirylist(Model model) {
		
		return "admin/admin_inquirylist";
	}
	
	@RequestMapping("admin/admin_inquirycontent")
	public String admin_inquirycontent(Model model) {
		
		return "admin/admin_inquirycontent";
	}
	
	@RequestMapping("admin/admin_inquirywrite")
	public String admin_inquirywrite(Model model) {
		
		return "admin/admin_inquirywrite";
	}
	
	
	
	
	@RequestMapping("admin/admin_faqlist")
	public String admin_faqlist(Model model) {
		
		return "admin/admin_faqlist";
	}
	
	@RequestMapping("admin/admin_faqwrite")
	public String admin_faqwrite(Model model) {
		
		return "admin/admin_faqwrite";
	}
	
}
