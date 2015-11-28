package express.businesslogicService.businessSaleBLService;

import express.vo.ShipmentDocVO;

public interface BusinessSaleShipmentDocumentblService {
	public boolean addShipmentDoc(ShipmentDocVO vo);
	public ShipmentDocVO getShipmentDoc(String shipmentID) ;
	public boolean isTransIDavailable(String transid);
	
	public void endShipmentDoc();
}
