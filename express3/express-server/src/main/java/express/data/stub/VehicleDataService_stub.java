package express.data.stub;

import java.util.ArrayList;

import express.dataService.vehicleAndDriverDataService.VehicleDataService;
import express.po.VehicleInfoPO;

public class VehicleDataService_stub implements VehicleDataService{
	private String mark;
	private String license;
	public ArrayList<VehicleInfoPO> List=new ArrayList<VehicleInfoPO>();
	
	
	public VehicleDataService_stub(String mark,String license){
		this.mark=mark;
		this.license=license;
	}
	
	public boolean createVehicleInfo(VehicleInfoPO po){
		if (po.getMark()=="AAAA"){
			return true;
		}
		return false;
	}
	public ArrayList<VehicleInfoPO> getVehicleInfoList(){
		return List;
	}
	public VehicleInfoPO getVehicleInfo(int index){
		return List.get(index);
	}
	public VehicleInfoPO deleteVehicleInfo(int index){
		System.out.println("VehicleInfoPO has been removed");
		return List.remove(index);
	}	
	public boolean changeVehicleInfoPO(VehicleInfoPO po){
		System.out.println("Vehicle Info has been modified");
		return true;
	}
	
}
