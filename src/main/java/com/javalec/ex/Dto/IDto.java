package com.javalec.ex.Dto;

import java.sql.Timestamp;
import java.util.List;

import org.springframework.web.multipart.MultipartFile;

public class IDto {
	
	int hInum;
	String hid;
	String hItitle;
	String hIcontent;
	String hIfile;
	Timestamp hIday;

	public IDto() {
		
	}
	
	public IDto(int hInum, String hid, String hItitle, String hIcontent, String hIfile, Timestamp hIday) {
		this.hInum = hInum;
		this.hid = hid;
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

	public String gethid() {
		return hid;
	}

	public void sethid(String hid) {
		this.hid = hid;
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

	
}
