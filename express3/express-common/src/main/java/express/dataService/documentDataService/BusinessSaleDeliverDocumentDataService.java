package express.dataService.documentDataService;

import express.po.DeliverDocPO;

public interface BusinessSaleDeliverDocumentDataService {
	public boolean createDeliverDoc(DeliverDocPO po);
	public DeliverDocPO getDeliverDoc(String OrderID);
}
