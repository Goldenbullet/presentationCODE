package express.businessLogic.documentBL;

import java.rmi.RemoteException;
import java.util.ArrayList;
import java.util.Calendar;

import express.businessLogic.IDKeeper;
import express.businessLogic.infoManageBL.DistanceManager;
import express.businessLogic.infoManageBL.PriceManager;
import express.businessLogic.syslogBL.SysLog;
import express.businesslogicService.managerBLService.SysLogBLService;
import express.dataService.documentDataService.DeliverCreateOrderDataService;
import express.dataService.documentDataService.GoodsStatusDataService;
import express.dataService.documentDataService.PredictTimeDataService;
import express.po.GoodTransStatusPO;
import express.po.HistoryTimePO;
import express.po.OrderPO;
import express.po.PackageType;
import express.po.PredictTimePO;
import express.vo.ArrivalTimeVO;
import express.vo.DeliverDocVO;
import express.vo.OrderVO;
import express.rmi.RMIClient;

public class Order {
	DeliverCreateOrderDataService rmiObj;
	
	public Order(){
		System.out.println("Getting orderObj....");
		
		
		rmiObj=RMIClient.getOrderObject();
	}
	
	
	public String addOrder(OrderVO vo){  //返回订单号
		if(!isCellPhoneAvailable(vo.getReceiverCellPhoneNum())||!isCellPhoneAvailable(vo.getSenderCellPhoneNum())){
			return "cellPhone error";
		}
		
		OrderPO po=new OrderPO();
		po.setGoodsInfo(vo.getNumberOfGoods(), vo.getWeight(), 
						vo.getVolume(), vo.getNameOfGoods(), vo.getType(),vo.getPackageType());
		po.setReceiverInfo(vo.getReceiverName(), vo.getReceiverAddress(), vo.getReceiverWorkPlace(), 
							vo.getReceiverCellPhoneNum(), vo.getReceiverTelephoneNum(),vo.getEndCity());
		po.setSenderInfo(vo.getSenderName(), vo.getSenderAddress(), vo.getSenderWorkPlace(), 
								vo.getSenderCellPhoneNum(), vo.getSenderTelephoneNum(),vo.getStartCity());

		try{
			String ID=rmiObj.getNextOrderID();
			po.setOrderID(ID);
			rmiObj.createOrder(po);
			
			GoodTransStatusPO statuspo=new GoodTransStatusPO();
			statuspo.addStatus("快递已收件");
			statuspo.setOrderID(ID);
			
			
			Calendar c = Calendar.getInstance();
			int year=c.get(Calendar.YEAR);
			int month=-c.get(Calendar.MONTH+1)-1;
			int day=-c.get(Calendar.DATE);
			String date="";
			date+=year;
			date+=month;
			date+=day;
			statuspo.addTime(date);
			
			
			GoodsStatusDataService changeStatusObj=RMIClient.getGoodStatusObject();
			changeStatusObj.changeGoodtransstatus(statuspo);
			
			return ID;
		}catch(Exception e){
			e.printStackTrace();
		}
		
		return "Unknown Error Exception detected";
	}
	
	
	public boolean isCellPhoneAvailable(String cellphonenumber){
		if(cellphonenumber.length()==11){
			for(int i=0;i<11;i++){
				char c=cellphonenumber.charAt(i);
				if(c>=0&&c<=9){
					
				}
				else {
					return false;
				}
			}
			return true;
		}
		else {
			return false;
		}
		
	}
	public double getTotal(OrderVO vo){
		double distance;
		double transfee=0;
		double weight;
		double volume;
		//运费
		DistanceManager distancemanager=new DistanceManager();
		distance=distancemanager.getTwoCityDistance(vo.getEndCity(), vo.getStartCity());
		PriceManager pricemanager=new PriceManager();
		double price=pricemanager.getPricePerKMPerKilo(vo.getType());
		volume=vo.getVolume();
		weight=vo.getWeight();
		if(volume/weight>=8){
			double weight2=volume/5;
			if(weight<weight2){
				weight=weight2;
			}
		}	
		transfee=price*distance*weight;	
		//包装费
		double packagefee=0;
		if(vo.getPackageType().equals(PackageType.CardBox)){
			packagefee=5;
		}
		else if(vo.getPackageType().equals(PackageType.WoodBox)){
			packagefee=10;
		}
		else if(vo.getPackageType().equals(PackageType.DeliverBag)){
			packagefee=1;
		}
		
		double sum=transfee+packagefee;
		return sum;
	}
	
	
	
	
	public OrderVO getOrder(String id){
		OrderVO vo=new OrderVO();
		try{
			OrderPO po=rmiObj.getOrder(id);
			if(po==null){
				return null;
			}
			vo.setGoodsInfo(po.getNumberOfGoods(), po.getWeight(), 
					po.getVolume(), po.getNameOfGoods(), po.getType(),
					po.getPackageType());
			vo.setReceiverInfo(po.getReceiverName(), po.getReceiverAddress(), po.getReceiverWorkPlace(), 
					po.getReceiverCellPhoneNum(), po.getReceiverTelephoneNum(),po.getEndCity());
			vo.setSenderInfo(po.getSenderName(), po.getSenderAddress(), po.getSenderWorkPlace(), 
					po.getSenderCellPhoneNum(), po.getSenderTelephoneNum(),po.getStartCity());
			vo.setOrderID(id);
		}catch(Exception e){
			e.printStackTrace();
			return null;
		}
		
		return vo;
	}
	
	
	
	public ArrivalTimeVO getPredictArrivalTime(String startCity,String endCity){
		PredictTimeDataService pretimeObj=RMIClient.getPredictTimeObject();
		try {
			PredictTimePO allpretime=pretimeObj.getPredictlist(startCity,endCity);
			ArrayList<HistoryTimePO> historytime=allpretime.getList();
			
			int len=historytime.size();
			double sum=0;
			
			for(int i=0;i<len;i++){
				HistoryTimePO hpo=historytime.get(i);
				String setout=hpo.getSetOutTime();
				String arrive=hpo.getArrivalTime();
				long minus=dateToNum(arrive)-dateToNum(setout);
				sum+=minus;	
			}
			// 取上  比如：2.1天 记为3天
			double avg=sum/len;
			avg =Math.ceil(avg);
			int x=(int)avg;
			Calendar c = Calendar.getInstance();
			c.add(Calendar.DATE, x);
			int year=c.get(Calendar.YEAR);
			int month=-c.get(Calendar.MONTH+1)-1;
			int day=-c.get(Calendar.DATE);
			String predictdate="";
			predictdate+=year;
			predictdate+=month;
			predictdate+=day;

			return new ArrivalTimeVO(predictdate);

		} catch (RemoteException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return new ArrivalTimeVO("error");
	}	
	

	
	private long dateToNum(String date){// date format :yyyy-mm-dd
		String res[]=date.split("-");
		String result=res[0]+res[1]+res[2];
		long a=Long.parseLong(result);
		return a;
	}
	
	public void end(){
		try {
			SysLogBLService syslog=new SysLog();
			syslog.addSysLog("生成订单");
			rmiObj.writeAllOrder();
		} catch (RemoteException e) {
			e.printStackTrace();
		}
	}
	

	public ArrayList<OrderPO>  getAllOrder(){
		try {
			ArrayList<OrderPO> orderlist=rmiObj.getOrderlist();
			return orderlist;
		} catch (RemoteException e) {
			e.printStackTrace();
			return null;
		}
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	public ArrayList<OrderVO> getUnExamedOrder(){
		try{
			ArrayList<OrderPO> list=rmiObj.getOrderlist();
			ArrayList<OrderVO> unexam=new ArrayList<OrderVO>();
			for(OrderPO po:list){
				if(po.getState()==false){
					OrderVO vo=new OrderVO();
					vo.setOrderID(po.getOrderID());
					vo.setGoodsInfo(po.getNumberOfGoods(), po.getWeight(), po.getVolume(), po.getNameOfGoods(), po.getType(), po.getPackageType());
					vo.setReceiverInfo(po.getReceiverName(), po.getReceiverAddress(), po.getReceiverWorkPlace(), po.getReceiverCellPhoneNum(), po.getReceiverTelephoneNum(), po.getEndCity());
					vo.setSenderInfo(po.getSenderName(), po.getSenderAddress(), po.getSenderWorkPlace(), po.getSenderCellPhoneNum(), po.getSenderTelephoneNum(), po.getStartCity());
					unexam.add(vo);
					
				}	
			}
			
			return unexam;
		}catch(Exception e){
			e.printStackTrace();
		}
		return null;
	}
	
	
	public boolean changeOrder(OrderVO vo){
		OrderPO po=new OrderPO();
		po.setOrderID(vo.getOrderID());
		po.setGoodsInfo(vo.getNumberOfGoods(), vo.getWeight(), vo.getVolume(), vo.getNameOfGoods(), vo.getType(), vo.getPackageType());
		po.setReceiverInfo(vo.getReceiverName(), vo.getReceiverAddress(), vo.getReceiverWorkPlace(), vo.getReceiverCellPhoneNum(), vo.getReceiverTelephoneNum(), vo.getEndCity());
		po.setSenderInfo(vo.getSenderName(), vo.getSenderAddress(), vo.getSenderWorkPlace(), vo.getSenderCellPhoneNum(), vo.getSenderTelephoneNum(), vo.getStartCity());
		try{
			rmiObj.changeOrder(po);
			return true;
		}catch(Exception e){
			e.printStackTrace();
			return false;
		}
		
	}
	
	
	
	
	
	
}
