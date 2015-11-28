package express.businessLogic.documentBL;

import express.businesslogicService.businessSaleBLService.BusinessSaleShipmentDocumentblService;
import express.vo.ShipmentDocVO;

public class ShipmentDocController implements BusinessSaleShipmentDocumentblService{
	ShipmentDoc shipmentdoc=new ShipmentDoc();
	ShipmentDocCheck shipmentdocchecker= new ShipmentDocCheck();
	
			public boolean addShipmentDoc(ShipmentDocVO vo){
					if(isTransIDavailable(vo.gettranscenterNumber())){
						return shipmentdoc.addShipmentDoc(vo);
						
					}
					else {
						return false;
					}	
			}
	
			
			
			public ShipmentDocVO getShipmentDoc(String shipmentID){
				
				return shipmentdoc.getShipmentDoc(shipmentID);
			}
			
			public void endShipmentDoc(){
				
			}

			public boolean isTransIDavailable(String transid) {
				return shipmentdocchecker.isTransIDavailable(transid);
			}
}
