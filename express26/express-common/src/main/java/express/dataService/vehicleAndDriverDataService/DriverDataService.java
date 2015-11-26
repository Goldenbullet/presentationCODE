package express.dataService.vehicleAndDriverDataService;

import java.util.ArrayList;

import express.po.DriverInfoPO;

public interface DriverDataService {
	public boolean createDriverInfo(DriverInfoPO po);

	public ArrayList<DriverInfoPO> getDriverInfoList();

	public DriverInfoPO getDriverInfo(int index);

	public boolean deleteDriverInfo(int index);

	public boolean changeDriverInfo(DriverInfoPO po);

}
