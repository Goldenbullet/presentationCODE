package express.data.innerAccountData;

import java.util.ArrayList;

import express.dataService.innerAccountDataService.InnerAccountDataService;
import express.po.BankAccountPO;
import express.po.InDocPO;
import express.po.InnerAccountPO;
import express.po.OrganizationPO;
import express.po.UserInfoPO;
import express.po.VehicleInfoPO;

public class InnerAccountIO implements InnerAccountDataService{

	public boolean createMemberInfo(UserInfoPO user) {
		// TODO Auto-generated method stub
		return false;
	}

	public boolean createOrganizationInfo(OrganizationPO organization) {
		// TODO Auto-generated method stub
		return false;
	}

	public boolean createRepoInfo(InDocPO inDoc) {
		// TODO Auto-generated method stub
		return false;
	}

	public boolean createVehicleInfo(VehicleInfoPO vehicle) {
		// TODO Auto-generated method stub
		return false;
	}

	public boolean createBankAccountInfo(BankAccountPO bankAccount) {
		// TODO Auto-generated method stub
		return false;
	}

	public InnerAccountPO getInnerAccount(String id) {
		// TODO Auto-generated method stub
		return null;
	}

	public ArrayList<UserInfoPO> getAllUserInfo() {
		// TODO Auto-generated method stub
		return null;
	}

	public ArrayList<OrganizationPO> getAllOrgInfo() {
		// TODO Auto-generated method stub
		return null;
	}

	public ArrayList<InDocPO> getAllRepoInfo() {
		// TODO Auto-generated method stub
		return null;
	}

	public ArrayList<VehicleInfoPO> getAllVehilcleInfo() {
		// TODO Auto-generated method stub
		return null;
	}

	public ArrayList<BankAccountPO> getAllBankAccountInfo() {
		// TODO Auto-generated method stub
		return null;
	}

}
