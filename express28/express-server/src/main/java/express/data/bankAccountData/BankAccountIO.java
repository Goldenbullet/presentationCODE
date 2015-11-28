package express.data.bankAccountData;

import java.io.IOException;
import java.rmi.RemoteException;
import java.rmi.server.UnicastRemoteObject;
import java.util.ArrayList;

import express.data.IOHelper.IOHelper;
import express.dataService.bankAccountDataService.BankAccountDataService;
import express.po.BankAccountPO;

public class BankAccountIO extends UnicastRemoteObject implements BankAccountDataService{
	
	String filename="SerializableData/BankAccount.ser";
	ArrayList<BankAccountPO> bankAccountList;

	public BankAccountIO() throws RemoteException{
		super();
		bankAccountList=new ArrayList<BankAccountPO>();
		IOHelper io=new IOHelper();
		try{
			bankAccountList=(ArrayList<BankAccountPO>)io.readFromDisk(filename);
		}catch (ClassNotFoundException e) {
			
		}catch(IOException e){
			
		}
	}
	
	public ArrayList<BankAccountPO> getAllBankAccount() throws RemoteException{
		if(bankAccountList.size()>0)
			return bankAccountList;
		else
			return null;
	}
	
	public ArrayList<BankAccountPO> getBankAccount(String name) throws RemoteException{
		ArrayList<BankAccountPO> selectBankAccount=new ArrayList<BankAccountPO>();
		for(BankAccountPO bankAccount:bankAccountList){
			if(bankAccount.getName().contains(name)){
				selectBankAccount.add(bankAccount);
			}
		}
		if(selectBankAccount.size()>0)
			return selectBankAccount;
		else
			return null;
	}

	public boolean createBankAccount(BankAccountPO bankAccount) throws RemoteException{
		bankAccountList.add(bankAccount);
		return true;
	}

	public boolean deleteBankAccount(String id) throws RemoteException{
		if(bankAccountList.size()>0){
			for(BankAccountPO bankAccount:bankAccountList){
				if(bankAccount.getID().equals(id)){
					bankAccountList.remove(bankAccount);
					return true;
				}
			}
		}
		return false;
	}

	public boolean changeBankAccount(BankAccountPO bankAccount,String id) throws RemoteException{
		if(bankAccountList.size()>0){
			int count=0;
			for(BankAccountPO bank:bankAccountList){
				if(bankAccount.getID().equals(id)){
					bankAccountList.set(count, bankAccount);
					return true;
				}
				count++;
			}
		}
		return false;
	}
	
	public boolean writeAllBankAccount() throws RemoteException{
		try{
			IOHelper io=new IOHelper();
			io.writeToDisk(filename, bankAccountList);
		}catch(IOException e){
			return false;
		}
		return true;
	}

}
