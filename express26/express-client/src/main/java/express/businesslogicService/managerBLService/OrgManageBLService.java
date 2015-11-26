package express.businesslogicService.managerBLService;

import express.vo.OrganizationInfoVO;

public interface OrgManageBLService {
	
	public boolean setOrganizationInfo(OrganizationInfoVO vo);
	
	public boolean setCityDistance(String city,double distance,String city2);
	
	public boolean setPrice(double price);
	
	public void endManage();
}
