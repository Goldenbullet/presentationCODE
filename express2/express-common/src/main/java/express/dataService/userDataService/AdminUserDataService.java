package express.dataService.userDataService;

import express.po.UserInfoAdminPO;
import express.po.UserInfoPO;

public interface AdminUserDataService {
	
	public boolean createuser(UserInfoAdminPO po);
	
	public boolean checkExisted(String id);
	
	public UserInfoAdminPO getUserInfo(String id);
	
	public boolean deleteUser(String id);
	
	public boolean changeUserPosition(String id);
	
	public boolean changeUserPassword(String id);
}
