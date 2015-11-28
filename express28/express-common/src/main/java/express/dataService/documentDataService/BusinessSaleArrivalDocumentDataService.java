package express.dataService.documentDataService;

import java.rmi.Remote;
import java.rmi.RemoteException;
import java.util.ArrayList;

import express.po.ArrivalDocPO;

public interface BusinessSaleArrivalDocumentDataService extends Remote{
	public boolean createArrivalDoc(ArrivalDocPO po) throws RemoteException;
	public ArrivalDocPO getArrivalDoc(String OrderID) throws RemoteException;
	public boolean writeAllArrivalDoc() throws RemoteException;
	public ArrayList<ArrivalDocPO> getArrivalDoclist() throws RemoteException;
}
