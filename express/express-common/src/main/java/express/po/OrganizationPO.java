package express.po;
import java.io.Serializable;


public class OrganizationPO implements Serializable{
	private String name;
	private String address;
	
	public OrganizationPO(String name,String address){
		this.name = name;
		this.address = address;
	}
	
	public String getName(){
		return name;
	}
	
	public boolean setName(String name){
		this.name = name;
		return false;
	}
	
	public String getAddress(){
		return address;
	}
	
	public boolean setAddress(String address){
		this.address = address;
		return false;
	}
}
