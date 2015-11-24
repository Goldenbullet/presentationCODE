package express.po;

import java.io.Serializable;

public class ArrivalDocPO implements Serializable{
	private String arriveDate;
	private String transCenterID;//中转中心ID
	private String transferDocID;//中转单ID
	private String departure;//出发地
	private GoodsArrivalStatus arrivalStatus;//枚举类  货物到达状态（损坏、完整、丢失）
	
	//constructor
	public ArrivalDocPO(String arriveDate,String transCenterID,
						String transferDocID,String departure,
						GoodsArrivalStatus arrivalStatus){
		
		this.arriveDate=arriveDate;
		this.transCenterID=transCenterID;
		this.transferDocID=transferDocID;
		this.departure=departure;
		this.arrivalStatus=arrivalStatus;	
	}
	
	
	
	public String getArriveDate(){
		return arriveDate;
	}
	public String getTransCenterID(){
		return transCenterID;
	}
	public String getTransferDocID(){
		return transferDocID;
	}
	public String getDeparture(){
		return departure;
	}
	public GoodsArrivalStatus getArrivalStatus(){
		return arrivalStatus;
	}
	
	
	
}
