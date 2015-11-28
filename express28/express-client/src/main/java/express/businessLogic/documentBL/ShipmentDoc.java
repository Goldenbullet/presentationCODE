package express.businessLogic.documentBL;

import java.util.ArrayList;

import express.businessLogic.syslogBL.SysLog;
import express.businesslogicService.managerBLService.SysLogBLService;
import express.dataService.documentDataService.BusinessSaleShipmentDocumentDataService;
import express.po.DeliverDocPO;
import express.po.ShipmentDocPO;
import express.vo.ShipmentDocVO;
import express.rmi.RMIClient;

public class ShipmentDoc {
	BusinessSaleShipmentDocumentDataService rmiObj;
	
	public ShipmentDoc(){
		rmiObj=RMIClient.getShipmentDocObject();
	}
	
	public boolean addShipmentDoc(ShipmentDocVO vo){
		ShipmentDocPO po=new ShipmentDocPO(vo.getdate(), vo.gettranscenterNumber(),vo.getarrival(), vo.getvin(),
											vo.getcheckMan(), vo.gettransMan(), vo.getshipmentID(), vo.getOrderID(), vo.getmoney());
		
		try{
			rmiObj.createShipmentDoc(po);
			}catch(Exception e){
				e.printStackTrace();
			}
			return true;
	}
	
	
	
	
	public ShipmentDocVO getShipmentDoc(String shipmentID) {
		
			try{
				ShipmentDocPO po=rmiObj.getShipmentDoc(shipmentID);
				ShipmentDocVO vo=new ShipmentDocVO(po.getdate(), po.gettranscenterNumber(),po.getarrival(), po.getvin(),
						po.getcheckMan(), po.gettransMan(), po.getshipmentID(), po.getOrderID(), po.getmoney());
				return vo;
			}catch(Exception e){
				e.printStackTrace();
			}
		return null;

	}
	
	public ArrayList<ShipmentDocPO> getUnexamedDeliverDoc(){
		try{
		ArrayList<ShipmentDocPO> list=rmiObj.getShipmentDoclist();
		ArrayList<ShipmentDocPO> unexam=new ArrayList<ShipmentDocPO>();
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
	
	
	
	public void  endDeliverDoc(){
		SysLogBLService syslog=new SysLog();
		syslog.addSysLog("生成装车单");
		try{
			rmiObj.writeAllShipmentDoc();
		}catch(Exception e){
			e.printStackTrace();
		}
	}
	
	
	public boolean isOrderIDavailable(String id){
		CheckOrder checker=new CheckOrder();
		return checker.isOrderIDAvailable(id);
	}
	
}
