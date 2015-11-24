package express.dataService_Driver;

import java.util.ArrayList;

import express.dataService.vehicleAndDriverDataService.VehicleDataService;
import express.po.VehicleInfoPO;

public class VehicleDataService_Driver {
	public void drive(VehicleDataService vehicleservice){
		boolean create=vehicleservice.createVehicleInfo(new VehicleInfoPO(null, null));
		if (create){
			System.out.println("VehicleInfo created");
		}
		
		VehicleInfoPO vehicleInfoPO=new VehicleInfoPO(null, null);
		vehicleInfoPO=vehicleservice.getVehicleInfo(1);
		System.out.println("VehicleInfo got");
		
		ArrayList<VehicleInfoPO> List=new ArrayList<VehicleInfoPO>();
		List=vehicleservice.getVehicleInfoList();
		System.out.println("VehicleInfoList got");
		
		VehicleInfoPO delete=vehicleservice.deleteVehicleInfo(1);
			System.out.println("VehicleInfo deleted");
			
		boolean change;
		change=vehicleservice.changeVehicleInfoPO(new VehicleInfoPO(null, null));
		if (change){
			System.out.println("VehicleInfo changed");
		}


	}
}
