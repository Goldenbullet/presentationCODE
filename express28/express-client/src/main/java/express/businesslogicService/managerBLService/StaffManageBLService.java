package express.businesslogicService.managerBLService;

import java.util.ArrayList;

import express.vo.SalaryStrategyVO;
import express.vo.UserInfoVO;

public interface StaffManageBLService {

	public boolean addUserFromManager(UserInfoVO vo);
	
	public boolean removeUser(String id);
	
	public UserInfoVO getUser(String id);
	
	public ArrayList<UserInfoVO> getAllUser();
	
	public boolean changeUser(UserInfoVO vo,String id);
	
	public ArrayList<UserInfoVO> getUnregistered();

	public boolean isUserIDAvailable(String id);
	
	public boolean isCellPhoneAvailable(String phoneNum);
	
	public boolean isJoininDateAvailable(String Date);
	
	public boolean register(String id);
	
	public void endManage();
}
