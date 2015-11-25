package express.po;

import java.io.Serializable;

public class UserInfoPO implements Serializable{
	private String name;
	private boolean gender;
	private String id;
	private long phonenum;
	private UserRole position;
	private String date;
	
	public UserInfoPO(String name,boolean gender,String id,long pnum,UserRole position,String date){
		this.name = name;
		this.gender = gender;
		this.id = id;
		this.phonenum = pnum;
		this.position = position;
		this.date = date;
	}

	public String getName(){
		return name;
	}
	
	public boolean setName(String name){
		this.name = name;
		return false;
	}
	
	public boolean getGender(){
		return gender;
	}
	
	public boolean setGender(boolean gender){
		this.gender = gender;
		return false;
	}
	
	public String getID(){
		return id;
	}
	
	public boolean setID(String id){
		this.id = id;
		return false;
	}
	
	public long getPhoneNum(){
		return phonenum;
	}
	
	public boolean setPhoneNum(long pnum){
		this.phonenum = pnum;
		return false;
	}
	
	public UserRole getPosition(){
		return position;
	}
	
	public boolean setPosition(UserRole pos){
		this.position = pos;
		return false;
	}
	
	public String getDate(){
		return date;
	}
	
	public boolean setDate(String date){
		this.date = date;
		return false;
	}
}
