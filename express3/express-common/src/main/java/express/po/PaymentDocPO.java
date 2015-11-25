package express.po;

import java.io.Serializable;

public class PaymentDocPO implements Serializable{
	private String name;
	private String date;
	private String account;
	private String entry;
	private String comment;
	private String paymentID;
	private int sum;
	public PaymentDocPO(String name,String date,String account,
			String entry,String comment,String paymentID,int sum){
		this.name=name;
		this.date=date;
		this.account=account;
		this.entry=entry;
		this.comment=comment;
		this.paymentID=paymentID;
		this.sum=sum;
	}
	public String getName(){
		return name;
	}
	public String getDate(){
		return date;
	}
	public String getAccount(){
		return account;
	}
	public int getSum(){
		return sum;
	}
	public String getEntry(){
		return entry;
	}
	public String getComment(){
		return comment;
	}
	public String setName(String name){
		this.name=name;
		return this.name;
	}
	public String setDate(String date){
		this.date=date;
		return this.date;
	}
	public String setAccount(String account){
		this.account=account;
		return this.account;
	}
	public String setEntry(String entry){
		this.entry=entry;
		return this.entry;
	}
	public String setComment(String comment){
		this.comment=comment;
		return this.comment;
	}
	public String paymentID(){
		return paymentID;
	}
	public int setSum(int sum){
		this.sum=sum;
		return this.sum;
	}
}
