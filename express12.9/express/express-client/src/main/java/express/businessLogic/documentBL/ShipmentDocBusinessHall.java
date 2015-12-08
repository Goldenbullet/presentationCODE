package express.businessLogic.documentBL;

import java.rmi.RemoteException;
import java.util.ArrayList;
import java.util.Calendar;


import express.businessLogic.IDKeeper;
import express.businessLogic.infoManageBL.DistanceManager;
import express.businessLogic.syslogBL.SysLog;
import express.businesslogicService.businessSaleBLService.BusinessSaleShipmentDocumentblService;
import express.businesslogicService.managerBLService.SysLogBLService;
import express.dataService.documentDataService.BusinessSaleShipmentDocDataService;
import express.dataService.documentDataService.GoodsStatusDataService;
import express.po.GoodTransStatusPO;
import express.po.OrderPO;
import express.po.ShipmentDocBusinessHallPO;
import express.po.ShipmentDocTransCenterPO;
import express.vo.OrderVO;
import express.vo.ShipmentDocBusinessHallVO;
import express.vo.ShipmentDocTransCenterVO;
import express.rmi.RMIClient;

public class ShipmentDocBusinessHall implements BusinessSaleShipmentDocumentblService {
	BusinessSaleShipmentDocDataService rmiObj;

	public ShipmentDocBusinessHall() {
		rmiObj = RMIClient.getBusinessShipmentDocObject();
	}

	public boolean addShipmentDoc(ShipmentDocBusinessHallVO vo) {
		ShipmentDocBusinessHallPO po = new ShipmentDocBusinessHallPO(vo.getDate(), vo.getTransId(),
				vo.getBusinessHallNum(), vo.getArrivalPlace(), vo.getVanID(), vo.getCheckMan(), vo.getTransMan(),
				vo.getAllOrder(), vo.getMoney(), vo.getShipmentID(),vo.getStartPlace());

		ShipmentDocCheck transidchecker = new ShipmentDocCheck();
		if (!transidchecker.isTransIDavailable(vo.getTransId())) {
			return false;
		}

		ArrayList<String> idlist = vo.getAllOrder();
		for (String id : idlist) {
			if (!isOrderIDavailable(id))
				return false;
		}

		// 检查完毕

		try {
			rmiObj.createShipmentDoc(po);
			GoodsStatusDataService changeStatusObj = RMIClient.getGoodStatusObject();

			Calendar c = Calendar.getInstance();
			int year = c.get(Calendar.YEAR);
			int month = -c.get(Calendar.MONTH + 1) - 1;
			int day = -c.get(Calendar.DATE);
			String date = "";
			date += year;
			date += month;
			date += day;

			for (String id : idlist) {
				GoodTransStatusPO statuspo = changeStatusObj.search(id);
				statuspo.addStatus("已到达寄件人营业厅");
				statuspo.addTime(date);
				statuspo.setFirstBusinessHallID(IDKeeper.getOrgID());
				changeStatusObj.changeGoodtransstatus(statuspo);
			}

		} catch (Exception e) {
			e.printStackTrace();
		}
		return true;
	}

	public ShipmentDocBusinessHallVO getShipmentDoc(String shipmentID) {
		try {
			ShipmentDocBusinessHallPO po = rmiObj.getShipmentDoc(shipmentID);
			ShipmentDocBusinessHallVO vo = new ShipmentDocBusinessHallVO(po.getDate(), po.getTransId(),
					po.getBusinessHallNum(), po.getArrivalPlace(), po.getVanID(), po.getCheckMan(), po.getTransMan(),
					po.getAllOrder(), po.getMoney(), po.getShipmentID(),po.getStartPlace());
			return vo;
		} catch (Exception e) {
			e.printStackTrace();
		}
		return null;
	}

	public void endShipmentDoc() {
		SysLogBLService syslog = new SysLog();
		syslog.addSysLog("生成营业厅装车单");
		try {
			rmiObj.writeAllShipmentDoc();
		} catch (Exception e) {
			e.printStackTrace();
		}

	}

	public boolean isOrderIDavailable(String id) {
		CheckOrder checker = new CheckOrder();
		return checker.isOrderIDAvailable(id);
	}

	/**
	 * 营业厅------>>>>中转中心 营业厅装车单 交通工具应为 汽车
	 * 
	 * @param vo
	 * @return 本次装车的需要支付的运费
	 */

	public double getShipmentfee(ShipmentDocBusinessHallVO vo) {
		DistanceManager disman=new DistanceManager();
		double distance=disman.getTwoCityDistance(vo.getArrivalPlace(), vo.getStartPlace());
		//计算本次装车总重量
		ArrayList<String> orderlist=vo.getAllOrder();
		OrderController orderctr=new OrderController();
		double totalWeight=0;
		double totalfee=0;
		
		
		try{
			for(String id:orderlist){
				OrderVO orderinstance=orderctr.getOrder(id);				
				totalWeight+=orderinstance.getWeight();
			}
			
			totalWeight=totalWeight/1000;
			totalfee=2*distance*totalWeight;//汽车每公里每吨2¥
			return totalfee;	
		}catch(Exception e){
			e.printStackTrace();
			return -1;
		}
	}
	
	
	public ArrayList<ShipmentDocBusinessHallPO>  getAllShipmentDoc(){
		try {
			ArrayList<ShipmentDocBusinessHallPO> shipmentdoclist=rmiObj.getShipmentDoclist();
			return shipmentdoclist;
		} catch (RemoteException e) {
			e.printStackTrace();
			return null;
		}
	}
	
	public String getShipmentDocID(){
		String ID="";
		String orgID=IDKeeper.getOrgID();
		Calendar c = Calendar.getInstance();
		int year=c.get(Calendar.YEAR);
		int month=c.get(Calendar.MONTH+1)+1;
		int day=c.get(Calendar.DATE);
		
		ID+=orgID+year+month+day;
		long a=System.currentTimeMillis();
		String x="";
		x+=a;
		int l=x.length();
		x=x.substring(l-5, l);
		ID+=x;
		return ID;
		
	}
	
	
	public ArrayList<ShipmentDocBusinessHallVO> getUnExamedBusinessShipmentDoc(){
		try{
			ArrayList<ShipmentDocBusinessHallPO> list=rmiObj.getShipmentDoclist();
			ArrayList<ShipmentDocBusinessHallVO> unexam=new ArrayList<ShipmentDocBusinessHallVO>();
			for(ShipmentDocBusinessHallPO po:list){
				if(po.getState()==false){
					ShipmentDocBusinessHallVO vo=new ShipmentDocBusinessHallVO(po.getDate(), po.getTransId(), po.getBusinessHallNum(), po.getArrivalPlace(), po.getVanID(), po.getCheckMan(), po.getTransMan(), 
																		po.getAllOrder(), po.getMoney(), po.getShipmentID(), po.getStartPlace());
					
					unexam.add(vo);
				}	
			}
			return unexam;	
		}catch(Exception e){
			e.printStackTrace();
			return null;
		}
	}
	
	public boolean changeShipmentDoc(ShipmentDocBusinessHallVO vo){
		ShipmentDocBusinessHallPO po=new ShipmentDocBusinessHallPO(vo.getDate(), vo.getTransId(),
				vo.getBusinessHallNum(), vo.getArrivalPlace(), vo.getVanID(), vo.getCheckMan(), vo.getTransMan(),
				vo.getAllOrder(), vo.getMoney(), vo.getShipmentID(),vo.getStartPlace());
		
		try{
			rmiObj.changeBusinessHallShipmentDoc(po);
			return true;
		}catch(Exception e){
			e.printStackTrace();
			return false;
		}
	}
	
	
	
	
	
	
	
}
