package express.businessLogic.documentBL;

import express.vo.ShipmentDocVO;

public class MockShipmentDoc extends ShipmentDoc{
	public boolean addShipmentDoc(ShipmentDocVO vo){
		String orderid=vo.orderID;
		String Businessshallid=vo.Businessshallid;
		String TransCarIDid=vo.TransCarIDid;
		MockShipmentDocCheck checker=new MockShipmentDocCheck();
		if(checker.isBusinessshallavailable(Businessshallid)&&checker.isOrderIDavailable(orderid)&&checker.isTransCarIDavailable(TransCarIDid)){
			System.out.println("ShipmentDoc added!");
			return true;
		}
		else{
			return false;
		}
		
		
		
		
}
}
