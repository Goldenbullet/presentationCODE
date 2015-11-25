package express.data.stub;

import java.util.ArrayList;

import express.dataService.innerAccountDataService.InnerAccountDataService;
import express.po.BankAccountPO;
import express.po.InDocPO;
import express.po.InnerAccountPO;
import express.po.OrganizationPO;
import express.po.UserInfoPO;
import express.po.VehicleInfoPO;

public class InnerAccountDataService_stub implements InnerAccountDataService{
	UserInfoPO user;
	OrganizationPO organization;
	InDocPO inDoc;
	VehicleInfoPO vehicle;
	BankAccountPO bankAccount;
	String id;
	ArrayList<UserInfoPO> userInfo=new ArrayList<UserInfoPO>();
	ArrayList<OrganizationPO> organizationInfo=new ArrayList<OrganizationPO>();
	ArrayList<InDocPO> inDocList=new ArrayList<InDocPO>();
	ArrayList<VehicleInfoPO> vehicleInfo=new ArrayList<VehicleInfoPO>();
	ArrayList<BankAccountPO> bankAccountInfo=new ArrayList<BankAccountPO>();
	
	public InnerAccountDataService_stub(UserInfoPO user,OrganizationPO organization,
			InDocPO inDoc,VehicleInfoPO vehicle,BankAccountPO bankAccount,String id){
		this.user=user;
		this.organization=organization;
		this.inDoc=inDoc;
		this.vehicle=vehicle;
		this.bankAccount=bankAccount;
		this.id=id;
		userInfo.add(user);
		organizationInfo.add(organization);
		inDocList.add(inDoc);
		vehicleInfo.add(vehicle);
		bankAccountInfo.add(bankAccount);
	}
	
	public boolean createMemberInfo(UserInfoPO user){
		return true;
	}
	
	public boolean createOrganizationInfo(OrganizationPO organization){
		return true;
	}
	
	public boolean createRepoInfo(InDocPO inDoc){
		return true;
	}
	
	public boolean createVehicleInfo(VehicleInfoPO vehicle){
		return true;
	}
	
	public boolean createBankAccountInfo(BankAccountPO bankAccount){
		return true;
	}
	
	public InnerAccountPO getInnerAccount(String id){
		System.out.println("Get inner account");
		return new InnerAccountPO(id,userInfo,organizationInfo,inDocList,vehicleInfo,bankAccountInfo);
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
