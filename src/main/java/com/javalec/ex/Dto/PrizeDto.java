package com.javalec.ex.Dto;

public class PrizeDto {
	public PrizeDto() {}
	public PrizeDto(int prize_id,String admin,String prize_title,String prize_content
			,String prize_file,String prize_date,int prize_hit) {
		this.prize_id = prize_id;
		this.admin = admin;
		this.prize_title = prize_title;
		this.prize_content = prize_content;
		this.prize_file = prize_file;
		this.prize_date = prize_date;
		this.prize_hit = prize_hit;
	}
	
	int prize_id;
	String admin;
	String prize_title;
	String prize_content;
	String prize_file;
	String prize_date;
	int prize_hit;
	
	public int getPrize_id() {
		return prize_id;
	}
	public void setPrize_id(int prize_id) {
		this.prize_id = prize_id;
	}
	public String getAdmin() {
		return admin;
	}
	public void setAdmin(String admin) {
		this.admin = admin;
	}
	public String getPrize_title() {
		return prize_title;
	}
	public void setPrize_title(String prize_title) {
		this.prize_title = prize_title;
	}
	public String getPrize_content() {
		return prize_content;
	}
	public void setPrize_content(String prize_content) {
		this.prize_content = prize_content;
	}
	public String getPrize_file() {
		return prize_file;
	}
	public void setPrize_file(String prize_file) {
		this.prize_file = prize_file;
	}
	public String getPrize_date() {
		return prize_date;
	}
	public void setPrize_date(String prize_date) {
		this.prize_date = prize_date;
	}
	public int getPrize_hit() {
		return prize_hit;
	}
	public void setPrize_hit(int prize_hit) {
		this.prize_hit = prize_hit;
	}
	
}
