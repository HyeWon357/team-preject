package com.javalec.ex.controller;

import java.awt.Image;
import java.sql.Timestamp;
import java.util.List;
import java.text.SimpleDateFormat;
import java.util.Calendar;

import javax.servlet.http.HttpServletRequest;

import org.apache.ibatis.session.SqlSession;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.dao.support.DaoSupport;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.javalec.ex.Dao.AdminDao;
import com.javalec.ex.Dto.FDto;
import com.javalec.ex.Dto.InquiryRDto;
import com.javalec.ex.Dto.NDto;

@Controller
public class AdminCustomerController {

	@Autowired
	SqlSession sqlSession;

	// 공지사항
	@RequestMapping("admin/admin_noticelist")
	public String admin_noticelist(Model model) {

		AdminDao dao = sqlSession.getMapper(AdminDao.class);
		model.addAttribute("admin_noticelist", dao.admin_noticelist());
		return "admin/admin_noticelist";
	}

	@RequestMapping("admin/admin_noticecontent")
	public String admin_noticecontent(HttpServletRequest request, Model model) {

		AdminDao dao = sqlSession.getMapper(AdminDao.class);
		model.addAttribute("admin_noticecontent", dao.admin_noticecontent(request.getParameter("hNnum")));
		// 관리자에서 uphit은 제외.

		// 이전글, 다음글
		model.addAttribute("notice_prev", dao.notice_prev(Integer.parseInt(request.getParameter("hNnum"))));
		model.addAttribute("notice_next", dao.notice_next(Integer.parseInt(request.getParameter("hNnum"))));

		return "admin/admin_noticecontent";
	}

	@RequestMapping("admin/admin_noticewrite")
	public String admin_noticewrite(Model model) {

		return "admin/admin_noticewrite";
	}

	@RequestMapping("admin/noticewrite")
	public String noticewrite(NDto ndto, Model model) {

		AdminDao dao = sqlSession.getMapper(AdminDao.class);
		dao.noticewrite(ndto.gethNname(), ndto.gethNtitle(), ndto.gethNcontent());
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
	
	

	// 1:1문의
	@RequestMapping("admin/admin_inquirylist")
	public String admin_inquirylist(Model model) {

		AdminDao dao = sqlSession.getMapper(AdminDao.class);
		model.addAttribute("admin_inquirylist", dao.admin_inquirylist());
		return "admin/admin_inquirylist";
	}

	@RequestMapping("admin/admin_inquirycontent")
	public String admin_inquirycontent(HttpServletRequest request, Model model) {

		AdminDao dao = sqlSession.getMapper(AdminDao.class);
		
		// 이전글, 다음글
		model.addAttribute("inquiry_prev", dao.inquiry_prev(Integer.parseInt(request.getParameter("hInum"))));
		model.addAttribute("inquiry_next", dao.inquiry_next(Integer.parseInt(request.getParameter("hInum"))));
		model.addAttribute("admin_inquirycontent", dao.admin_inquirycontent(request.getParameter("hInum")));
		return "admin/admin_inquirycontent";
	}

	@RequestMapping("admin/reply_list")
	@ResponseBody // json데이터로 페이지 리턴
	public List<InquiryRDto> reply_list(@RequestParam(value="hRcnum") int hRcnum) {
		
		AdminDao dao = sqlSession.getMapper(AdminDao.class);
		return dao.reply_list(hRcnum);
	}
	
	@RequestMapping("admin/reply_write")
	@ResponseBody
	public String reply_write(@ModelAttribute InquiryRDto Rdto) {
		
		AdminDao dao = sqlSession.getMapper(AdminDao.class);
		dao.reply_write(Rdto);
		return "success";
	}
	
	@RequestMapping("admin/reply_delete")
	@ResponseBody
	public String reply_delete(@ModelAttribute InquiryRDto Rdto) {
		
		AdminDao dao = sqlSession.getMapper(AdminDao.class);
		dao.reply_delete(Rdto);
		return "success";
	}
	
	@RequestMapping("admin/admin_inquiryReply_modify")
	public String admin_inquiryReply_modify(HttpServletRequest request, Model model) {
		
		AdminDao dao = sqlSession.getMapper(AdminDao.class);
		model.addAttribute("admin_inquiryReply_modify", dao.admin_inquiryReply_modify(request.getParameter("hRnum")));
		System.out.println("hRnum: " + request.getParameter("hRnum"));
		return "admin/admin_inquiryReply_modify";
	}
	
	@RequestMapping("admin/replymodify")
	public String replymodify (InquiryRDto Rdto, Model model) {
		
		AdminDao dao = sqlSession.getMapper(AdminDao.class);
		dao.replymodify(Rdto.gethRcontent(), Rdto.gethRcnum());
		return "redirect:admin_inquirylist";
	}
	
	
	// faq
	@RequestMapping("admin/admin_faqlist")
	public String admin_faqlist(Model model) {

		AdminDao dao = sqlSession.getMapper(AdminDao.class);
		model.addAttribute("admin_faqlist", dao.admin_faqlist());
		return "admin/admin_faqlist";
	}

	@RequestMapping("admin/admin_faqcontent")
	public String admin_faqcontent(HttpServletRequest request, Model model) {

		AdminDao dao = sqlSession.getMapper(AdminDao.class);
		model.addAttribute("admin_faqcontent", dao.admin_faqcontent(request.getParameter("hFnum")));
		return "admin/admin_faqcontent";
	}

	@RequestMapping("admin/admin_faqwrite")
	public String admin_faqwrite(Model model) {

		return "admin/admin_faqwrite";
	}

	@RequestMapping("admin/faqwrite")
	public String faqwrite(FDto fdto, Model model) {

		AdminDao dao = sqlSession.getMapper(AdminDao.class);
		dao.faqwrite(fdto.gethFname(), fdto.gethFtitle(), fdto.gethFcontent());
		return "redirect:admin_faqlist";
	}

	@RequestMapping("admin/faqdelete")
	public String faqdelete(HttpServletRequest request, Model model) {

		AdminDao dao = sqlSession.getMapper(AdminDao.class);
		dao.faqdelete(request.getParameter("hFnum"));
		return "redirect:admin_faqlist";
	}

	@RequestMapping("admin/admin_faqmodify")
	public String admin_faqmodify(HttpServletRequest request, Model model) {

		AdminDao dao = sqlSession.getMapper(AdminDao.class);
		model.addAttribute("admin_faqmodify", dao.admin_faqmodify(request.getParameter("hFnum")));
		return "admin/admin_faqmodify";
	}

	@RequestMapping("admin/faqmodify")
	public String faqmodify(FDto fdto, Model model) {

		AdminDao dao = sqlSession.getMapper(AdminDao.class);
		dao.faqmodify(fdto.gethFtitle(), fdto.gethFcontent(), fdto.gethFnum());
		return "redirect:admin_faqlist";
	}

}
