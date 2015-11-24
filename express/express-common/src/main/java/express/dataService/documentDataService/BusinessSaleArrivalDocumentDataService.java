package express.dataService.documentDataService;

import express.po.ArrivalDocPO;

public interface BusinessSaleArrivalDocumentDataService {
	public boolean createArrivalDoc(ArrivalDocPO po);
	public ArrivalDocPO getArrivalDoc(String OrderID);
}
