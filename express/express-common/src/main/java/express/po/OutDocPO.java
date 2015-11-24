package express.po;

import java.io.Serializable;

public class OutDocPO implements Serializable{
	private String deliveryNumber;
	private String date;
	private String arrival;
	private String transKind;
	private String transNumber;
	
	public OutDocPO(String de,String d,String a,
			String tK,String tN){
		this.deliveryNumber=de;
		this.date=d;
		this.arrival=a;
		this.transKind=tK;
		this.transNumber=tN;
	}
	
	public String getdeliveryNumber(){
		return deliveryNumber;
	}
	
	public void setdeliveryNumber(String deliveryNumber){
		this.deliveryNumber=deliveryNumber;
	}
	public String getdate(){
		return date;
	}
	public void setdate(String date){
		this.date=date;
	}
	public  String getarrival(){
		return arrival;
	}
	
	public  void setarrival(String arrival){
		this.arrival=arrival;
	}
	public String gettransKind(){
		return transKind;
	}
	
	public void settransKind(String transKind){
		this.transKind=transKind;
	}
	
	public String gettransNumber(){
		return transNumber;
	}
	
	public void settransNumber(String transNumber){
		this.transNumber=transNumber;
	}
}
