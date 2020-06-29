package com.javalec.ex.controller;

import java.io.File;
import java.security.Provider.Service;
import java.text.SimpleDateFormat;
import java.util.List;
import java.util.Random;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

import org.apache.ibatis.session.SqlSession;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.multipart.MultipartFile;
import org.springframework.web.servlet.mvc.condition.ProducesRequestCondition;

import com.javalec.ex.Dao.AdminDao;
import com.javalec.ex.Dao.UserDao;
import com.javalec.ex.Dto.IDto;
import com.javalec.ex.Dto.InquiryRDto;
import com.javalec.ex.Dto.NDto;

@Controller
public class UserCustomerController {

	@Autowired
	SqlSession sqlSession;
	
	@RequestMapping("main/main")
	public String main(Model model) {

		return "main/main";
	}

	// 공지사항
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
		model.addAttribute("notice_content", dao.notice_content(request.getParameter("hNnum")));
		
		//이전글, 다음글
		model.addAttribute("notice_prev", dao.notice_prev(Integer.parseInt(request.getParameter("hNnum"))));
		model.addAttribute("notice_next", dao.notice_next(Integer.parseInt(request.getParameter("hNnum"))));
		
		return "cus/notice_content";
	}
	

	// 1:1문의
	@RequestMapping("cus/inquiry_list")
	public String inquiry_list(Model model) {

		UserDao dao = sqlSession.getMapper(UserDao.class);
		model.addAttribute("inquiry_list", dao.inquiry_list());
		return "cus/inquiry_list";
	}

	@RequestMapping("cus/inquiry_content")
	public String inquiry_content(HttpServletRequest request, Model model) {

		UserDao dao = sqlSession.getMapper(UserDao.class);
		model.addAttribute("inquiry_content", dao.inquiry_content(request.getParameter("hInum")));
		return "cus/inquiry_content";
	}
	
	@RequestMapping("cus/reply_list")
	@ResponseBody // json데이터로 페이지 리턴
	public List<InquiryRDto> reply_list(int hRcnum) {
		
		UserDao dao = sqlSession.getMapper(UserDao.class);
		return dao.reply_list(hRcnum);
	}

	@RequestMapping("cus/inquiry_write")
	public String inquiry_write(IDto idto, Model model) {

		return "cus/inquiry_write";
	}

	@RequestMapping("cus/Uinquirywrite")
	public String Uinquirywrite(String hid, String hItitle, String hIcontent, MultipartFile hIfile, Model model) throws Exception {
		
		String path = "C:/workpace/Project/src/main/webapp/uploadFile/";
		String save = hIfile.getOriginalFilename();
		
		//파일이 없을시 폴더를 만들기
		File dirpath = new File(path);
		if(!dirpath.exists()) {
			dirpath.mkdirs();
		}
		
		hIfile.transferTo(new File(path + save));
		
		IDto idto = new IDto();
		idto.sethid(hid);
		idto.sethItitle(hItitle);
		idto.sethIcontent(hIcontent);
		idto.sethIfile(save);
		
		UserDao dao = sqlSession.getMapper(UserDao.class);
		dao.Uinquirywrite(idto.gethid(), idto.gethItitle(), idto.gethIcontent(), idto.gethIfile());
		return "redirect:inquiry_list";
	}
	
	@RequestMapping("cus/inquiry_delete")
	public String inquiry_delete(HttpServletRequest request, Model model) {
		
		UserDao dao = sqlSession.getMapper(UserDao.class);
		dao.inquiry_delete(request.getParameter("hInum"));
		return "redirect:inquiry_list";
	}
	
	@RequestMapping("cus/inquiry_modify")
	public String inquiry_modify(HttpServletRequest request, Model model) {

		UserDao dao = sqlSession.getMapper(UserDao.class);
		model.addAttribute("inquiry_modify", dao.inquiry_modify(request.getParameter("hInum")));
		return "cus/inquiry_modify";
	}
	
//	@RequestMapping("cus/inquirymodify")
//	public String inquirymodify(String hItitle, String hIcontent, MultipartFile hIfile, int hInum, Model model) throws Exception {
//		
//		String path = "C:/workpace/Project/src/main/webapp/uploadFile/";
//		String save = hIfile.getOriginalFilename();
//		
//		//파일이 없을시 폴더를 만들기
//		File dirpath = new File(path);
//		if(!dirpath.exists()) {
//			dirpath.mkdirs();
//		}
//		
//		hIfile.transferTo(new File(path + save));
//		
//		IDto idto = new IDto();
//		idto.sethItitle(hItitle);
//		idto.sethIcontent(hIcontent);
//		idto.sethIfile(save);
//		
//		
//		UserDao dao = sqlSession.getMapper(UserDao.class);
//		dao.inquirymodify(idto.gethItitle(), idto.gethIcontent(), idto.gethIfile(), idto.gethInum());
//		return "redirect:inquiry_list";
//	}
	

	
	// FAQ
	@RequestMapping("cus/faq_list")
	public String faq_list(Model model) {

		UserDao dao = sqlSession.getMapper(UserDao.class);
		model.addAttribute("faq_list", dao.faq_list());
		return "cus/faq_list";
	}

	
	
	// 이용안내
	@RequestMapping("cus/guide")
	public String guide(Model model) {

		return "cus/guide";
	}
	
	
	
	

}
