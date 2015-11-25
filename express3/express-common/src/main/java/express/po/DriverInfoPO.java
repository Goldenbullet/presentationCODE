package express.po;

import java.io.Serializable;

public class DriverInfoPO implements Serializable{
	
	private String driverNumber;
	private String businesshallNumber;
	private String name;
	private String year;
	private String month;
	private String date;
	private String ID;
	private String cellPhone;
	private boolean sex;// men are true,women are false
	private int deadline;

	public DriverInfoPO(String Number1,String Number2,
			            String n,String y,String m,String d,
			            String id,String cell,boolean is,int ddl){
		 this.driverNumber=Number1;
		 this.businesshallNumber=Number2;
		 this.name=n;
		 this.year=y;
		 this.month=m;
		 this.date=d;
		 this.ID=id;
		 this.cellPhone=cell;
		 this.sex=is;
		 this.deadline=ddl;

		
	}
	
	public String getdriverNumber(){
		return driverNumber; 
	}
	
	public void setdriverNumber(String driverNumber){
		this.driverNumber=driverNumber; 
	}
	
	public String getbusinesshallNumber(){
		return businesshallNumber; 
	}
	
	public void setbusinesshallNumber(String businesshallNumber){
		this.businesshallNumber=businesshallNumber; 
	}
	
	public String getname(){
		return name; 
	}
	
	public void setname(String name){
		this.name=name; 
	}
	public String getyear(){
		return year; 
	}
	public void setyear(String year){
		this.year=year; 
	}
	public String getmonth(){
		return month; 
	}
	public void setmonth(String month){
		this.month=month;
	}
	
	public String getdate(){
		return date; 
	}
	
	public void setdate(String date){
		this.date=date; 
	}
	
	public String getID(){
		return ID; 
	}
	
	public void setID(String ID){
		this.ID=ID; 
	}
	
	public String getcellPhone(){
		return cellPhone; 
	}
	public void setcellPhone(String cellPhone){
		this.cellPhone=cellPhone; 
	}
	
	public boolean getsex(){
		return sex; 
	}
	
	public void setsex(boolean  sex){
		this.sex=sex; 
	}
	
	public int getdeadline(){
		return deadline; 
	}
	public void setdeadline(int deadline){
		this.deadline=deadline; 
	}
	
}