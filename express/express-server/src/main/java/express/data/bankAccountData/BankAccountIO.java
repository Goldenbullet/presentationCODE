package express.data.bankAccountData;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.rmi.RemoteException;
import java.rmi.server.UnicastRemoteObject;
import java.util.ArrayList;

import express.dataService.bankAccountDataService.BankAccountDataService;
import express.po.BankAccountPO;

public class BankAccountIO extends UnicastRemoteObject implements BankAccountDataService{
	
	String filename="SerializableData/BankAccount.ser";
	ArrayList<BankAccountPO> bankAccountList;

	public BankAccountIO() throws RemoteException{
		super();
		bankAccountList=new ArrayList<BankAccountPO>();
		try{
			FileInputStream fs=new FileInputStream(filename);
			ObjectInputStream os=new ObjectInputStream(fs);
			Object o=os.readObject();
			bankAccountList=(ArrayList<BankAccountPO>) o;
			os.close();
		}catch (ClassNotFoundException e) {
			e.printStackTrace();
		}catch(IOException e){
			e.printStackTrace();
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

	public boolean deleteBankAccount(String name) throws RemoteException{
		for(BankAccountPO bankAccount:bankAccountList){
			if(bankAccount.getName().equals(name)){
				bankAccountList.remove(bankAccount);
				return true;
			}
		}
		return false;
	}

	public boolean changeBankAccount(BankAccountPO bankAccount,int index) throws RemoteException{
		if(index<=bankAccountList.size()){
			bankAccountList.remove(index);
			bankAccountList.add(index,bankAccount);
			return true;
		}
		else
			return false;
	}
	
	public boolean writeAllBankAccount() throws RemoteException{
		try{
			FileOutputStream fs=new FileOutputStream(filename,false);
			ObjectOutputStream os=new ObjectOutputStream(fs);
			os.writeObject(bankAccountList);
			os.close();
		}catch(IOException e){
			return false;
		}
		return true;
	}

}
