package express.dataService.documentDataService;

import express.po.ShipmentDocPO;

public interface BusinessSaleShipmentDocumentDataService {
	public boolean createShipmentDoc(ShipmentDocPO po);
	public ShipmentDocPO getShipmentDoc(String OrderID);
	
}
