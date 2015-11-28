package express.businessLogic.documentBL;

import express.businesslogicService.delivermanBLService.DeliverCreateOrderBLService;
import express.vo.ArrivalTimeVO;
import express.vo.OrderVO;

public class OrderController implements DeliverCreateOrderBLService{
	Order order=new Order();
	public boolean addOrder(OrderVO vo){
		return order.addOrder(vo);
	}
	public boolean isCellPhoneAvailable(String cellphonenumber){
		return order.isCellPhoneAvailable(cellphonenumber);
	}
	public double getTotal(OrderVO vo){
		return order.getTotal(vo);
	}
	public OrderVO getOrder(String id){
		return order.getOrder(id);
	}
	public ArrivalTimeVO getPredictArrivalTime(){
		return order.getPredictArrivalTime();
	}
	public void endOrder(){
		
	}
}
