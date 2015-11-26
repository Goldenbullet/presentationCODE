package express.po;

import java.io.Serializable;
import java.util.ArrayList;

public class BankAccountPO implements Serializable{
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private String name;
	private ArrayList<Double> income;
	private ArrayList<Double> outcome;
	private double balance;
	
	public BankAccountPO(String name,ArrayList<Double> income,ArrayList<Double> outcome,double balance){
		this.name=name;
		this.income=income;
		this.outcome=outcome;
		this.balance=balance;
	}
	public String getName(){
		return name;
	}
	public ArrayList<Double> getIncome(){
		return income;
	}
	public ArrayList<Double> getOutcome(){
		return outcome;
	}
	public double getBalance(){
		return balance;
	}
	public void setName(String n){
		name=n;
	}
	public void addIncome(double in){
		income.add(in);
	}
	public void addOutcome(double out){
		outcome.add(out);
	}
	public void setBalance(){
		double sum=0;
		for(double item:income)
			sum+=item;
		for(double item:outcome)
			sum-=item;
		balance=sum;
	}
	public void initBalance(double n){
		balance=n;
	}
}
