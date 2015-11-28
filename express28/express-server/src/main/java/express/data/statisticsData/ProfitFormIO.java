package express.data.statisticsData;

import java.io.IOException;
import java.rmi.RemoteException;
import java.rmi.server.UnicastRemoteObject;
import java.util.ArrayList;
import express.data.IOHelper.IOHelper;
import express.dataService.statisticsDataService.ProfitFormDataService;
import express.po.ProfitFormPO;

public class ProfitFormIO extends UnicastRemoteObject implements ProfitFormDataService{

	String filename="SerializableData/ProfitForm.ser";
	ArrayList<ProfitFormPO> profitFormList;
	
	public ProfitFormIO() throws RemoteException {
		super();
		IOHelper io=new IOHelper();
		profitFormList=new ArrayList<ProfitFormPO>();
		try {
			profitFormList=(ArrayList<ProfitFormPO>)io.readFromDisk(filename);
		} catch (ClassNotFoundException e) {
			
		} catch (IOException e) {
			
		}
	}

	@Override
	public boolean createProfitForm(ProfitFormPO profitForm) throws RemoteException {
		profitFormList.add(profitForm);
		return true;
	}

	@Override
	public ArrayList<ProfitFormPO> getProfitFormList() throws RemoteException {
		if(profitFormList.size()>0)
			return profitFormList;
		else
			return null;
	}

	@Override
	public ProfitFormPO getProfitForm(int index) throws RemoteException {
		if(index>=0&&index<profitFormList.size())
			return profitFormList.get(index);
		else
			return null;
	}

	@Override
	public boolean writeAllProfitForm() throws RemoteException {
		IOHelper io=new IOHelper();
		try {
			io.writeToDisk(filename, profitFormList);
			return true;
		} catch (IOException e) {
			
			return false;
		}
	}

}
