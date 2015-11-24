package express.po;

import java.io.Serializable;

public class PricePO implements Serializable{
	private double price;
	
	public PricePO(double price){
		this.price = price;
	}
	public double getPrice(){
		return price;
	}
	
	public boolean setPrice(double price){
		this.price = price;
		return false;
	}
}
