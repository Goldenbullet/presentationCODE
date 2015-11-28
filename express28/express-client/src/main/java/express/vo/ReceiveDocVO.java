package express.vo;

import java.util.ArrayList;

public class ReceiveDocVO {
	private String receiveDate;
	private double receivePrice;
	private String deliverManID;
	private ArrayList<String> allOrderIDs;
	
	public ReceiveDocVO(String receiveDate,double receivePrice,String deliverManID,ArrayList<String> allOrderIDs){
		this.receiveDate=receiveDate;
		this.receivePrice=receivePrice;
		this.deliverManID=deliverManID;
		this.allOrderIDs=allOrderIDs;

	}

	public String getReceiveDate(){
		return receiveDate;
	}
	
	public double getReceivePrice(){
		return receivePrice;
	}
	
	public String getDeliverManID(){
		return deliverManID;
	}
	
	public ArrayList<String> getAllOrderIDs(){
		return allOrderIDs;
	}
}
