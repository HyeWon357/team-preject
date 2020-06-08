package com.javalec.ex.controller;

import javax.servlet.http.HttpServletRequest;

import org.apache.ibatis.session.SqlSession;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import com.javalec.ex.dao.AdminPrizeDao;
import com.javalec.ex.dto.PrizeDto;

@Controller
public class AdminPrizeController {
	
	@Autowired
	private SqlSession sqlSession;
	
	//당첨자 발표 목록
	@RequestMapping("event/adminPrize")
	public String adminPrize(HttpServletRequest request,Model model) {
		AdminPrizeDao apda = sqlSession.getMapper(AdminPrizeDao.class);
		model.addAttribute("adminPList",apda.adminPList());
		return "event/adminPrize";
	}
	
	//당첨자 발표 내용
	@RequestMapping("event/adminPContent")
	public String adminPContent(HttpServletRequest request,Model model) {
		AdminPrizeDao apda = sqlSession.getMapper(AdminPrizeDao.class);
		model.addAttribute("adminPContent",apda.adminPContent(Integer.parseInt(request.getParameter("prize_id"))));
		
		//이전글,다음글
		model.addAttribute("prize_prev",apda.prize_prev(Integer.parseInt(request.getParameter("prize_id"))));
		model.addAttribute("prize_next",apda.prize_next(Integer.parseInt(request.getParameter("prize_id"))));
		return "event/adminPContent";
	}
	
	//당첨자 발표 작성
	@RequestMapping("event/adminPrizeW")
	public String adminPrizeW(HttpServletRequest request,Model model) {
		return "event/adminPrizeW";
	}
	@RequestMapping("event/prizeWrite")
	public String prizeWrite(PrizeDto pdt,Model model) {
		AdminPrizeDao apda = sqlSession.getMapper(AdminPrizeDao.class);
		apda.prizeWrite(pdt);
		return "redirect:adminPrize";
	}
	
	//당첨자 발표 삭제
	@RequestMapping("event/prizeDelete")
	public String prizeDelete(HttpServletRequest request,Model model) {
		AdminPrizeDao apda = sqlSession.getMapper(AdminPrizeDao.class);
		apda.prizeDelete(Integer.parseInt(request.getParameter("prize_id")));
		return "redirect:adminPrize";
	}
	
	
	//당첨자 발표 수정
	@RequestMapping("event/adminPrizeM")
	public String adminPrizeM(HttpServletRequest request,Model model) {
		AdminPrizeDao apda = sqlSession.getMapper(AdminPrizeDao.class);
		model.addAttribute("adminPrizeM",apda.adminPrizeM(Integer.parseInt(request.getParameter("prize_id"))));
		return "event/adminPrizeM";
	}
	@RequestMapping("event/prizeModify")
	public String prizeModify(PrizeDto pdt,Model model) {
		AdminPrizeDao apda = sqlSession.getMapper(AdminPrizeDao.class);
		apda.prizeModify(pdt);
		return "redirect:adminPrize";
	}
	
}
