package com.javalec.ex.controller;

import java.io.BufferedReader;
import java.io.File;
import java.io.IOException;
import java.io.UnsupportedEncodingException;
import java.security.Principal;
import java.util.ArrayList;
import java.util.Enumeration;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.UUID;

import javax.print.attribute.standard.PrinterInfo;
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletInputStream;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

import org.apache.ibatis.session.SqlSession;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cglib.core.DefaultNamingPolicy;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpMethod;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.util.MultiValueMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.multipart.MultipartFile;
import org.springframework.web.multipart.MultipartHttpServletRequest;
import org.springframework.web.multipart.MultipartRequest;

import com.javalec.ex.Dao.AdminEventDao;
import com.javalec.ex.Dto.EventDto;
//import com.oreilly.servlet.multipart.DefaultFileRenamePolicy;

@Controller
public class AdminEventController {
	@Autowired
	private SqlSession sqSession;
	
	//이벤트 리스트 출력
	@RequestMapping("event/adminEvent")
	public String adminEvent(HttpServletRequest request,Model model) {
		AdminEventDao aeda = sqSession.getMapper(AdminEventDao.class);
		model.addAttribute("adminEList", aeda.adminEList());
		return "event/adminEvent";
	}
	
	//이벤트 내용
	@RequestMapping("event/adminEventContent")
	public String adminEventContent(HttpServletRequest request,Model model) {
		AdminEventDao aeda = sqSession.getMapper(AdminEventDao.class);
		
		//내용
		model.addAttribute("adminEContent",aeda.adminEContent(Integer.parseInt(request.getParameter("event_id"))));
		
		//이전글,다음글
		model.addAttribute("event_prev",aeda.event_prev(Integer.parseInt(request.getParameter("event_id"))));
		model.addAttribute("event_next",aeda.event_next(Integer.parseInt(request.getParameter("event_id"))));
		
		//댓글
		model.addAttribute("count",aeda.eRcount(Integer.parseInt(request.getParameter("event_id"))));
		model.addAttribute("eRlist",aeda.eRlist(Integer.parseInt(request.getParameter("event_id"))));
		return "event/adminEventContent";
	}
	
	//이벤트 작성
	@RequestMapping("event/adminEventW")
	public String adminEventW(HttpServletRequest request,Model model) {
		return "event/adminEventW";
	}
//	@RequestMapping("event/eventWrite")
//	public String eventWrite(HttpServletRequest request,MultipartRequest multi,EventDto edt,Model model) {
//		AdminEventDao aeda = sqSession.getMapper(AdminEventDao.class);
//		int size=10*1024*1024;
//		String path=request.getRealPath("/upload");
//		
//		aeda.eventWrite(edt);
//		return "redirect:adminEvent";
//	}
	
	@RequestMapping("event/eventWrite")
	public String eventWrite(HttpServletRequest request,
			@RequestParam("event_image1") MultipartFile multi,
			@RequestParam("event_image2") MultipartFile multi2,
			String admin, String event_title, String event_content, String event_startDate,
			String event_endDate
			,Model model) throws IllegalStateException, IOException {
		
		AdminEventDao aeda = sqSession.getMapper(AdminEventDao.class);
		
		//int size=10*1024*1024;
		//String path=request.getRealPath("/upload");


		String save_path = "C:\\upload\\";
		String prefix_url = "/upload/";
		ArrayList<MultipartFile> mlist = new ArrayList<MultipartFile>();
		ArrayList<String> urlList = new ArrayList<String>();
		mlist.add(multi);
		mlist.add(multi2);
				
		for(MultipartFile mf: mlist)
		{
			String url;
			String fileExtension = mf.getOriginalFilename().substring(mf.getOriginalFilename().lastIndexOf("."));
			String storedFileName = UUID.randomUUID().toString().replaceAll("-", "") + fileExtension;
			//파일 업로드하는거
			File file = new File(save_path + storedFileName);
			mf.transferTo(file);
			urlList.add(prefix_url + storedFileName);
		}

		
		System.out.println(urlList.get(0));
		System.out.println(urlList.get(1));
		
		EventDto edt = new EventDto();
		edt.setAdmin(admin);
		edt.setEvent_title(event_title);
		edt.setEvent_content(event_content);
		edt.setEvent_startDate(event_startDate);
		edt.setEvent_endDate(event_endDate);
		edt.setEvent_image1(urlList.get(0));
		edt.setEvent_image2(urlList.get(1));
		
		aeda.eventWrite(edt);
		return "redirect:adminEvent";
	}
	
	
	//이벤트 삭제
	@RequestMapping("event/adminEventD")
	public String adminEventD(HttpServletRequest request,Model model) {
		AdminEventDao aeda = sqSession.getMapper(AdminEventDao.class);
		aeda.eventDelete(Integer.parseInt(request.getParameter("event_id")));
		return "redirect:adminEvent";
	}
	
	//이벤트 수정
	@RequestMapping("event/adminEventM")
	public String adminEventM(HttpServletRequest request,Model model) {
		AdminEventDao aeda = sqSession.getMapper(AdminEventDao.class);
		model.addAttribute("adminEventM",aeda.adminEventM(Integer.parseInt(request.getParameter("event_id"))));
		return "event/adminEventM";
	}
	@RequestMapping("event/eventModify")
	public String eventModify(EventDto edt,Model model) {
		AdminEventDao aeda = sqSession.getMapper(AdminEventDao.class);
		aeda.eventModify(edt);
		return "redirect:adminEvent";
	}
}
