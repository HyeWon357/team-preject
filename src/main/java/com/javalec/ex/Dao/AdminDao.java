package com.javalec.ex.Dao;

import java.util.ArrayList;

import com.javalec.ex.Dto.FDto;
import com.javalec.ex.Dto.IDto;
import com.javalec.ex.Dto.NDto;

public interface AdminDao {
	
	//공지사항
	public ArrayList<NDto> admin_noticelist();
	public NDto admin_noticecontent(String hNnum);
	public NDto admin_noticewrite(int hNnum);
	public void noticewrite(String hNname, String hNtitle, String hNcontent);
	public void noticedelete(String hNnum);
	public NDto admin_noticemodify(String hNnum);
	public void noticemodify(String hNtitle, String hNcontent, int hNnum);
	
	//1:1문의
	public ArrayList<IDto> admin_inquirylist();
	public IDto admin_inquirycontent(String hInum);
	
	//faq
	public ArrayList<FDto> admin_faqlist();
	public FDto admin_faqcontent(String hFnum);
	public FDto admin_faqwrite(int hFnum);
	public void faqwrite(String hFname, String hFtitle, String hFcontent);
	public void faqdelete(String hFnum);
	public FDto admin_faqmodify(String hFnum);
	public void faqmodify(String hFtitle, String hFcontent, int hFnum);
}
