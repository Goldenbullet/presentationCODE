package express.businessLogic.userBL;

import java.rmi.RemoteException;
import java.util.ArrayList;

import express.businessLogic.IDKeeper;
import express.businessLogic.infoManageBL.Admin;
import express.businesslogicService.signBLService.LogInBLService;
import express.dataService.userDataService.AdminUserDataService;
import express.dataService.userDataService.SignUserDataService;
import express.dataService.userDataService.UserDataService;
import express.po.UserInfoAdminPO;
import express.po.UserInfoPO;
import express.po.UserPO;
import express.rmi.RMIClient;
import express.vo.SignInVO;
import express.vo.UserInfoAdminVO;
import express.vo.UserInfoSignVO;

public class User implements LogInBLService{
	
	SignUserDataService sign;
	
	public User(){
		sign=RMIClient.getUserSignObject();
	}

	public SignInVO signIn(String id, String password) {
		
		AdminUserDataService adminUser=RMIClient.getUserAdminObject();
		
		try {
			ArrayList<UserInfoAdminPO> userList=adminUser.getAllUserAdmin();
			for(UserInfoAdminPO user:userList){
				//查找id和password
				if(user.getID().equals(id)&&user.getPassword().equals(password)){
					//如果id正确，且password正确
					if(sign.checkLogIn(id))
						//如果已登录
						return SignInVO.SIGNED;
					else{
						//如果未登录
						UserPO u=new UserPO(user.getID(),user.getPosition());
						
						sign.logInRegister(u);
						//标记为登录
						IDKeeper.setID(id);
						//保存id
						return SignInVO.PERMIT;
					}
				}
				else if(user.getID().equals(id)&&!user.getPassword().equals(password)){
					//如果id正确，但password不正确
					return SignInVO.PASSWORD_ERROR;
				}
			}
			//如果没找到id，说明id不存在
			return SignInVO.ID_ERROR;
		} catch (RemoteException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return null;
	}

	public UserInfoSignVO getUserInfo(String id) {
		
		Admin adminUser=new Admin();
		UserInfoAdminVO user=adminUser.getUser(id);
		
		if(user!=null)
			return new UserInfoSignVO(user.getName(),user.getID(),user.getPosition());
		else
			return null;
	}

	public boolean SignOut(String id) {

		try {
			sign.logOutRegister(id);
			return true;
		} catch (RemoteException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return false;
	}

}
