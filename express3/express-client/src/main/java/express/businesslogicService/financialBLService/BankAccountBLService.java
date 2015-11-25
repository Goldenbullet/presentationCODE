package express.businesslogicService.financialBLService;

import express.vo.BankAccountVO;

public interface BankAccountBLService {

	public boolean addBankAccount(BankAccountVO bankAccount);
	
	public boolean checkDuplication(String name);
	
	public boolean removeBankAccount(String name);
	
	public BankAccountVO findBankAccount(String name);
	
	public boolean changeBankAccount(BankAccountVO bankAccount);
	
	public void endManage();
}
