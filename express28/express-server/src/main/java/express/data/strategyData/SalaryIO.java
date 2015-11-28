package express.data.strategyData;

import java.io.IOException;
import java.rmi.RemoteException;
import java.rmi.server.UnicastRemoteObject;
import java.util.ArrayList;

import express.data.IOHelper.IOHelper;
import express.dataService.strategyDataService.SalaryDataService;
import express.po.PricePO;
import express.po.SalaryPO;

public class SalaryIO extends UnicastRemoteObject implements SalaryDataService{

	String filename="SerializableData/Salary.ser";
	ArrayList<SalaryPO> salaryStartegyList;
	
	public SalaryIO() throws RemoteException {
		super();
		IOHelper io=new IOHelper();
		salaryStartegyList=new ArrayList<SalaryPO>();
		try {
			salaryStartegyList=(ArrayList<SalaryPO>)io.readFromDisk(filename);
		} catch (ClassNotFoundException e) {
			
		} catch (IOException e) {
			
		}
	}

	@Override
	public boolean addSalaryStrategy(SalaryPO po) throws RemoteException {
		salaryStartegyList.add(po);
		return true;
	}

	@Override
	public boolean deleteSalaryStrategy(int index) throws RemoteException {
		if(index>=0&&index<salaryStartegyList.size()){
			salaryStartegyList.remove(index);
			return true;
		}
		return false;
	}

	@Override
	public boolean changeSalaryStrategy(SalaryPO po, int index) throws RemoteException {
		if(index>=0&&index<salaryStartegyList.size()){
			salaryStartegyList.set(index, po);
			return true;
		}
		else	
			return false;
	}

	@Override
	public ArrayList<SalaryPO> getAllSalaryStrategy() throws RemoteException {
		if(salaryStartegyList.size()>0)
			return salaryStartegyList;
		else
			return null;
	}

	@Override
	public boolean writeAllSalaryStrategy() throws RemoteException {
		IOHelper io=new IOHelper();
		try {
			io.writeToDisk(filename, salaryStartegyList);
			return true;
		} catch (IOException e) {
			
			return false;
		}
	}

}
