package express.businessLogic.initAccountBL;

import java.util.ArrayList;

import express.businesslogicService.financialBLService.InnerAccountBLService;
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

public class InitAccountController implements InnerAccountBLService{

	public boolean initUserInfo(UserInfoVO user) {
		// TODO Auto-generated method stub
		return false;
	}

	public boolean initOrganizationInfo(OrganizationVO organization) {
		// TODO Auto-generated method stub
		return false;
	}

	public boolean initRepoInfo(InDocVO inDoc) {
		// TODO Auto-generated method stub
		return false;
	}

	public boolean initVehicleInfo(VehicleInfoVO vehicle) {
		// TODO Auto-generated method stub
		return false;
	}

	public boolean initBankAccountInfo(BankAccountVO bankAccount) {
		// TODO Auto-generated method stub
		return false;
	}

	public InnerAccountVO checkPrevious(String innerAccountID) {
		// TODO Auto-generated method stub
		return null;
	}

	public void endInitial() {
		// TODO Auto-generated method stub
		
	}

	public ArrayList<UserInfoPO> getUser() {
		// TODO Auto-generated method stub
		return null;
	}

	public ArrayList<OrganizationPO> getOrg() {
		// TODO Auto-generated method stub
		return null;
	}

	public ArrayList<InDocPO> getRepo() {
		// TODO Auto-generated method stub
		return null;
	}

	public ArrayList<VehicleInfoPO> getVehicle() {
		// TODO Auto-generated method stub
		return null;
	}

	public ArrayList<BankAccountPO> getBankAccount() {
		// TODO Auto-generated method stub
		return null;
	}

}
