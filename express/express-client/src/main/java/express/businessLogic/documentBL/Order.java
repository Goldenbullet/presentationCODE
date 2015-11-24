package express.businessLogic.documentBL;

import express.vo.ArrivalTimeVO;
import express.vo.OrderVO;

public class Order {
	public boolean addOrder(OrderVO vo){
		return false;
	}
	public boolean isCellPhoneAvailable(String cellphonenumber){
		return false;
	}
	public double getTotal(){
		return 0;
	}
	public OrderVO getOrder(String id){
		return new OrderVO();
	}
	public ArrivalTimeVO getPredictArrivalTime(){
		return new ArrivalTimeVO();
	}	
	
	
	
}
