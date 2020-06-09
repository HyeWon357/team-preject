package com.javalec.ex.controller;

import javax.servlet.http.HttpServletRequest;

import org.apache.ibatis.session.SqlSession;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import com.javalec.ex.Dao.PrizeDao;

@Controller
public class PrizeController {
	
	@Autowired
	private SqlSession sqlSession;
	
	@RequestMapping("event/prize")
	public String prize(Model model) {
		PrizeDao pda = sqlSession.getMapper(PrizeDao.class);
		model.addAttribute("plist",pda.plist());
		return "event/prize";
	}
	
	@RequestMapping("event/prize_view")
	public String prize_view(HttpServletRequest request,Model model) {
		PrizeDao pda = sqlSession.getMapper(PrizeDao.class);
		
		//내용
		pda.pUpHit(Integer.parseInt(request.getParameter("prize_id")));
		model.addAttribute("prize_view",pda.prize_view(Integer.parseInt(request.getParameter("prize_id"))));
		
		//이전글,다음글
		model.addAttribute("prize_prev",pda.prize_prev(Integer.parseInt(request.getParameter("prize_id"))));
		model.addAttribute("prize_next",pda.prize_next(Integer.parseInt(request.getParameter("prize_id"))));
		return "event/prize_view";
	}
}
