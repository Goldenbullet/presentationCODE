package express.dataService.organizationDataService;

import java.rmi.Remote;
import java.rmi.RemoteException;
import java.util.ArrayList;
import express.po.OrganizationPO;

public interface OrganizationDataService extends Remote{
	
	public ArrayList<OrganizationPO> getAllOrgInfo() throws RemoteException;

	public OrganizationPO getOrgInfo(int index) throws RemoteException;

	public boolean deleteOrgInfo(int index) throws RemoteException;

	public boolean changeOrgInfo(OrganizationPO po,int index) throws RemoteException;
	
	public boolean writeAllOrgInfo() throws RemoteException;
}
