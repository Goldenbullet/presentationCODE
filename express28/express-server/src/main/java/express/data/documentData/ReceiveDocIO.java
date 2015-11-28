package express.data.documentData;

import java.io.IOException;
import java.rmi.RemoteException;
import java.rmi.server.UnicastRemoteObject;
import java.util.ArrayList;

import express.data.IOHelper.IOHelper;
import express.dataService.documentDataService.BusinessSaleReceiveDocumentDataService;
import express.po.DeliverDocPO;
import express.po.ReceiveDocPO;

public class ReceiveDocIO extends UnicastRemoteObject implements BusinessSaleReceiveDocumentDataService{
	ArrayList<ReceiveDocPO> receivedoclist;
	String filepath="SerializableData/ARReceiveDoc.ser";
	public  ReceiveDocIO() throws RemoteException {
		super();
		receivedoclist=new ArrayList<ReceiveDocPO>();
		try{
			IOHelper io=new IOHelper();
			receivedoclist=(ArrayList<ReceiveDocPO>) io.readFromDisk(filepath);
		}catch(ClassNotFoundException e){
			e.printStackTrace();
		}catch (IOException e) {
			e.printStackTrace();
		}

	}

	@Override
	public boolean createReceiveDoc(ReceiveDocPO po) {
		System.out.println("writing...receivedoc......");
		receivedoclist.add(po);
		//writeAllDeliverDoc();//决定是否在此时写入磁盘
		return true;

	}

	@Override
	public ReceiveDocPO getReceiveDoc(String date,String delivermanID) {
		int len=receivedoclist.size();
		for(int i=0;i<len;i++){
			if(receivedoclist.get(i).getReceiveDate().equals(date)){
				if(receivedoclist.get(i).getDeliverManID().equals(delivermanID)){
					return receivedoclist.get(i);
				}
			}
		}
		return null;
	}

	@Override
	public boolean writeAllReceiveDoc() throws RemoteException {
		try{
			IOHelper io=new IOHelper();
			io.writeToDisk(filepath, receivedoclist);
			return true;
		}catch(Exception e){
			return false;
		}
	}

	@Override
	public ArrayList<ReceiveDocPO> getReceiveDoclist() throws RemoteException {
		return receivedoclist;
	}

}
