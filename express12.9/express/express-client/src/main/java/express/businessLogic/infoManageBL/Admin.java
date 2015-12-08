package express.businessLogic.infoManageBL;//

import java.rmi.RemoteException;
import java.util.ArrayList;

import express.businessLogic.syslogBL.SysLog;
import express.businesslogicService.adminBLService.AdminBLService;
import express.businesslogicService.adminBLService.RemoveUserBLService;
import express.businesslogicService.managerBLService.UserRegisterService;
import express.dataService.userDataService.AdminUserDataService;
import express.po.UserInfoAdminPO;
import express.po.UserRole;
import express.rmi.RMIClient;
import express.vo.UserInfoAdminVO;
import express.vo.UserInfoVO;

public class Admin implements AdminBLService,RemoveUserBLService{

	AdminUserDataService admin;
	
	public Admin(){
		admin=RMIClient.getUserAdminObject();
	}
	
	public boolean addUser(UserInfoAdminVO vo) {
		
		UserInfoAdminPO po=new UserInfoAdminPO();
		
		po.setID(vo.getID());
		po.setName(vo.getName());
		po.setPassword(vo.getPassword());
		po.setPosition(vo.getPosition());
		//将vo转化为po
		UserRegisterService staff=new StaffForManager();
		staff.register(vo.getID());
		//人员信息更新为已登记
		try {
			return admin.createUser(po);
		} catch (RemoteException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return false;
	}
	
	public UserInfoAdminVO getUser(String id){
		try {

			UserInfoAdminPO po=admin.getUserAdmin(id);
			if(po!=null){
				UserInfoAdminVO vo=new UserInfoAdminVO(po);
				return vo;
			}
			return null;
		} catch (RemoteException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return null;
	}
	
	public ArrayList<UserInfoVO> getUnregistered(){
		
		UserRegisterService staff=new StaffForManager();
		//从总经理处获得未登记的人员信息
		return staff.getUnregistered();
	}

	public boolean changeUserInfo(String name,UserRole role,String id) {
		try {
			return admin.changeUserInfo(name,role,id);
		} catch (RemoteException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return false;
	}

	public boolean removeUser(String id) {
		try {
			return admin.deleteUser(id);
		} catch (RemoteException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return false;
	}

	public boolean changeUserPassword(String id, String password) {
		try {
			return admin.changeUserPassword(id, password);
		} catch (RemoteException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return false;
	}

	public void endManage() {
		SysLog log=new SysLog();
		log.addSysLog("管理员工账户");
		try {
			admin.writeAllUserAdmin();
		} catch (RemoteException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	@Override
	public boolean checkUserID(String id) {
		if(id.length()!=7)
			return false;
		for(int i=0;i<id.length();i++){
			char c=id.charAt(i);
			if(c>'9'||c<'0')
				return false;
		}
		return true;
	}
	
}
