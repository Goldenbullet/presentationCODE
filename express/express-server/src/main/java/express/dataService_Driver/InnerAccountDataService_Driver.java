package express.dataService_Driver;

import express.dataService.innerAccountDataService.InnerAccountDataService;
import express.po.InnerAccountPO;

public class InnerAccountDataService_Driver {
	
	public void drive(InnerAccountDataService innerAccountDataService){
		if(innerAccountDataService.createBankAccountInfo(null))
			System.out.print("Bank Account ");
		if(innerAccountDataService.createMemberInfo(null));
			System.out.print("Member ");
		if(innerAccountDataService.createOrganizationInfo(null));
			System.out.print("Organization ");
		if(innerAccountDataService.createRepoInfo(null));
			System.out.print("Repository ");
		if(innerAccountDataService.createVehicleInfo(null))
			System.out.println("Vehicle");
		innerAccountDataService.getInnerAccount("1");
	}
}
