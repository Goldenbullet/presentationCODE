package express.businesslogicService.businessSaleBLService;

import express.vo.DriverInfoListVO;
import express.vo.DriverInfoVO;

public interface DriverBusinessSaleblService {
	
	public boolean addDriverInfo(DriverInfoVO vo);
	
	public boolean removeDriverInfo(String DriverID);
	
	public DriverInfoListVO getDriverInfoList();
	
	public DriverInfoVO getDriverInfo(String DriverID);
	
	public boolean changeDriverInfo(String DriverID);
	
	public boolean isIdentityIdAvailable(String id);
	
	public void endManage();
}
