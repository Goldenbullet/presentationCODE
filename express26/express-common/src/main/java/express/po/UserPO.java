package express.po;

import java.io.Serializable;

public class UserPO implements Serializable{
	private String id;
	private String name;
	
	
	public UserPO(String i,String n){
		id=i;
		name=n;
		
	}
	
	public String getID(){
		return id;
	}
	
	public String getName(){
		return name;
	}

}