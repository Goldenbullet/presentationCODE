package express.businessLogic.documentBL;

import express.vo.ShipmentDocVO;

public class MockShipmentDocController extends ShipmentDocController{
	public boolean addShipmentDoc(ShipmentDocVO vo){
		MockShipmentDoc mockshipmentdoc=new MockShipmentDoc();
		return mockshipmentdoc.addShipmentDoc(vo);
	}

}