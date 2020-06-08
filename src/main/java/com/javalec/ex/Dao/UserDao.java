package com.javalec.ex.Dao;

import java.util.ArrayList;

import com.javalec.ex.Dto.FDto;
import com.javalec.ex.Dto.IDto;
import com.javalec.ex.Dto.NDto;

public interface UserDao {
	
	//공지사항
	public ArrayList<NDto> notice_list();
	public NDto notice_content(String hNnum);
	public void notice_upHit(String hNnum);
	
	//1:1문의
	public ArrayList<IDto> inquiry_list();
	public IDto inquiry_content(String hInum);
	public IDto inquiry_write (int hInum); //customer
	public IDto inquiry_write2 (int hInum); //mypage
	public void Uinquirywrite(String hIname, String hItitle, String content);
	
	//Faq
	public ArrayList<FDto> faq_list();
}
