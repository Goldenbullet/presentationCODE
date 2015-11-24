package express.businessLogic.stub;

import java.util.ArrayList;

import express.businesslogicService.financialBLService.BankAccountBLService;
import express.vo.BankAccountVO;

public class BankAccountBLService_stub implements BankAccountBLService{
	
	BankAccountVO bankAccount;
	
	public BankAccountBLService_stub(BankAccountVO bankAccount){
		this.bankAccount=bankAccount;
	}
	
	public boolean addBankAccount(BankAccountVO bankAccount){
		return true;
	}
	
	public boolean checkDuplication(String name){
		if(name.equals("1001001001001"))
			return true;
		else
			return false;
	}
	
	public boolean removeBankAccount(String name) {
		// TODO Auto-generated method stub
		return false;
	}
	
	public BankAccountVO findBankAccount(String name){
		return new BankAccountVO();
	}
	
	public boolean changeBankAccount(BankAccountVO bankAccount){
		return true;
	}
	
	public void endManage(){
		System.out.println("2015-10-26 10:50:40"+"银行账户管理");
	}
}
