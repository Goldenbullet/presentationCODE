package express.dataService.documentDataService;

import java.rmi.Remote;
import java.rmi.RemoteException;

import express.po.GoodTransStatusPO;
import express.po.OrderPO;

public interface DeliverCreateOrderDataService extends Remote{
	public boolean createOrder(OrderPO po) throws RemoteException;
	public boolean changeGoodsState(GoodTransStatusPO po) throws RemoteException;
	public OrderPO getOrder(String orderid) throws RemoteException;
}
