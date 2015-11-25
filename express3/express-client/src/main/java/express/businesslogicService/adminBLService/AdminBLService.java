package express.businesslogicService.adminBLService;

import express.po.UserRole;
import express.vo.LogVO;
import express.vo.UserInfoAdminVO;

public interface AdminBLService {
	
	public void addUserID(UserInfoAdminVO vo);
	
	public boolean isExisted (String id);
	
	public UserInfoAdminVO getUserInfo(String id);
	
	public boolean removeUser (String id);
	
	public boolean changeUserPosition (String id);
	
	public boolean changeUserPassword (String id);
	
	public void endManage();
}
