package express.businesslogicService.businessSaleBLService;

import express.vo.VehicleInfoListVO;
import express.vo.VehicleInfoVO;

public interface VehicleBusinessSaleblService {
	
	public boolean addVehicleInfo(VehicleInfoVO vo);
	
	public boolean removeVehicleInfo(String carID);
	
	public VehicleInfoListVO getVehicleInfoList();
	
	public VehicleInfoVO getVehicleInfo(String carID);
	
	public boolean changeVehicleInfo(String carID);
	
	public boolean isCarIDValid(String carID);
	
	public void endManage();
}
