package express.vo;

import express.po.UserRole;

public class UserInfoAdminVO {
	String name;
	String id;
	UserRole position;
	String password;
	
	public UserInfoAdminVO(String name,String id,UserRole position,String key){
		this.name = name;
		this.id = id;
		this.position = position;
		this.password = key;
	}
}
