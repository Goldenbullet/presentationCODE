package express.dataService.documentDataService;

import java.rmi.RemoteException;
import java.util.ArrayList;

import express.po.DeliverDocPO;
import express.po.ReceiveDocPO;

public interface BusinessSaleReceiveDocumentDataService {
	public boolean createReceiveDoc(ReceiveDocPO po);
	public ReceiveDocPO getReceiveDoc(String date,String delivermanID);
	public boolean writeAllReceiveDoc() throws RemoteException;
	public ArrayList<ReceiveDocPO> getReceiveDoclist() throws RemoteException;
	
}
