package express.businesslogicService.businessSaleBLService;

import express.vo.VehicleInfoListVO;
import express.vo.VehicleInfoVO;

public interface VehicleBusinessSaleblService {
	
	public boolean addVehicleInfo(VehicleInfoVO vo);
	
	public boolean removeVehicleInfo(String CarID);
	
	public VehicleInfoListVO getVehicleInfoList();
	
	public VehicleInfoVO getVehicleInfo(String CarID);
	
	public boolean changeVehicleInfo(String CarID);
	
	public boolean isDocFullfilled();
	
	public void endManage();
}
