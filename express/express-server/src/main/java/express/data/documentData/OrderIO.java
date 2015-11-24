package express.data.documentData;

import express.dataService.documentDataService.DeliverCreateOrderDataService;
import express.po.GoodTransStatusPO;
import express.po.OrderPO;

public class OrderIO implements DeliverCreateOrderDataService{
	public boolean createOrder(OrderPO po){
		return false;
	}
	public boolean changeGoodsState(GoodTransStatusPO po){
		return false;
	}
	public OrderPO getOrder(String orderid){
		return new OrderPO();
	}
	
}
