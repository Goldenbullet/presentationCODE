package express.businessLogic.infoManageBL;

import express.vo.BankAccountVO;

public class MockBankAccount extends BankAccount{

	public boolean addBankAccount(BankAccountVO bankAccount) {
		// TODO Auto-generated method stub
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
}
