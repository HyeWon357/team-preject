package com.javalec.ex.Dao;

import java.util.ArrayList;

import com.javalec.ex.Dto.EventDto;
import com.javalec.ex.Dto.Event_replyDto;

public interface AdminEventDao {
	public ArrayList<EventDto> adminEList();
	public EventDto adminEContent(int event_id);
	
	//이전글, 다음글
	public EventDto event_prev(int event_id);
	public EventDto event_next(int event_id);
	
	//댓글
	public ArrayList<Event_replyDto> eRlist(int event_id);
	public Event_replyDto eRcount(int event_id);
	
	//쓰기
	public void eventWrite(EventDto edt);
	//삭제
	public void eventDelete(int event_id);
	//수정
	public EventDto adminEventM(int event_id);
	public void eventModify(EventDto edt);
}
