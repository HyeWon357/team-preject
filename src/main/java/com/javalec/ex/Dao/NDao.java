package com.javalec.ex.Dao;

import java.util.ArrayList;

import com.javalec.ex.Dto.NDto;

public interface NDao {
	
	public ArrayList<NDto> notice_list();
	public NDto  notice_content(String hNnum);
	public void upHit(String hNnum);
	
	
}
