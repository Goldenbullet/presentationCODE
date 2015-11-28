package express.dataService.documentDataService;

import java.rmi.Remote;
import java.rmi.RemoteException;

import express.po.GoodTransStatusPO;

public interface SearchDataService extends Remote{

	public GoodTransStatusPO search(String id) throws RemoteException;
 
}
