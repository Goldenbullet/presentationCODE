package express.businessLogic.documentBL;

import express.businesslogicService.businessSaleBLService.BusinessSaleDeliverDocumentblService;
import express.vo.DeliverDocVO;

public class DeliverDoc implements BusinessSaleDeliverDocumentblService{
	public boolean addDeliverDoc(DeliverDocVO vo){
		return false;
	}
	public DeliverDocVO getDeliverDoc(String OrderID){
		return new DeliverDocVO();
	}
	public boolean isOrderIDavailable(String id){
		CheckOrder checker=new CheckOrder();
		return checker.isOrderIDAvailable(id);
	}
	public void  endDeliverDoc(){
		
	}
}
