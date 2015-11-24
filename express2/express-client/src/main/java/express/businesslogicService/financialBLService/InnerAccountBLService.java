package express.businesslogicService.financialBLService;

import java.util.ArrayList;

import express.po.BankAccountPO;
import express.po.InDocPO;
import express.po.OrganizationPO;
import express.po.UserInfoPO;
import express.po.VehicleInfoPO;
import express.vo.BankAccountVO;
import express.vo.InDocVO;
import express.vo.InnerAccountVO;
import express.vo.OrganizationVO;
import express.vo.UserInfoVO;
import express.vo.VehicleInfoVO;

public interface InnerAccountBLService {

	public boolean initUserInfo(UserInfoVO user);
	
	public boolean initOrganizationInfo(OrganizationVO organization);
	
	public boolean initRepoInfo(InDocVO inDoc);
	
	public boolean initVehicleInfo(VehicleInfoVO vehicle);
	
	public boolean initBankAccountInfo(BankAccountVO bankAccount);
	
	public InnerAccountVO checkPrevious(String innerAccountID);
	
	public ArrayList<UserInfoPO> getUser();
	
	public ArrayList<OrganizationPO> getOrg();
	
	public ArrayList<InDocPO> getRepo();
	
	public ArrayList<VehicleInfoPO> getVehicle();
	
	public ArrayList<BankAccountPO> getBankAccount();
	
	public void endInitial();
}
