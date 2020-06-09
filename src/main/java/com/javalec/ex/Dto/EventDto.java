package com.javalec.ex.Dto;

public class EventDto {
	public EventDto() {}
	public EventDto(int event_id,String admin,String event_title,String event_content
			,String event_startDate,String event_endDate,int event_hit,String event_image1,String event_image2) {
		this.event_id = event_id;
		this.admin = admin;
		this.event_title = event_title;
		this.event_content = event_content;
		this.event_startDate = event_startDate;
		this.event_endDate = event_endDate;
		this.event_hit = event_hit;
		this.event_image1 = event_image1;
		this.event_image2 = event_image2;
	}
	int event_id;
	String admin;
	String event_title;
	String event_content; 
	String event_startDate;
	String event_endDate;
	int event_hit;
	String event_image1;
	String event_image2;
	
	public int getEvent_id() {
		return event_id;
	}
	public void setEvent_id(int event_id) {
		this.event_id = event_id;
	}
	public String getAdmin() {
		return admin;
	}
	public void setAdmin(String admin) {
		this.admin = admin;
	}
	public String getEvent_title() {
		return event_title;
	}
	public void setEvent_title(String event_title) {
		this.event_title = event_title;
	}
	public String getEvent_content() {
		return event_content;
	}
	public void setEvent_content(String event_content) {
		this.event_content = event_content;
	}
	public String getEvent_startDate() {
		return event_startDate;
	}
	public void setEvent_startDate(String event_startDate) {
		this.event_startDate = event_startDate;
	}
	public String getEvent_endDate() {
		return event_endDate;
	}
	public void setEvent_endDate(String event_endDate) {
		this.event_endDate = event_endDate;
	}
	public int getEvent_hit() {
		return event_hit;
	}
	public void setEvent_hit(int event_hit) {
		this.event_hit = event_hit;
	}
	public String getEvent_image1() {
		return event_image1;
	}
	public void setEvent_image1(String event_image1) {
		this.event_image1 = event_image1;
	}
	public String getEvent_image2() {
		return event_image2;
	}
	public void setEvent_image2(String event_image2) {
		this.event_image2 = event_image2;
	}
	
}
