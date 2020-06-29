package com.javalec.ex.Dto;

import java.sql.Timestamp;

public class MemberDTO {
	
	public MemberDTO() {
		
	}
	
	public MemberDTO(String d_name, String d_id, String d_pw, String d_email1, String d_email2, String d_email_check, String d_zipcode,
			String d_address, String d_phone1, String d_phone2, String d_phone3, String d_sms, String d_tel1, String d_tel2, String d_tel3,
			String d_birth_yy, String d_birth_mm, String d_birth_dd, String d_sl, Timestamp d_date, int verify) {
		
		this.d_name=d_name;
		this.d_id=d_id;
		this.d_pw=d_pw;
		this.d_email1=d_email1;
		this.d_email2=d_email2;
		this.d_email_check=d_email_check;
		this.d_zipcode=d_zipcode;
		this.d_address=d_address;
		this.d_phone1=d_phone1;
		this.d_phone2=d_phone2;
		this.d_phone3=d_phone3;
		this.d_sms=d_sms;
		this.d_tel1=d_tel1;
		this.d_tel2=d_tel2;
		this.d_tel3=d_tel3;
		this.d_birth_yy=d_birth_yy;
		this.d_birth_mm=d_birth_mm;
		this.d_birth_dd=d_birth_dd;
		this.d_sl=d_sl;
		this.d_date=d_date;
		this.verify=verify;
	}
	
	
	private String d_name;
	private String d_id;
	private String d_pw;
	private String d_email1;
	private String d_email2;
	private String d_email_check;
	private String d_zipcode;
	private String d_address;
	private String d_phone1;
	private String d_phone2;
	private String d_phone3;
	private String d_sms;
	private String d_tel1;
	private String d_tel2;
	private String d_tel3;
	private String d_birth_yy;
	private String d_birth_mm;
	private String d_birth_dd;
	private String d_sl;
	private Timestamp d_date;
	private int verify;
	public String getD_name() {
		return d_name;
	}

	public void setD_name(String d_name) {
		this.d_name = d_name;
	}

	public String getD_id() {
		return d_id;
	}

	public void setD_id(String d_id) {
		this.d_id = d_id;
	}

	public String getD_pw() {
		return d_pw;
	}

	public void setD_pw(String d_pw) {
		this.d_pw = d_pw;
	}

	public String getD_email1() {
		return d_email1;
	}

	public void setD_email1(String d_email1) {
		this.d_email1 = d_email1;
	}

	public String getD_email2() {
		return d_email2;
	}

	public void setD_email2(String d_email2) {
		this.d_email2 = d_email2;
	}

	public String getD_email_check() {
		return d_email_check;
	}

	public void setD_email_check(String d_email_check) {
		this.d_email_check = d_email_check;
	}

	public String getD_zipcode() {
		return d_zipcode;
	}

	public void setD_zipcode(String d_zipcode) {
		this.d_zipcode = d_zipcode;
	}

	public String getD_address() {
		return d_address;
	}

	public void setD_address(String d_address) {
		this.d_address = d_address;
	}

	public String getD_phone1() {
		return d_phone1;
	}

	public void setD_phone1(String d_phone1) {
		this.d_phone1 = d_phone1;
	}

	public String getD_phone2() {
		return d_phone2;
	}

	public void setD_phone2(String d_phone2) {
		this.d_phone2 = d_phone2;
	}

	public String getD_phone3() {
		return d_phone3;
	}

	public void setD_phone3(String d_phone3) {
		this.d_phone3 = d_phone3;
	}

	public String getD_sms() {
		return d_sms;
	}

	public void setD_sms(String d_sms) {
		this.d_sms = d_sms;
	}

	public String getD_tel1() {
		return d_tel1;
	}

	public void setD_tel1(String d_tel1) {
		this.d_tel1 = d_tel1;
	}

	public String getD_tel2() {
		return d_tel2;
	}

	public void setD_tel2(String d_tel2) {
		this.d_tel2 = d_tel2;
	}

	public String getD_tel3() {
		return d_tel3;
	}

	public void setD_tel3(String d_tel3) {
		this.d_tel3 = d_tel3;
	}

	public String getD_birth_yy() {
		return d_birth_yy;
	}

	public void setD_birth_yy(String d_birth_yy) {
		this.d_birth_yy = d_birth_yy;
	}

	public String getD_birth_mm() {
		return d_birth_mm;
	}

	public void setD_birth_mm(String d_birth_mm) {
		this.d_birth_mm = d_birth_mm;
	}

	public String getD_birth_dd() {
		return d_birth_dd;
	}

	public void setD_birth_dd(String d_birth_dd) {
		this.d_birth_dd = d_birth_dd;
	}

	public String getD_sl() {
		return d_sl;
	}

	public void setD_sl(String d_sl) {
		this.d_sl = d_sl;
	}

	public Timestamp getD_date() {
		return d_date;
	}

	public void setD_date(Timestamp d_date) {
		this.d_date = d_date;
	}

	public int getVerify() {
		return verify;
	}

	public void setVerify(int verify) {
		this.verify = verify;
	}

	@Override
	public String toString() {
		return "MemberDTO [d_name=" + d_name + ", d_id=" + d_id + ", d_pw=" + d_pw + ", d_email1=" + d_email1
				+ ", d_email2=" + d_email2 + ", d_email_check=" + d_email_check + ", d_zipcode=" + d_zipcode
				+ ", d_address=" + d_address + ", d_phone1=" + d_phone1 + ", d_phone2=" + d_phone2 + ", d_phone3="
				+ d_phone3 + ", d_sms=" + d_sms + ", d_tel1=" + d_tel1 + ", d_tel2=" + d_tel2 + ", d_tel3=" + d_tel3
				+ ", d_birth_yy=" + d_birth_yy + ", d_birth_mm=" + d_birth_mm + ", d_birth_dd=" + d_birth_dd + ", d_sl="
				+ d_sl + ", d_date=" + d_date + ", verify=" + verify + "]";
	}
	
	
	
}
