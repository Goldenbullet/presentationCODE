package express.businesslogicService.managerBLService;

import express.vo.SalaryStrategyVO;
import express.vo.UserInfoVO;

public interface StaffManageBLService {

	public boolean addUserFromManager(UserInfoVO vo);
	
	public boolean setSalaryStrategy(SalaryStrategyVO vo);

	public boolean isUserIDAvailable(String id);
	
	public boolean isCellPhoneAvailable(String phoneNum);
	
	public boolean isJoininDateAvailable(String Date);
	
	public void endManage();
}
