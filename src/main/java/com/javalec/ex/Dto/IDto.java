package com.javalec.ex.Dto;

import java.sql.Timestamp;

public class IDto {
	
	int hInum;
	String hIname;
	String hItitle;
	String hIcontent;
	String hIfile;
	Timestamp hIday;
	String hIstep;
	
	public IDto() {
		
	}
	
	public IDto(int hInum, String hIname, String hItitle, String hIcontent, String hIfile, Timestamp hIday, String hIstep) {
		
		this.hInum = hInum;
		this.hIname = hIname;
		this.hItitle = hItitle;
		this.hIcontent = hIcontent;
		this.hIfile = hIfile;
		this.hIday = hIday;
		this.hIstep = hIstep;
	}

	public int gethInum() {
		return hInum;
	}

	public void sethInum(int hInum) {
		this.hInum = hInum;
	}

	public String gethIname() {
		return hIname;
	}

	public void sethIname(String hIname) {
		this.hIname = hIname;
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

	public String gethIstep() {
		return hIstep;
	}

	public void sethIstep(String hIstep) {
		this.hIstep = hIstep;
	}
	
}
