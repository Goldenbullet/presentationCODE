package express.dataService_Driver;

import express.dataService.strategyDataService.StrategyDataService;
import express.po.CityDistancePO;
import express.po.PricePO;
import express.po.SalaryPO;
import express.po.UserRole;

public class StrategyDataService_Driver {
	public void drive(StrategyDataService strategydataservice){
		strategydataservice.makeSalary(new SalaryPO(UserRole.DeliverMan,"提成",0.15));
		strategydataservice.makeCityDistance(new CityDistancePO("北京","南京",900));
		strategydataservice.makePrice(new PricePO(3));
	}
}
