package express.dataService.innerAccountDataService;

import java.util.ArrayList;

import express.po.BankAccountPO;
import express.po.InDocPO;
import express.po.InnerAccountPO;
import express.po.OrganizationPO;
import express.po.UserInfoPO;
import express.po.VehicleInfoPO;

public interface InnerAccountDataService {

	public boolean createMemberInfo(UserInfoPO user);
	
	public boolean createOrganizationInfo(OrganizationPO organization);
	
	public boolean createRepoInfo(InDocPO inDoc);
	
	public boolean createVehicleInfo(VehicleInfoPO vehicle);
	
	public boolean createBankAccountInfo(BankAccountPO bankAccount);
	
	public ArrayList<UserInfoPO> getAllUserInfo();
	
	public ArrayList<OrganizationPO> getAllOrgInfo();
	
	public ArrayList<InDocPO> getAllRepoInfo();
	
	public ArrayList<VehicleInfoPO> getAllVehilcleInfo();
	
	public ArrayList<BankAccountPO> getAllBankAccountInfo();
	
	public InnerAccountPO getInnerAccount(String id);
}
