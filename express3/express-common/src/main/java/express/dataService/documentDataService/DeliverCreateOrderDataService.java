package express.dataService.documentDataService;

import express.po.GoodTransStatusPO;
import express.po.OrderPO;

public interface DeliverCreateOrderDataService {
	public boolean createOrder(OrderPO po);
	public boolean changeGoodsState(GoodTransStatusPO po);
	public OrderPO getOrder(String orderid);
}
