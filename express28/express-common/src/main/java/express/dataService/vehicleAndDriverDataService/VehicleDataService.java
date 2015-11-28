package express.dataService.vehicleAndDriverDataService;

import java.rmi.Remote;
import java.rmi.RemoteException;
import java.util.ArrayList;

import express.po.VehicleInfoPO;

public interface VehicleDataService extends Remote{

	public boolean createVehicleInfo(VehicleInfoPO po) throws RemoteException;

	public ArrayList<VehicleInfoPO> getVehicleInfoList() throws RemoteException;

	public VehicleInfoPO getVehicleInfo(int index) throws RemoteException;

	public boolean deleteVehicleInfo(int index) throws RemoteException;

	public boolean changeVehicleInfoPO(VehicleInfoPO po,int index) throws RemoteException;
	
	public boolean writeAllVehicleInfo() throws RemoteException;
}