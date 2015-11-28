package express.dataService.vehicleAndDriverDataService;

import java.rmi.Remote;
import java.rmi.RemoteException;
import java.util.ArrayList;

import express.po.DriverInfoPO;

public interface DriverDataService extends Remote{
	public boolean createDriverInfo(DriverInfoPO po) throws RemoteException;

	public ArrayList<DriverInfoPO> getDriverInfoList() throws RemoteException;

	public DriverInfoPO getDriverInfo(int index) throws RemoteException;

	public boolean deleteDriverInfo(int index) throws RemoteException;

	public boolean changeDriverInfo(DriverInfoPO po,int index) throws RemoteException;
	
	public boolean writeAllDriverInfo() throws RemoteException;

}
