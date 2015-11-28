package express.data.vehicleAndDriverData;

import java.io.IOException;
import java.rmi.RemoteException;
import java.rmi.server.UnicastRemoteObject;
import java.util.ArrayList;
import express.data.IOHelper.IOHelper;
import express.dataService.vehicleAndDriverDataService.DriverDataService;
import express.po.DriverInfoPO;

public class DriverIO extends UnicastRemoteObject implements DriverDataService{

	String filename="SerializableData/Driver.ser";
	ArrayList<DriverInfoPO> driverInfoList;
	
	public DriverIO() throws RemoteException {
		super();
		IOHelper io=new IOHelper();
		driverInfoList=new ArrayList<DriverInfoPO>();
		try {
			driverInfoList=(ArrayList<DriverInfoPO>)io.readFromDisk(filename);
		} catch (ClassNotFoundException e) {
			
		} catch (IOException e) {
			
		}
	}

	@Override
	public boolean createDriverInfo(DriverInfoPO po) throws RemoteException{
		driverInfoList.add(po);
		return true;
	}

	@Override
	public ArrayList<DriverInfoPO> getDriverInfoList() throws RemoteException{
		if(driverInfoList.size()>0)
			return driverInfoList;
		else
			return null;
	}

	@Override
	public DriverInfoPO getDriverInfo(int index) throws RemoteException{
		if(index>=0&&index<driverInfoList.size())
			return driverInfoList.get(index);
		else
			return null;
	}

	@Override
	public boolean deleteDriverInfo(int index) throws RemoteException{
		if(index>=0&&index<driverInfoList.size()){
			driverInfoList.remove(index);
			return true;
		}
		else
			return false;
	}

	@Override
	public boolean changeDriverInfo(DriverInfoPO po,int index) throws RemoteException{
		if(index>=0&&index<driverInfoList.size()){
			driverInfoList.set(index, po);
			return true;
		}
		else
			return false;
	}
	
	public boolean writeAllDriverInfo() throws RemoteException{
		IOHelper io=new IOHelper();
		try {
			io.writeToDisk(filename, driverInfoList);
			return true;
		} catch (IOException e) {
			
			return false;
		}
	}

}
