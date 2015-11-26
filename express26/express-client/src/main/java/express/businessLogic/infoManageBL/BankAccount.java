package express.businessLogic.infoManageBL;

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.MalformedURLException;
import java.rmi.Naming;
import java.rmi.NotBoundException;
import java.rmi.RemoteException;
import java.util.ArrayList;

import rmi.RMIClient;
import express.businesslogicService.financialBLService.BankAccountBLService;
import express.data.bankAccountData.BankAccountIO;
import express.dataService.bankAccountDataService.BankAccountDataService;
import express.po.BankAccountPO;
import express.vo.BankAccountVO;

public class BankAccount implements BankAccountBLService{
	
	BankAccountDataService bank;
	
	public BankAccount(){
		bank=RMIClient.getBankAccountObject();
	}
	
	public boolean addBankAccount(BankAccountVO bankAccount) {
		//BankAccountPO 
		//bank.createBankAccount(bankAccount);
		return true;
	}

	public boolean checkDuplication(String name) {
		// TODO Auto-generated method stub
		return true;
	}

	public boolean removeBankAccount(String name) {
		// TODO Auto-generated method stub
		return true;
	}

	public BankAccountVO findBankAccount(String name) {
		// TODO Auto-generated method stub
		return null;
	}

	public boolean changeBankAccount(BankAccountVO bankAccount) {
		// TODO Auto-generated method stub
		return true;
	}

	public void endManage() {
		// TODO Auto-generated method stub
		
	}
	
	public 	ArrayList<BankAccountPO> test(){
		try {
			ArrayList<BankAccountPO> a=bank.getAllBankAccount();
			System.out.println(a);
			return a;
		} catch (RemoteException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			return null;
		}
	}

}
