package express.businesslogicService.businessSaleBLService;

import express.vo.ShipmentDocVO;

public interface BusinessSaleShipmentDocumentblService {
	public boolean addShipmentDoc(ShipmentDocVO vo);
	public ShipmentDocVO getShipmentDoc(String shipmentID) ;
	public boolean isOrderIDavailable(String id);
	public boolean isBusinessshallavailable(String Businessshallid);
	public boolean isTransCarIDavailable(String TransCarIDid);
	
	public void endShipmentDoc();
}
