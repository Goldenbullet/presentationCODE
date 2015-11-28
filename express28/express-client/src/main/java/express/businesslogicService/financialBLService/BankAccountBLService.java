package express.businesslogicService.financialBLService;

import java.util.ArrayList;

import express.vo.BankAccountVO;

public interface BankAccountBLService {
	
	public ArrayList<BankAccountVO> showAllBankAccount();

	public boolean addBankAccount(BankAccountVO bankAccount);
	
	public boolean checkDuplication(String name);
	
	public boolean removeBankAccount(String id);
	
	public ArrayList<BankAccountVO> findBankAccount(String name);
	
	public boolean changeBankAccount(BankAccountVO bankAccount,String id);
	
	public void endManage();
}
