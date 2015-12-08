package express.vo;

import express.po.UserInfoPO;
import express.po.UserRole;

public class UserInfoVO {
	private String name;
	private boolean gender;
	private String id;
	private String phonenum;
	private UserRole position;
	private String city;
	private String date;
	
	public UserInfoVO(String name,boolean gender,String id,String pnum,
			UserRole position,String city,String date){
		this.name = name;
		this.gender = gender;
		this.id = id;
		this.phonenum = pnum;
		this.position = position;
		this.city=city;
		this.date = date;
	}
	
	public UserInfoVO(){
		this.name = null;
		this.gender = true;
		this.id = null;
		this.phonenum = null;
		this.position = null;
		this.city=null;
		this.date = null;
	}

	public String getName(){
		return name;
	}
	
	public void setName(String name){
		this.name = name;
	}
	
	public boolean getGender(){
		return gender;
	}
	
	public void setGender(boolean gender){
		this.gender = gender;
	}
	
	public String getID(){
		return id;
	}
	
	public void setID(String id){
		this.id = id;
	}
	
	public String getPhoneNum(){
		return phonenum;
	}
	
	public void setPhoneNum(String pnum){
		this.phonenum = pnum;
	}
	
	public UserRole getPosition(){
		return position;
	}
	
	public void setPosition(UserRole pos){
		this.position = pos;
	}
	
	public String getCity(){
		return city;
	}
	
	public void setCity(String c){
		city=c;
	}
	
	public String getDate(){
		return date;
	}
	
	public void setDate(String date){
		this.date = date;
	}
}
