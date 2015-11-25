package express.dataService_Driver;

import express.dataService.organizationDataService.OrganizationDataService;
import express.po.OrganizationPO;

public class OrganizationDataService_Driver {
	public void drive(OrganizationDataService organizationdataservice){
		organizationdataservice.changeOrganization(new OrganizationPO("S快递公司","南京鼓楼"));
		System.out.println("Change succeed.");
	}
}
