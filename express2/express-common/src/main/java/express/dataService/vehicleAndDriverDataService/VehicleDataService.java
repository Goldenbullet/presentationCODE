package express.dataService.vehicleAndDriverDataService;

import java.util.ArrayList;

import express.po.VehicleInfoPO;

public interface VehicleDataService {

	public boolean createVehicleInfo(VehicleInfoPO po);

	public ArrayList<VehicleInfoPO> getVehicleInfoList();

	public VehicleInfoPO getVehicleInfo(int index);

	public VehicleInfoPO deleteVehicleInfo(int index);

	public boolean changeVehicleInfoPO(VehicleInfoPO po);
}