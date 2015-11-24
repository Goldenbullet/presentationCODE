package express.po;

import java.io.Serializable;

public class InDocPO implements Serializable{
	private String deliveryNumber;
	private String date;
	private String arrival;
	private RepoPositionPO repoPosition;
	
	public InDocPO(String de,String d,String a,
			RepoPositionPO repoPosition){
		this.deliveryNumber=de;
		this.date=d;
		this.arrival=a;
		this.repoPosition=repoPosition;
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
	
	public RepoPositionPO getRepoPosition(){
		return repoPosition;
	}
	
	public void setRepoPosition(RepoPositionPO repoPosition){
		this.repoPosition=repoPosition;
	}
	
}
