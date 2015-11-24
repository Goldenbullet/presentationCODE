package express.po;

import java.io.Serializable;
import java.util.ArrayList;

public class InnerAccountPO implements Serializable{
	private String innerAccountID;
	private ArrayList<UserInfoPO> userInfo;
	private ArrayList<OrganizationPO> organizationInfo;
	private ArrayList<InDocPO> inDoc;
	private ArrayList<VehicleInfoPO> vehicleInfo;
	private ArrayList<BankAccountPO> bankAccountInfo;
	
	public InnerAccountPO(String innerAccountID,ArrayList<UserInfoPO> userInfo,
			ArrayList<OrganizationPO> organizationInfo,ArrayList<InDocPO> inDoc,
			ArrayList<VehicleInfoPO> vehicleInfo,ArrayList<BankAccountPO> bankAccountInfo){
		this.innerAccountID=innerAccountID;
		this.userInfo=userInfo;
		this.organizationInfo=organizationInfo;
		this.inDoc=inDoc;
		this.vehicleInfo=vehicleInfo;
		this.bankAccountInfo=bankAccountInfo;
	}
	public String getInnerAccountID(){
		return innerAccountID;
	}
	public ArrayList<UserInfoPO> getUserInfo(){
		return userInfo;
	}
	public ArrayList<OrganizationPO> getOrganizationInfo(){
		return organizationInfo;
	}
	public ArrayList<InDocPO> getInDoc(){
		return inDoc;
	}
	public ArrayList<VehicleInfoPO> getVehicleInfo(){
		return vehicleInfo;
	}
	public ArrayList<BankAccountPO> getBankAccountInfo(){
		return bankAccountInfo;
	}
}
