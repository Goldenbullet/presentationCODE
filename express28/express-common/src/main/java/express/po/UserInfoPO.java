package express.po;

import java.io.Serializable;

public class UserInfoPO implements Serializable{
	private String name;
	private boolean gender;
	private String id;
	private long phonenum;
	private UserRole position;
	private String city;
	private String date;
	private boolean isAdmin;
	
	public UserInfoPO(String name,boolean gender,String id,long pnum,
			UserRole position,String city,String date,boolean isAdmin
			){
		this.name = name;
		this.gender = gender;
		this.id = id;
		this.phonenum = pnum;
		this.position = position;
		this.city=city;
		this.date = date;
		this.isAdmin=isAdmin;
	}
	
	public UserInfoPO(){
		this.name = null;
		this.gender = true;
		this.id = null;
		this.phonenum = 0;
		this.position = null;
		this.city=null;
		this.date = null;
		this.isAdmin=false;
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
	
	public long getPhoneNum(){
		return phonenum;
	}
	
	public void setPhoneNum(long pnum){
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
	
	public boolean checkAdmin(){
		return isAdmin;
	}
	
	public void setAdmin(boolean a){
		isAdmin=a;
	}
}
