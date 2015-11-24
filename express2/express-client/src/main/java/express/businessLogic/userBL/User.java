package express.businessLogic.userBL;

import express.businesslogicService.signBLService.LogInBLService;
import express.vo.SignInVO;
import express.vo.UserInfoSignVO;

public class User implements LogInBLService{
	public SignInVO isIdentified(String id,String password){
		return new SignInVO();
	}
	public boolean isSigned(String id){
		return false;
	}
	public UserInfoSignVO getUserInfo(String id){
		return new UserInfoSignVO();
	}
	public boolean LogOut(String id){
		return false;
	}
	public boolean changeSigned(String id){
		return false;
	}
}
