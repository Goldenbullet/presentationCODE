package express.po;

import java.io.Serializable;

public class TransferDocPO  extends DocumentPO implements Serializable{
	private String date;
	private String transcenterNumber;
	private String flightNumber;
	private String begin;
	private String arrival;
	private String containerNumber;
	private String checkMan;
	private String transferID;
	private double money;
	
	public TransferDocPO(String d,String transnumber,String f,String b,String ar,
	                       String c,String che,String transferID,double m){
		this.date=d;
		this.transcenterNumber=transnumber;
		this.flightNumber=f;
		this.begin=b;
		this.arrival=ar;
		this.containerNumber=c;
		this.checkMan=che;
		this.transferID=transferID;
		this.money=m;
	}
	public String getdate(){
		return date;
	}
	public void setdate(String date){
		this.date=date;
	}
	
	public String gettranscenterNumber(){
		return transcenterNumber;
	}
	
	public void settranscenterNumber(String transcenterNumber){
		this.transcenterNumber=transcenterNumber;
	}
	
	public String getflightNumber(){
		return flightNumber;
	}

	public void setflightNumber(String flightNumber){
		this.flightNumber=flightNumber;
	}
	
	public  String getbegin(){
		return begin;
	}
	
	public  void setbegin(String begin){
		this.begin=begin;
	}
	
	public  String getarrival(){
		return arrival;
	}
	
	public  void setarrival(String arrival){
		this.arrival=arrival;
	}
	

	public String getcheckMan(){
		return checkMan;
	}
	
	public void setcheckMan(String checkMan){
		this.checkMan=checkMan;
	}
	public String getcontainerNumber(){
		return containerNumber;
	}
	public void setcontainerNumber(String containerNumber){
		this.containerNumber=containerNumber;
	}
	public String transferID(){
		return transferID;
	}

	public double getmoney(){
		return money;
	}
	
	public void  setmoney(double money){
		this.money=money;
	}
}