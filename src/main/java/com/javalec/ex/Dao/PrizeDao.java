package com.javalec.ex.Dao;

import java.util.ArrayList;

import com.javalec.ex.Dto.PrizeDto;

public interface PrizeDao {
	//내용
	public ArrayList<PrizeDto> plist();
	public PrizeDto prize_view(int prize_id);
	public void pUpHit(int prize_id);
	
	//이전글, 다음글
	public PrizeDto prize_prev(int prize_id);
	public PrizeDto prize_next(int prize_id);
}
