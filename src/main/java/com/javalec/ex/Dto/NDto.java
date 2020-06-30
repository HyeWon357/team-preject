package com.javalec.ex.Dto;

import java.sql.Timestamp;

public class NDto {
	
	int hNnum;
	String hNname;
	String hNtitle;
	String hNcontent;
	Timestamp hNday;
	int hNhit;
	int isDay; //현재 날짜
	
	public NDto() {
		
	}
	
	public NDto(int hNnum, String hNname, String hNtitle, String hNcontent, Timestamp hNday, int hNhit) {
		this.hNnum = hNnum;
		this.hNname = hNname;
		this.hNtitle = hNtitle;
		this.hNcontent = hNcontent;
		this.hNday = hNday;
		this.hNhit = hNhit;
	}

	
	public int gethNnum() {
		return hNnum;
	}

	public void sethNnum(int hNnum) {
		this.hNnum = hNnum;
	}

	public String gethNname() {
		return hNname;
	}

	public void sethNname(String hNname) {
		this.hNname = hNname;
	}

	public String gethNtitle() {
		return hNtitle;
	}

	public void sethNtitle(String hNtitle) {
		this.hNtitle = hNtitle;
	}

	public String gethNcontent() {
		return hNcontent;
	}

	public void sethNcontent(String hNcontent) {
		this.hNcontent = hNcontent;
	}

	public Timestamp gethNday() {
		return hNday;
	}

	public void sethNday(Timestamp hNday) {
		this.hNday = hNday;
	}

	public int gethNhit() {
		return hNhit;
	}

	public void sethNhit(int hNhit) {
		this.hNhit = hNhit;
	}

}
