package express.po;

import java.io.Serializable;

public class VehicleInfoPO implements Serializable{
	private String mark;
	private String license;
	
	public VehicleInfoPO(String mark,String license){
		this.mark=mark;
		this.license=license;
	}
	public String getMark(){
		return mark;
	}
	public String getLicense(){
		return license;
	}
}
