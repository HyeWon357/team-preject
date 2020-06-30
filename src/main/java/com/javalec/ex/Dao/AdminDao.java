package com.javalec.ex.Dao;

import java.awt.List;
import java.util.ArrayList;

import com.javalec.ex.Dto.FDto;
import com.javalec.ex.Dto.IDto;
import com.javalec.ex.Dto.InquiryRDto;
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
	
	//이전글, 다음글
	public NDto notice_prev(int hNnum);
	public NDto notice_next(int hNnum);
	
	//1:1문의
	public ArrayList<IDto> admin_inquirylist();
	public IDto admin_inquirycontent(String hInum);
	public ArrayList<InquiryRDto> reply_list(int hRcnum); //댓글 리스트 보기
	public void reply_write(InquiryRDto Rdto);
	public void reply_delete(InquiryRDto Rdto);
	public InquiryRDto admin_inquiryReply_modify(String hRnum);
	public void replymodify(String hRcontent, int hRcnum);
	
	//이전글, 다음글
	public IDto inquiry_prev(int hInum);
	public IDto inquiry_next(int hInum);
	
	
	//faq
	public ArrayList<FDto> admin_faqlist();
	public FDto admin_faqcontent(String hFnum);
	public FDto admin_faqwrite(int hFnum);
	public void faqwrite(String hFname, String hFtitle, String hFcontent);
	public void faqdelete(String hFnum);
	public FDto admin_faqmodify(String hFnum);
	public void faqmodify(String hFtitle, String hFcontent, int hFnum);
	
	
}
