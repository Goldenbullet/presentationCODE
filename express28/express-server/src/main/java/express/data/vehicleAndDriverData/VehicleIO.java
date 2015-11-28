package express.data.vehicleAndDriverData;

import java.io.IOException;
import java.rmi.RemoteException;
import java.rmi.server.UnicastRemoteObject;
import java.util.ArrayList;

import express.data.IOHelper.IOHelper;
import express.dataService.vehicleAndDriverDataService.VehicleDataService;
import express.po.DriverInfoPO;
import express.po.VehicleInfoPO;

public class VehicleIO extends UnicastRemoteObject implements VehicleDataService{

	String filename="SerializableData/Vehicle.ser";
	ArrayList<VehicleInfoPO> vehicleInfoList;
	
	public VehicleIO() throws RemoteException {
		super();
		IOHelper io=new IOHelper();
		vehicleInfoList=new ArrayList<VehicleInfoPO>();
		try {
			vehicleInfoList=(ArrayList<VehicleInfoPO>)io.readFromDisk(filename);
		} catch (ClassNotFoundException e) {
			
		} catch (IOException e) {
			
		}
	}

	@Override
	public boolean createVehicleInfo(VehicleInfoPO po) throws RemoteException {
		vehicleInfoList.add(po);
		return true;
	}

	@Override
	public ArrayList<VehicleInfoPO> getVehicleInfoList() throws RemoteException {
		if(vehicleInfoList.size()>0)
			return vehicleInfoList;
		else
			return null;
	}

	@Override
	public VehicleInfoPO getVehicleInfo(int index) throws RemoteException {
		if(index>=0&&index<vehicleInfoList.size())
			return vehicleInfoList.get(index);
		else
			return null;
	}

	@Override
	public boolean deleteVehicleInfo(int index) throws RemoteException {
		if(index>=0&&index<vehicleInfoList.size()){
			vehicleInfoList.remove(index);
			return true;
		}
		else	
			return false;
	}

	@Override
	public boolean changeVehicleInfoPO(VehicleInfoPO po,int index) throws RemoteException {
		if(index>=0&&index<vehicleInfoList.size()){
			vehicleInfoList.set(index, po);
			return true;
		}
		else	
			return false;
	}

	@Override
	public boolean writeAllVehicleInfo() throws RemoteException {
		IOHelper io=new IOHelper();
		try {
			io.writeToDisk(filename, vehicleInfoList);
			return true;
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			return false;
		}
	}

}
