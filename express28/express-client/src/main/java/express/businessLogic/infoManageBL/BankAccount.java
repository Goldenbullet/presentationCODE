package express.businessLogic.infoManageBL;

import java.rmi.RemoteException;
import java.util.ArrayList;

import express.businessLogic.syslogBL.SysLog;
import express.businesslogicService.financialBLService.BankAccountBLService;
import express.dataService.bankAccountDataService.BankAccountDataService;
import express.po.BankAccountPO;
import express.rmi.RMIClient;
import express.vo.BankAccountVO;

public class BankAccount implements BankAccountBLService{
	
	BankAccountDataService bank;
	
	public BankAccount(){
		bank=RMIClient.getBankAccountObject();
	}
	
	public ArrayList<BankAccountVO> showAllBankAccount() {
		ArrayList<BankAccountVO> bankAccountList=new ArrayList<BankAccountVO>();
		try {
			ArrayList<BankAccountPO> b=bank.getAllBankAccount();
			if(b==null)
				return null;
			for(BankAccountPO po:b)
				bankAccountList.add(new BankAccountVO(po));
			return bankAccountList;
		} catch (RemoteException e) {
			
			return null;
		}
	}
	
	public boolean addBankAccount(BankAccountVO bankAccount) {
		BankAccountPO po=new BankAccountPO();
		po.setName(bankAccount.getName());
		po.addIncome(Math.abs(bankAccount.getIncome()));
		po.addOutcome(Math.abs(bankAccount.getOutcome()));
		String id=String.valueOf(System.currentTimeMillis());
		po.setID(id);
		try {
			bank.createBankAccount(po);
			return true;
		} catch (RemoteException e) {
			
			return false;
		}
		
	}

	public boolean checkDuplication(String name) {
		try {
			ArrayList<BankAccountPO> a=bank.getAllBankAccount();
			for(BankAccountPO po:a){
				if(po.getName().equals(name))
					return false;
			}
			return true;
		} catch (RemoteException e) {
			
			return false;
		}
		
	}

	public boolean removeBankAccount(String id) {
		try {
			return bank.deleteBankAccount(id);
		} catch (RemoteException e) {
			
			return false;
		}
	}

	public ArrayList<BankAccountVO> findBankAccount(String name) {
		try {
			ArrayList<BankAccountPO> bp=bank.getBankAccount(name);
			ArrayList<BankAccountVO> result=new ArrayList<BankAccountVO>();
			for(BankAccountPO bankAccount:bp){
				result.add(new BankAccountVO(bankAccount));
			}
			return result;
		} catch (RemoteException e) {
			
			return null;
		}
	}

	public boolean changeBankAccount(BankAccountVO bankAccount,String id) {
		try {
			BankAccountPO po=new BankAccountPO();
			po.setName(bankAccount.getName());
			po.addIncome(Math.abs(bankAccount.getIncome()));
			po.addOutcome(Math.abs(bankAccount.getOutcome()));
			po.setID(id);
			bank.changeBankAccount(po,id);
			return true;
		} catch (RemoteException e) {
			
			return false;
		}
	}

	public void endManage() {
		SysLog log=new SysLog();
		log.addSysLog("银行账户处理");
		try {
			bank.writeAllBankAccount();
		} catch (RemoteException e) {
			
		}
	}

}
