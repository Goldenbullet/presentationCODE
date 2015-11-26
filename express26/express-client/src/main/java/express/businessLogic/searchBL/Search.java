package express.businessLogic.searchBL;

import express.businessLogic.documentBL.CheckOrder;
import express.businesslogicService.customerBLService.SearchBLService;
import express.vo.GoodTransStatusVO;

public class Search implements SearchBLService{
	public GoodTransStatusVO getOrderIDStatus(String orderID){
		return new GoodTransStatusVO();
	}
	public boolean isOrderIDAvailable(String id){
		CheckOrder checker=new CheckOrder();
		return checker.isOrderIDAvailable(id);
	}
}
