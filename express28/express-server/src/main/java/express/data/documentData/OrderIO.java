package express.data.documentData;

import java.rmi.RemoteException;
import java.rmi.server.UnicastRemoteObject;

import express.dataService.documentDataService.DeliverCreateOrderDataService;
import express.po.GoodTransStatusPO;
import express.po.OrderPO;

public class OrderIO extends UnicastRemoteObject implements DeliverCreateOrderDataService{
	
	public OrderIO() throws RemoteException {
		super();
		// TODO Auto-generated constructor stub
	}
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
