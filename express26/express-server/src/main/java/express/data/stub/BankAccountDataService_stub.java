package express.data.stub;

import java.util.ArrayList;

import express.dataService.bankAccountDataService.BankAccountDataService;
import express.po.BankAccountPO;

public class BankAccountDataService_stub implements BankAccountDataService{
	BankAccountPO bankAccount;
	
	public BankAccountDataService_stub(String name,ArrayList<Double> income,
			ArrayList<Double> outcome,double balance){
		bankAccount=new BankAccountPO(name,income,outcome,balance);
	}
	
	
	public boolean createBankAccount(BankAccountPO bankAccount){
		return true;
	}
	
	public boolean deleteBankAccount(String name) {
		// TODO Auto-generated method stub
		return false;
	}
	
	public boolean changeBankAccount(BankAccountPO bankAccount){
		return true;
	}
	public ArrayList<BankAccountPO> getAllBankAccount() {
		// TODO Auto-generated method stub
		return null;
	}
	public ArrayList<BankAccountPO> getBankAccount(String name) {
		// TODO Auto-generated method stub
		return null;
	}
	public boolean changeBankAccount(BankAccountPO bankAccount, int index) {
		// TODO Auto-generated method stub
		return false;
	}


	public boolean writeAllBankAccount() {
		// TODO Auto-generated method stub
		return false;
	}
}
