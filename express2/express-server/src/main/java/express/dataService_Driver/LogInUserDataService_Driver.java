package express.dataService_Driver;

import express.data.stub.LogInUserDataService_stub;
import express.dataService.userDataService.LogInUserDataService;
import express.po.UserRole;

public class LogInUserDataService_Driver {
	public void drive(LogInUserDataService logInUserDataService){
		
		//LogInUserDataService_stub service=new LogInUserDataService_stub("1001001","123456","hailong",UserRole.DeliverMan.DeliverMan);
		logInUserDataService.getUser("1001001", "123456");
	}
}
