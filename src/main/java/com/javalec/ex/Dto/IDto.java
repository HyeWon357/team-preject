package com.javalec.ex.Dto;

import java.sql.Timestamp;
import java.util.List;

import org.springframework.web.multipart.MultipartFile;

public class IDto {
	
	int hInum;
	String hIid;
	String hItitle;
	String hIcontent;
	String hIfile;
	Timestamp hIday;
	int hIgroup;
	int hIindent;

	public IDto() {
		
	}
	
	public IDto(int hInum, String hIid, String hItitle, String hIcontent, String hIfile, Timestamp hIday) {
		this.hInum = hInum;
		this.hIid = hIid;
		this.hItitle = hItitle;
		this.hIcontent = hIcontent;
		this.hIfile = hIfile;
		this.hIday = hIday;
	}
	
	public int gethInum() {
		return hInum;
	}

	public void sethInum(int hInum) {
		this.hInum = hInum;
	}

	public String gethIid() {
		return hIid;
	}

	public void sethIid(String hIid) {
		this.hIid = hIid;
	}
	
	public String gethItitle() {
		return hItitle;
	}

	public void sethItitle(String hItitle) {
		this.hItitle = hItitle;
	}

	public String gethIcontent() {
		return hIcontent;
	}

	public void sethIcontent(String hIcontent) {
		this.hIcontent = hIcontent;
	}

	public String gethIfile() {
		return hIfile;
	}

	public void sethIfile(String hIfile) {
		this.hIfile = hIfile;
	}

	public Timestamp gethIday() {
		return hIday;
	}

	public void sethIday(Timestamp hIday) {
		this.hIday = hIday;
	}

	public int gethIgroup() {
		return hIgroup;
	}

	public void sethIgroup(int hIgroup) {
		this.hIgroup = hIgroup;
	}

	public int gethIindent() {
		return hIindent;
	}

	public void sethIindent(int hIindent) {
		this.hIindent = hIindent;
	}

	
}
