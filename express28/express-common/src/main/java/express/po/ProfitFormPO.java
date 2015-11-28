package express.po;

import java.io.Serializable;
import java.util.ArrayList;

public class ProfitFormPO implements Serializable{
	private ArrayList<String> year;
	private ArrayList<String> month;
	private ArrayList<Integer> income;
	private ArrayList<Integer> outcome;
	private ArrayList<Integer> profit;
	
	public ProfitFormPO(ArrayList<String> year,ArrayList<String> month,
			ArrayList<Integer> income,ArrayList<Integer> outcome,ArrayList<Integer> profit){
		this.year=year;
		this.month=month;
		this.income=income;
		this.outcome=outcome;
		this.profit=profit;
	}
	public ArrayList<String> getYear(){
		return year;
	}
	public ArrayList<String> getMonth(){
		return month;
	}
	public ArrayList<Integer> getIncome(){
		return income;
	}
	public ArrayList<Integer> getOutcome(){
		return outcome;
	}
	public ArrayList<Integer> getProfit(){
		return profit;
	}
}
