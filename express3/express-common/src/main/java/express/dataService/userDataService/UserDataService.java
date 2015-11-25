package express.dataService.userDataService;

import express.po.UserInfoPO;

public interface UserDataService {

	public boolean createuser(UserInfoPO po);
	
	public UserInfoPO getUserInfo(String id);
	
	public boolean deleteUser(String id);
	
	public boolean changeUserInfo(UserInfoPO po);
	
}
