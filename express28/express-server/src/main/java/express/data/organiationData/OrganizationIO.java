package express.data.organiationData;

import java.io.IOException;
import java.rmi.RemoteException;
import java.rmi.server.UnicastRemoteObject;
import java.util.ArrayList;
import express.data.IOHelper.IOHelper;
import express.dataService.organizationDataService.OrganizationDataService;
import express.po.OrganizationPO;

public class OrganizationIO extends UnicastRemoteObject implements OrganizationDataService{

	String filename="SerializableData/Organization.ser";
	ArrayList<OrganizationPO> OrgInfoList;
	
	public OrganizationIO() throws RemoteException {
		super();
		IOHelper io=new IOHelper();
		OrgInfoList=new ArrayList<OrganizationPO>();
		try {
			OrgInfoList=(ArrayList<OrganizationPO>)io.readFromDisk(filename);
		} catch (ClassNotFoundException e) {
			
		} catch (IOException e) {
			
		}
	}

	@Override
	public ArrayList<OrganizationPO> getAllOrgInfo() throws RemoteException {
		if(OrgInfoList.size()>0)
			return OrgInfoList;
		else
			return null;
	}

	@Override
	public OrganizationPO getOrgInfo(int index) throws RemoteException {
		if(index>=0&&index<OrgInfoList.size()){
			return OrgInfoList.get(index);
		}
		else
			return null;
	}

	@Override
	public boolean deleteOrgInfo(int index) throws RemoteException {
		if(index>=0&&index<OrgInfoList.size()){
			OrgInfoList.remove(index);
			return true;
		}
		else
			return false;
	}

	@Override
	public boolean changeOrgInfo(OrganizationPO po, int index) throws RemoteException {
		if(index>=0&&index<OrgInfoList.size()){
			OrgInfoList.set(index, po);
			return true;
		}
		else
			return false;
	}

	@Override
	public boolean writeAllOrgInfo() throws RemoteException {
		IOHelper io=new IOHelper();
		try {
			io.writeToDisk(filename,OrgInfoList);
			return true;
		} catch (IOException e) {
			
			return false;
		}
	}

}
