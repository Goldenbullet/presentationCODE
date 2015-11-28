package express.businessLogic.documentBL;

import java.util.ArrayList;

import express.businessLogic.syslogBL.SysLog;
import express.businesslogicService.businessSaleBLService.BusinessSaleArrivalDocumentblService;
import express.businesslogicService.managerBLService.SysLogBLService;
import express.dataService.documentDataService.BusinessSaleArrivalDocumentDataService;
import express.po.ArrivalDocPO;
import express.vo.ArrivalDocVO;
import express.rmi.RMIClient;

public class ArrivalDoc implements BusinessSaleArrivalDocumentblService{
	BusinessSaleArrivalDocumentDataService rmiobj;
	public ArrivalDoc(){
		rmiobj=RMIClient.getArrivalDocObject();
	}
	
	
	public boolean addArrivalDoc(ArrivalDocVO vo) {
		ArrivalDocPO po=new ArrivalDocPO(vo.getOrderID(),vo.getArriveDate(),vo.getTransCenterID(),vo.getTransferDocID()
				,vo.getDeparture(),vo.getArrivalStatus());
		try{
			rmiobj.createArrivalDoc(po);
			}catch(Exception e){
				e.printStackTrace();
			}
			return true;
	}

	public ArrivalDocVO getArrivalDoc(String OrderID) {
		if(isOrderIDavailable(OrderID)){
			try{
				ArrivalDocPO po=rmiobj.getArrivalDoc(OrderID);
				ArrivalDocVO vo=new ArrivalDocVO(po.getOrderID(),po.getArriveDate(),po.getTransCenterID(),po.getTransferDocID()
						,po.getDeparture(),po.getArrivalStatus());
				return vo;
			}catch(Exception e){
				e.printStackTrace();
			}

		}
		else {
			ArrivalDocVO notfindvo=new ArrivalDocVO("-1", null,null,null,null,null);
			return notfindvo;
		}
		return null;
	}

	public ArrayList<ArrivalDocPO> getUnexamedArrivalDoc(){
		try{
		ArrayList<ArrivalDocPO> list=rmiobj.getArrivalDoclist();
		ArrayList<ArrivalDocPO> unexam=new ArrayList<ArrivalDocPO>();
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
	
	public void endArrivalDoc() {
		SysLogBLService syslog=new SysLog();
		syslog.addSysLog("生成到达单");
		
		try{
			rmiobj.writeAllArrivalDoc();
		}catch(Exception e){
			e.printStackTrace();
		}
		
	}

}
