package express.data.documentData;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.FilterOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;
import java.lang.reflect.Array;
import java.rmi.RemoteException;
import java.rmi.server.UnicastRemoteObject;
import java.util.ArrayList;

import express.dataService.documentDataService.SearchDataService;
import express.po.GoodTransStatusPO;

public class GoodTransStatusIO extends UnicastRemoteObject implements SearchDataService,Serializable{
	ArrayList<GoodTransStatusPO> goodtranslist;
	
	public GoodTransStatusIO() throws RemoteException{
		super();
		goodtranslist=new ArrayList<GoodTransStatusPO>();
		try{
			FileInputStream fis=new FileInputStream("SerializableData/ARGoodtransstatus.ser");
			ObjectInputStream ois =new ObjectInputStream(fis);
			goodtranslist=(ArrayList<GoodTransStatusPO>) ois.readObject();
			ois.close();
		}catch(ClassNotFoundException e){
			e.printStackTrace();
		}catch(IOException e){
			e.printStackTrace();
		}
		
	}
	
	public GoodTransStatusPO search(String id) throws RemoteException{
		System.out.println("entered");
		int len=goodtranslist.size();
		for(int i=0;i<len;i++){
			if(goodtranslist.get(i).getOrderID().equals(id)){
				System.out.println(i);
				return goodtranslist.get(i);
				
			}
		}
		GoodTransStatusPO notfind=new GoodTransStatusPO();
		notfind.setOrderID("-1");
		return notfind;
	}
	
	
	public boolean changeGoodtransstatus(GoodTransStatusPO po) throws RemoteException{
		String id=po.getOrderID();	
		int len=goodtranslist.size();
		for(int i=0;i<len;i++){
			if(goodtranslist.get(i).getOrderID().equals(id)){
				goodtranslist.remove(i);
				break;
			}
		}
		goodtranslist.add(po);
		
		try{
			FileOutputStream fos=new FileOutputStream("SerializableData/ARGoodtransstatus.ser",false);
			ObjectOutputStream oos=new ObjectOutputStream(fos);
			oos.writeObject(goodtranslist);
			oos.close();
			
		}catch(Exception e){
			return false;
		}
		
		return true;
		
	}
	
	
	
	
	
	
	
	
	

//	public static void main(String[] args){
//		try{
//			GoodTransStatusIO x=new GoodTransStatusIO();
//		x.search("a0911");
//		}catch(Exception e){
//			e.printStackTrace();
//		}
//		System.out.println("done");
		
//		GoodTransStatusPO a=new GoodTransStatusPO();
//		a.setDeliverManID("a001");
//		a.setFirstBusinessHallID("a0001");
//		a.setFirsttransCenterID("a000001");
//		a.setOrderID("a0911");
//		a.setSecondBusinessHallID("asecbusinesshall");
//		a.setSecondtransCenterID("asecondtrans");
//		ArrayList<String> t=new ArrayList<String>();
//		t.add("000001");
//		t.add("000002");
//		t.add("00000003");
//		t.add("0009");
//		a.setTime(t);
//		
//		
//		GoodTransStatusPO b=new GoodTransStatusPO();
//		b.setDeliverManID("b001");
//		b.setFirstBusinessHallID("b0001");
//		b.setFirsttransCenterID("b000001");
//		b.setOrderID("0000000001");
//		b.setSecondBusinessHallID("bbusinesshall");
//		b.setSecondtransCenterID("bsecondtrans");
//		b.setTime(t);
//		
//		
//		ArrayList<GoodTransStatusPO> arr=new ArrayList<GoodTransStatusPO>();
//		arr.add(a);
//		arr.add(b);
//		
//		
//		try{
//			FileOutputStream fos=new FileOutputStream("SerializableData/ARGoodtransstatus.ser",false);
//			ObjectOutputStream oos=new ObjectOutputStream(fos);
//			oos.writeObject(arr);
//			
//			oos.close();		
//		}catch(Exception e){
//			e.printStackTrace();
//		}
//		
//		
		
		
		
		
		
	//}
	
}
