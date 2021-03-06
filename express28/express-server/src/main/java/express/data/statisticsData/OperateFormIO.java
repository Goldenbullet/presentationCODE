package express.data.statisticsData;

import java.io.IOException;
import java.rmi.RemoteException;
import java.rmi.server.UnicastRemoteObject;
import java.util.ArrayList;
import express.data.IOHelper.IOHelper;
import express.dataService.statisticsDataService.OperateFormDataService;
import express.po.OperateFormPO;

public class OperateFormIO extends UnicastRemoteObject implements OperateFormDataService{

	String filename="SerializableData/OperateForm.ser";
	ArrayList<OperateFormPO> operateFormList;
	
	public OperateFormIO() throws RemoteException {
		super();
		IOHelper io=new IOHelper();
		operateFormList=new ArrayList<OperateFormPO>();
		try {
			operateFormList=(ArrayList<OperateFormPO>)io.readFromDisk(filename);
		} catch (ClassNotFoundException e) {
			
		} catch (IOException e) {
			
		}
	}

	@Override
	public boolean createOperateForm(OperateFormPO operateForm) throws RemoteException {
		operateFormList.add(operateForm);
		return true;
	}

	@Override
	public ArrayList<OperateFormPO> getOperateFormList() throws RemoteException {
		if(operateFormList.size()>0)
			return operateFormList;
		else
			return null;
	}

	@Override
	public OperateFormPO getOperateForm(int index) throws RemoteException {
		if(index>=0&&index<operateFormList.size())
			return operateFormList.get(index);
		else
			return null;
	}

	@Override
	public boolean writeAllOperateForm() throws RemoteException {
		IOHelper io=new IOHelper();
		try {
			io.writeToDisk(filename, operateFormList);
			return true;
		} catch (IOException e) {
			
			return false;
		}
	}

}
