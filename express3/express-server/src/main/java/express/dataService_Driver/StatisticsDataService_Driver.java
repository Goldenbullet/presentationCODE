package express.dataService_Driver;

import express.dataService.statisticsDataService.StatisticsDataService;

public class StatisticsDataService_Driver {

	public void drive(StatisticsDataService statisticsDataService){
		if(statisticsDataService.createOperateForm(null))
			System.out.println("Create operate form");
		if(statisticsDataService.createProfitForm(null))
			System.out.println("Create profit form");
		statisticsDataService.getOperateForm(0);
		statisticsDataService.getOperateFormList();
		statisticsDataService.getProfitForm(0);
		statisticsDataService.getProfitFormList();
	}
}
