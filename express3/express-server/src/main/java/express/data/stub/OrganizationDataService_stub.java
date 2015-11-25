package express.data.stub;

import express.dataService.organizationDataService.OrganizationDataService;
import express.po.OrganizationPO;

public class OrganizationDataService_stub implements OrganizationDataService{
	
	public boolean changeOrganization(OrganizationPO po){
		po.setAddress("南京市栖霞区仙林大道163号");
		return true;
	}
}
