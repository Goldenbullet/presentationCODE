package express.data.documentData;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.rmi.RemoteException;
import java.rmi.server.UnicastRemoteObject;
import java.util.ArrayList;

import express.data.IOHelper.IOHelper;
import express.dataService.documentDataService.BusinessSaleArrivalDocumentDataService;
import express.po.ArrivalDocPO;
import express.po.DeliverDocPO;

public class ArrivalDocIO extends UnicastRemoteObject implements BusinessSaleArrivalDocumentDataService{

	ArrayList<ArrivalDocPO> arrivaldoclist;
	String filepath="SerializableData/ARArrivalDoc.ser";
	
	
	public  ArrivalDocIO() throws RemoteException{
		super();
		arrivaldoclist=new ArrayList<ArrivalDocPO>();
		try{
			IOHelper io=new IOHelper();
			arrivaldoclist=(ArrayList<ArrivalDocPO>)io.readFromDisk(filepath);
		}catch(ClassNotFoundException e){
			e.printStackTrace();
		}catch (IOException e) {
			e.printStackTrace();
		}
		
		
	}
	
	public boolean createArrivalDoc(ArrivalDocPO po) throws RemoteException{
		System.out.println("writing...arrivaldoc......");
		arrivaldoclist.add(po);
		//writeAllDeliverDoc();//决定是否在此时写入磁盘
		return true;
		
	}

	@Override
	public ArrivalDocPO getArrivalDoc(String OrderID) throws RemoteException{
		int len=arrivaldoclist.size();
		for(int i=0;i<len;i++){
			if(arrivaldoclist.get(i).getOrderID().equals(OrderID)){
				return arrivaldoclist.get(i);
			}
		}
		
		ArrivalDocPO notfind=new ArrivalDocPO("-1",null,null,null,null,null);
		return notfind;

	}
	
	public boolean writeAllArrivalDoc() throws RemoteException{
		try{
			IOHelper io=new IOHelper();
			io.writeToDisk(filepath, arrivaldoclist);
			return true;
		}catch(Exception e){
			return false;
		}
	}

	@Override
	public ArrayList<ArrivalDocPO> getArrivalDoclist() throws RemoteException{
		return arrivaldoclist;
	}
		
}
