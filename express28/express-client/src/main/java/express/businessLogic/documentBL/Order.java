package express.businessLogic.documentBL;

import express.businessLogic.infoManageBL.DistanceManager;
import express.dataService.documentDataService.DeliverCreateOrderDataService;
import express.po.OrderPO;
import express.vo.ArrivalTimeVO;
import express.vo.OrderVO;
import express.rmi.RMIClient;

public class Order {
	DeliverCreateOrderDataService rmiObj;
	
	public Order(){
		rmiObj=RMIClient.getOrderObject();
	}
	
	
	public boolean addOrder(OrderVO vo){
		OrderPO po=new OrderPO();
		po.setGoodsInfo(vo.getNumberOfGoods(), vo.getWeight(), vo.getVolume(), vo.getNameOfGoods(), vo.getType());
		po.setReceiverInfo(vo.getReceiverName(), vo.getReceiverAddress(), vo.getReceiverWorkPlace(), 
							vo.getReceiverCellPhoneNum(), vo.getReceiverTelephoneNum(),vo.getEndCity());
		po.setSenderInfo(vo.getSenderName(), vo.getSenderAddress(), vo.getSenderWorkPlace(), 
								vo.getSenderCellPhoneNum(), vo.getSenderTelephoneNum(),vo.getStartCity());
		
		
		try{
			rmiObj.createOrder(po);
		}catch(Exception e){
			e.printStackTrace();
		}
		
		
		return true;
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
		DistanceManager distancemanager=new DistanceManager();
		distance=distancemanager.getTwoCityDistance(vo.getEndCity(), vo.getStartCity());
		
		
		
		
		
		
		
		
		
		
		return 0;
	}
	public OrderVO getOrder(String id){
		return new OrderVO();
	}
	public ArrivalTimeVO getPredictArrivalTime(){
		return new ArrivalTimeVO();
	}	
	
	public static void main(String[] args){
		try{
			RMIClient.init();
			
		}catch(Exception e){
			e.printStackTrace();
		}
		
		
		Order order=new Order();
		order.getTotal(null);
	}
	
	
	
}
