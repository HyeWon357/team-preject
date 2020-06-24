package com.javalec.ex.Dto;

import java.sql.Timestamp;

public class InquiryRDto {
	
	int hRnum;
	int hRcnum;
	String hRcontent;
	String hRname;
	Timestamp hRday;
	
	public InquiryRDto() {
		
	}
	
	public InquiryRDto(int hRnum, int hRcnum, String hRcontent, String hRname, Timestamp hRday){
		this.hRnum = hRnum;
		this.hRcnum = hRcnum;
		this.hRcontent = hRcontent;
		this.hRname = hRname;
		this.hRday = hRday;
	}

	public int gethRnum() {
		return hRnum;
	}

	public void sethRnum(int hRnum) {
		this.hRnum = hRnum;
	}

	public int gethRcnum() {
		return hRcnum;
	}

	public void sethRcnum(int hRcnum) {
		this.hRcnum = hRcnum;
	}

	public String gethRcontent() {
		return hRcontent;
	}

	public void sethRcontent(String hRcontent) {
		this.hRcontent = hRcontent;
	}

	public String gethRname() {
		return hRname;
	}

	public void sethRname(String hRname) {
		this.hRname = hRname;
	}

	public Timestamp gethRday() {
		return hRday;
	}

	public void sethRday(Timestamp hRday) {
		this.hRday = hRday;
	}
	
	
	
}
