package express.dataService.strategyDataService;

import express.po.CityDistancePO;
import express.po.PricePO;
import express.po.SalaryPO;

public interface StrategyDataService {

	public boolean makeSalary(SalaryPO po);
	
	public boolean makeCityDistance(CityDistancePO po);
	
	public boolean makePrice(PricePO po);
}
