package express.data.documentData;

import express.dataService.documentDataService.BusinessSaleDeliverDocumentDataService;
import express.po.DeliverDocPO;

public class DeliverDocIO implements BusinessSaleDeliverDocumentDataService{
	public boolean createDeliverDoc(DeliverDocPO po){
		return false;
	}
	public DeliverDocPO getDeliverDoc(String OrderID){
		return new DeliverDocPO(null,null,null);
	}
}
