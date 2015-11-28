package express.po;

import java.io.Serializable;

public class SalaryPO implements Serializable{
	private UserRole position;
	private String strategy;
	private double money;
	
	public SalaryPO(UserRole position,String strategy,double money){
		this.position = position;
		this.strategy = strategy;
		this.money = money;
	}
		
	public UserRole getPosition(){
		return position;
	}
	
	public boolean setPosition(UserRole pos){
		this.position = pos;
		return false;
	}
	
	public String getStrategy(){
		return strategy;
	}
	
	public boolean setStrategy(String strategy){
		this.strategy = strategy;
		return false;
	}
	
	public double getMoney(){
		return money;
	}
	
	public boolean setMoney(double money){
		this.money  = money;
		return false;
	}
}
