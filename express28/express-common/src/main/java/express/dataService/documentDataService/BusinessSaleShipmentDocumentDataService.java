package express.dataService.documentDataService;

import java.rmi.RemoteException;
import java.util.ArrayList;

import express.po.ShipmentDocPO;

public interface BusinessSaleShipmentDocumentDataService {
	public boolean createShipmentDoc(ShipmentDocPO po);
	public ShipmentDocPO getShipmentDoc(String OrderID);
	public boolean writeAllShipmentDoc() throws RemoteException;
	public ArrayList<ShipmentDocPO> getShipmentDoclist() throws RemoteException;
}
