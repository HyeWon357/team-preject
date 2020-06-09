package com.javalec.ex.Dto;

public class FDto {
	
	int hFnum;
	String hFname;
	String hFtitle;
	String hFcontent;
	
	public FDto() {
		
	}
	
	public FDto(int hFnum, String hFname, String hFtitle, String hFcontent) {
		
		this.hFnum = hFnum;
		this.hFname = hFname;
		this.hFtitle = hFtitle;
		this.hFcontent = hFcontent;
	}

	public int gethFnum() {
		return hFnum;
	}

	public void sethFnum(int hFnum) {
		this.hFnum = hFnum;
	}

	public String gethFname() {
		return hFname;
	}

	public void sethFname(String hFname) {
		this.hFname = hFname;
	}

	public String gethFtitle() {
		return hFtitle;
	}

	public void sethFtitle(String hFtitle) {
		this.hFtitle = hFtitle;
	}

	public String gethFcontent() {
		return hFcontent;
	}

	public void sethFcontent(String hFcontent) {
		this.hFcontent = hFcontent;
	}
	
	
}
