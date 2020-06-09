package com.javalec.ex.controller;

import javax.servlet.http.HttpServletRequest;

import org.apache.ibatis.session.SqlSession;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import com.javalec.ex.Dao.EventDao;
import com.javalec.ex.Dao.EventReplyDao;
import com.javalec.ex.Dto.EventDto;
import com.javalec.ex.Dto.Event_replyDto;

@Controller
public class EventReplyController {
	@Autowired
	private SqlSession sqlSession;
	
	//댓글 작성
	@RequestMapping("event/eventReplyW")
	public String eventReplyW(Event_replyDto erdt,Model model) {
		EventReplyDao erda = sqlSession.getMapper(EventReplyDao.class);
		erda.eventReplyW(erdt);
		int content = erdt.getEvent_id();
		return "redirect:event_view?event_id="+content;
	}
	
	//댓글 삭제
	@RequestMapping("event/eventReplyD")
	public String eventReplyD(Event_replyDto erdt,Model model) {
		EventReplyDao erda = sqlSession.getMapper(EventReplyDao.class);
		erda.eventReplyD(erdt.getEventReply_id());
		int content = erdt.getEvent_id();
		return "redirect:event_view?event_id="+content;
	}
}
