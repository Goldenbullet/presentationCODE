package express.dataService.userDataService;

import express.po.UserPO;

public interface LogInUserDataService {

	public UserPO getUser(String id,String passWord);
}
