package com.javalec.ex.dto;

public class Event_replyDto {
	public Event_replyDto() {}
	public Event_replyDto(int event_id,int eventReply_id,String eventReply_user,String eventReply_pw
			,String eventReply_content,String eventReply_date,int eventReply_count) {
		this.event_id = event_id;
		this.eventReply_id = eventReply_id;
		this.eventReply_user = eventReply_user;
		this.eventReply_pw = eventReply_pw;
		this.eventReply_content = eventReply_content;
		this.eventReply_date = eventReply_date;
		this.eventReply_count = eventReply_count;
	}
	int event_id;
	int eventReply_id;
	String eventReply_user;
	String eventReply_pw;
	String eventReply_content;
	String eventReply_date;
	int eventReply_count;
	
	public int getEvent_id() {
		return event_id;
	}
	public void setEvent_id(int event_id) {
		this.event_id = event_id;
	}
	public int getEventReply_id() {
		return eventReply_id;
	}
	public void setEventReply_id(int eventReply_id) {
		this.eventReply_id = eventReply_id;
	}
	public String getEventReply_user() {
		return eventReply_user;
	}
	public void setEventReply_user(String eventReply_user) {
		this.eventReply_user = eventReply_user;
	}
	public String getEventReply_pw() {
		return eventReply_pw;
	}
	public void setEventReply_pw(String eventReply_pw) {
		this.eventReply_pw = eventReply_pw;
	}
	public String getEventReply_content() {
		return eventReply_content;
	}
	public void setEventReply_content(String eventReply_content) {
		this.eventReply_content = eventReply_content;
	}
	public String getEventReply_date() {
		return eventReply_date;
	}
	public void setEventReply_date(String eventReply_date) {
		this.eventReply_date = eventReply_date;
	}
	public int getEventReply_count() {
		return eventReply_count;
	}
	public void setEventReply_count(int eventReply_count) {
		this.eventReply_count = eventReply_count;
	}
	
}
