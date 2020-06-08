package com.javalec.ex.dao;

import java.util.ArrayList;

import com.javalec.ex.dto.PrizeDto;

public interface AdminPrizeDao {
	//당첨자 발표 리스트
	public ArrayList<PrizeDto> adminPList();
	
	//당첨자 발표 내용
	public PrizeDto adminPContent(int prize_id);
	//이전글, 다음글
	public PrizeDto prize_prev(int prize_id);
	public PrizeDto prize_next(int prize_id);
	
	//당첨자 발표 작성
	public void prizeWrite(PrizeDto pdt);
	
	//당첨자 발표 삭제
	public void prizeDelete(int prize_id);
	
	//당첨자 발표 수정
	public PrizeDto adminPrizeM(int prize_id);
	public void prizeModify(PrizeDto pdt);
}
