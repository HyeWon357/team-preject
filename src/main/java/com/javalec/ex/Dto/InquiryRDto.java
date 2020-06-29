package com.javalec.ex.Dto;

import java.sql.Timestamp;

public class InquiryRDto {
	
	int hRnum; //댓글 순서번호
	int hRcnum; //inquiry 게시판 번호
	String hRcontent; //댓글
	String hid2; //사용자 아이디
	Timestamp hRday; //댓글 날짜
	
	public InquiryRDto() {
		
	}
	
	public InquiryRDto(int hRnum, int hRcnum, String hRcontent, String hid2, Timestamp hRday){
		this.hRnum = hRnum;
		this.hRcnum = hRcnum;
		this.hRcontent = hRcontent;
		this.hid2 = hid2;
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

	public String gethid2() {
		return hid2;
	}

	public void sethid2(String hid2) {
		this.hid2 = hid2;
	}

	public Timestamp gethRday() {
		return hRday;
	}

	public void sethRday(Timestamp hRday) {
		this.hRday = hRday;
	}
	
}
