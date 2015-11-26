package express.dataService.documentDataService;

import express.po.ReceiveDocPO;

public interface BusinessSaleReceiveDocumentDataService {
	public boolean createReceiveDoc(ReceiveDocPO po);
	public ReceiveDocPO getReceiveDoc(String date);
}
