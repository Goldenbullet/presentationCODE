package express.po;

import java.io.Serializable;

public class ReceiveInfoPO implements Serializable{
	private String receiverName;
	private String receiveTime;
	private String OrderID;
	
	
	public ReceiveInfoPO(String receiverName,String receiveTime,String OrderID){
		this.receiverName=receiverName;
		this.receiveTime=receiveTime;
		this.OrderID=OrderID;
	}
	
	public String getReceiverName(){		
		return receiverName;
	}
	
	public String getReceiveTime(){
		return receiveTime;
	}
	public String getOrderID(){
		return OrderID;
	}
	
}
