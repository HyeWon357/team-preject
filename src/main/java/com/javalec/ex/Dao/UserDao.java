package com.javalec.ex.Dao;

import java.util.ArrayList;
import java.util.List;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.web.multipart.MultipartFile;

import com.javalec.ex.Dto.FDto;
import com.javalec.ex.Dto.IDto;
import com.javalec.ex.Dto.InquiryRDto;
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
	public void Uinquirywrite(String hIid, String hItitle, String hIcontent, String hIfile);
	public void inquiry_delete(String hInum);
	public IDto inquiry_modify(String hInum);
	public void inquirymodify(String hItitle, String hIcontent, String hIfile, int hInum);
	public ArrayList<InquiryRDto> reply_list();
	
	//Faq
	public ArrayList<FDto> faq_list();
}
