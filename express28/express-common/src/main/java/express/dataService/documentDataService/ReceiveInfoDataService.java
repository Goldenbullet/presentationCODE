package express.dataService.documentDataService;

import express.po.ReceiveInfoPO;

public interface ReceiveInfoDataService {
	public boolean createReceiveInfo(ReceiveInfoPO po);
	public ReceiveInfoPO getReceiveInfo(String orderID);
	
	
	
	
}
