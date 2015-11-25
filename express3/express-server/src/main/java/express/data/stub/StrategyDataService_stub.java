package express.data.stub;

import express.dataService.strategyDataService.StrategyDataService;
import express.po.CityDistancePO;
import express.po.PricePO;
import express.po.SalaryPO;

public class StrategyDataService_stub implements StrategyDataService{
	
	public boolean makeSalary(SalaryPO po){
		System.out.println("Make succeed.");
		return true;
	}
	
	public boolean makeCityDistance(CityDistancePO po){
		System.out.println("Make succeed.");
		return true;
	}
	
	public boolean makePrice(PricePO po){
		System.out.println("Make succeed.");
		return true;
	}
}
