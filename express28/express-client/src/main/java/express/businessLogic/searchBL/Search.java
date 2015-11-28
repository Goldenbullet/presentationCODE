package express.businessLogic.searchBL;

import express.businessLogic.documentBL.CheckOrder;
import express.businesslogicService.customerBLService.SearchBLService;
import express.dataService.documentDataService.SearchDataService;
import express.po.GoodTransStatusPO;
import express.vo.GoodTransStatusVO;
import express.rmi.RMIClient;

public class Search implements SearchBLService{
	SearchDataService search;
	public Search () {
		search=RMIClient.getSearchObject();
	}
	
	public GoodTransStatusVO getOrderIDStatus(String orderID){
		if(isOrderIDAvailable(orderID)){
			GoodTransStatusPO po=new GoodTransStatusPO();
			try{
			
			po=search.search(orderID);
			}catch(Exception e){
				e.printStackTrace();
			}
			
			System.out.print(po.getDeliverManID());
			
			
			return null;
			
			
		}
		else{
			GoodTransStatusVO nullvo=new GoodTransStatusVO();
			nullvo.setOrderID("-1");
			return nullvo;
		}
		
		
		
	}
	public boolean isOrderIDAvailable(String id){
		CheckOrder checker=new CheckOrder();
		return checker.isOrderIDAvailable(id);
	}
	
	
}
