package com.javalec.ex.Dao;

import java.util.ArrayList;

import com.javalec.ex.Dto.NDto;

public interface AdminDao {
	
	public ArrayList<NDto> admin_noticelist();
	public NDto admin_noticecontent(String hNnum);
	public NDto admin_noticewrite(int hNnum);
	public void noticewrite(String hNname, String hNtitle, String hNcontent);
	public void noticedelete(String hNnum);
	public NDto admin_noticemodify(String hNnum);
	public void noticemodify(String hNtitle, String hNcontent, int hNnum);
}
