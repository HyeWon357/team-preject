package com.javalec.ex.controller;

import javax.servlet.http.HttpServletRequest;

import org.apache.ibatis.session.SqlSession;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import com.javalec.ex.dao.EventDao;
import com.javalec.ex.dao.EventReplyDao;
import com.javalec.ex.dto.EventDto;
import com.javalec.ex.dto.Event_replyDto;

@Controller
public class EventController {
	
	@Autowired
	private SqlSession sqlSession;
	
	//이벤트 목록
	@RequestMapping("event/event")
	public String event(HttpServletRequest request,Model model) {
		EventDao eda = sqlSession.getMapper(EventDao.class);
		model.addAttribute("elist",eda.elist());
		return "event/event";
	}
	
	//이벤트 내용
	@RequestMapping("event/event_view")
	public String event_view(HttpServletRequest request,EventDto edt,Model model) {
		EventDao eda = sqlSession.getMapper(EventDao.class);
		
		//내용
		eda.eUpHit(Integer.parseInt(request.getParameter("event_id")));
		model.addAttribute("event_view",eda.event_view(Integer.parseInt(request.getParameter("event_id"))));
		
		//이전글,다음글
		model.addAttribute("event_prev",eda.event_prev(Integer.parseInt(request.getParameter("event_id"))));
		model.addAttribute("event_next",eda.event_next(Integer.parseInt(request.getParameter("event_id"))));
		
		//댓글
		model.addAttribute("count",eda.eRcount(Integer.parseInt(request.getParameter("event_id"))));
		model.addAttribute("eRlist",eda.eRlist(Integer.parseInt(request.getParameter("event_id"))));
		return "event/event_view";
	}
	
	@RequestMapping("event/close_event")
	public String close_event(HttpServletRequest request,Model model) {
		EventDao eda = sqlSession.getMapper(EventDao.class);
		model.addAttribute("elist",eda.elist());
		return "event/close_event";
	}
	@RequestMapping("event/close_event_view")
	public String close_event_view() {
		return "event/close_event_view";
	}
	
}
