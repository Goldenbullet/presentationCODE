package express.vo;

import java.util.ArrayList;

import express.po.BankAccountPO;

public class BankAccountVO {
	/**
	 * 
	 */
	private String name;
	private double income;
	private double outcome;
	private double balance;
	private String bankAccountID;
	
	public BankAccountVO(String name,double income,double outcome,
			double balance){
		this.name=name;
		this.income=income;
		this.outcome=outcome;
		this.balance=balance;
		this.bankAccountID=null;
	}
	public BankAccountVO(BankAccountPO po){
		this.name=po.getName();
		this.income=po.getIncome();
		this.outcome=po.getOutcome();
		this.balance=po.getBalance();
		this.bankAccountID=po.getID();
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
