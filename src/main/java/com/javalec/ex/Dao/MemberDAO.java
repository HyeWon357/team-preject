package com.javalec.ex.Dao;


import java.sql.Date;


public interface MemberDAO {

	//회원가입
	public void signUP(String d_name, String d_id, String d_pw, String d_email1, String d_email2, String d_email_check, String d_zipcode,
			String d_address, String d_phone1, String d_phone2, String d_phone3, String d_sms, String d_tel1, String d_tel2, String d_tel3,
			String d_birth_yy, String d_birth_mm, String d_birth_dd, String d_sl, Date d_date);
}
