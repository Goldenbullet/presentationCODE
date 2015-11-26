package express.businessLogic.documentBL;

import express.businesslogicService.businessSaleBLService.BusinessSaleShipmentDocumentblService;
import express.vo.ShipmentDocVO;

public class ShipmentDocController implements BusinessSaleShipmentDocumentblService{
	ShipmentDoc shipmentdoc=new ShipmentDoc();
	ShipmentDocCheck shipmentdocchecker= new ShipmentDocCheck();
	
			public boolean addShipmentDoc(ShipmentDocVO vo){
					return shipmentdoc.addShipmentDoc(vo);
			}
	
			public ShipmentDocVO getShipmentDoc(String shipmentID){
				return shipmentdoc.getShipmentDoc(shipmentID);
			}
	public boolean isOrderIDavailable(String id){
		return shipmentdocchecker.isOrderIDavailable(id);
	}
	public boolean isBusinessshallavailable(String Businessshallid){
		return shipmentdocchecker.isBusinessshallavailable(Businessshallid);
	}
	public boolean isTransCarIDavailable(String TransCarIDid){
		return shipmentdocchecker.isTransCarIDavailable(TransCarIDid);
	}
	
	public void endShipmentDoc(){
		
	}
}
