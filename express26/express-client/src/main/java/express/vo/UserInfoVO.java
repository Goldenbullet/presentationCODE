package express.vo;

import express.po.UserRole;

public class UserInfoVO {
	String name;
    boolean gender;
	String id;
	String phonenum;
	UserRole position;
	String date;
	
	public UserInfoVO(String name,boolean gender,String id,String pnum,UserRole position,String date){
		this.name = name;
		this.gender = gender;
		this.id = id;
		this.phonenum = pnum;
		this.position = position;
		this.date = date;
	}
}
