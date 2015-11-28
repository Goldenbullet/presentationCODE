package express.businessLogic.documentBL;

import java.util.ArrayList;

import express.businessLogic.syslogBL.SysLog;
import express.businesslogicService.businessSaleBLService.BusinessSaleDeliverDocumentblService;
import express.businesslogicService.managerBLService.SysLogBLService;
import express.dataService.documentDataService.BusinessSaleDeliverDocumentDataService;
import express.po.DeliverDocPO;
import express.vo.DeliverDocVO;
import express.rmi.RMIClient;

public class DeliverDoc implements BusinessSaleDeliverDocumentblService{
	BusinessSaleDeliverDocumentDataService rmiObj;
	
	public DeliverDoc(){
		rmiObj=RMIClient.getDeliverDocObject();
	}
	
	
	
	public boolean addDeliverDoc(DeliverDocVO vo){
		DeliverDocPO po=new DeliverDocPO(vo.getArriveDate(), vo.getOrderID(), vo.getDeliverManID());
		try{
		rmiObj.createDeliverDoc(po);
		}catch(Exception e){
			e.printStackTrace();
		}
		return true;
	}
	public DeliverDocVO getDeliverDoc(String OrderID){
		if(isOrderIDavailable(OrderID)){
			try{
				DeliverDocPO po=rmiObj.getDeliverDoc(OrderID);
				DeliverDocVO vo=new DeliverDocVO(po.getArriveDate(), po.getOrderID(), po.getDeliverManID());
				return vo;
			}catch(Exception e){
				e.printStackTrace();
			}

		}
		else {
			DeliverDocVO notfindvo=new DeliverDocVO(null, "-1", null);
			return notfindvo;
		}
		return new DeliverDocVO(null, null, null);		
	}
	
	
	public ArrayList<DeliverDocPO> getUnexamedDeliverDoc(){
		try{
		ArrayList<DeliverDocPO> list=rmiObj.getDeliverDoclist();
		ArrayList<DeliverDocPO> unexam=new ArrayList<DeliverDocPO>();
		int len=list.size();
		for(int i=0;i<len;i++){
			if(list.get(i).getState()==false){
				unexam.add(list.get(i));
			}
		}
		return unexam;

		
		}catch(Exception e){
			e.printStackTrace();
		}
		return null;
	}
	
	
	public boolean isOrderIDavailable(String id){
		CheckOrder checker=new CheckOrder();
		return checker.isOrderIDAvailable(id);
	}
	public void  endDeliverDoc(){
		SysLogBLService syslog=new SysLog();
		syslog.addSysLog("生成派件单");
		try{
			rmiObj.writeAllDeliverDoc();
		}catch(Exception e){
			e.printStackTrace();
		}
	}
	

	
}
