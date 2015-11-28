package express.po;

import java.io.Serializable;
import java.util.ArrayList;

public class BankAccountPO implements Serializable{
	
	private String name;
	private double income;
	private double outcome;
	private double balance;
	private String bankAccountID;
	
	public BankAccountPO(String name,double income,double outcome,
			double balance,String bankAccountID){
		this.name=name;
		this.income=income;
		this.outcome=outcome;
		this.balance=balance;
		this.bankAccountID=bankAccountID;
	}
	
	public BankAccountPO(){
		this.name=" ";
		this.income=0;
		this.outcome=0;
		this.balance=0;
	}
	public String getName(){
		return name;
	}
	public double getIncome(){
		return income;
	}
	public double getOutcome(){
		return outcome;
	}
	public double getBalance(){
		return balance;
	}
	public void setName(String n){
		name=n;
	}
	public void addIncome(double in){
		income+=in;
		balance+=in;
	}
	public void addOutcome(double out){
		outcome+=out;
		balance-=out;
	}
	public void initBalance(double n){
		balance=n;
	}
	public String getID(){
		return bankAccountID;
	}
	public void setID(String id){
		bankAccountID=id;
	}
}
