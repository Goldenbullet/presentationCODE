package express.po;

import java.io.Serializable;

public class VehicleInfoPO implements Serializable{
	private String mark;//车辆代号
	private String license;//车牌号
	private boolean isUsing;//是否在使用
	
	public VehicleInfoPO(String mark,String license,boolean isUsing){
		this.mark=mark;
		this.license=license;
		this.isUsing=isUsing;
	}
	public String getMark(){
		return mark;
	}
	public String getLicense(){
		return license;
	}
	public boolean checkIsUsing(){
		return isUsing;
	}
	public void setIsUsing(){
		isUsing=!isUsing;
	}
	public void setMark(String m){
		mark=m;
	}
	public void setLicense(String l){
		license=l;
	}
}
