package com.javalec.ex.dao;

import com.javalec.ex.dto.Event_replyDto;

public interface EventReplyDao {
	//댓글 작성
	public void eventReplyW(Event_replyDto erdt);
	
	//댓글 삭제
	public void eventReplyD(int eventReply_id);
}
