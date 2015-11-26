package express.data.documentData;

import express.dataService.documentDataService.BusinessSaleShipmentDocumentDataService;
import express.po.ShipmentDocPO;

public class ShipmentDocIO implements BusinessSaleShipmentDocumentDataService{
	public boolean createShipmentDoc(ShipmentDocPO po){
		return false;
	}
	public ShipmentDocPO getShipmentDoc(String OrderID){
		return new ShipmentDocPO(null, null, null, null, null, null, null, null, 0);
	}
}
