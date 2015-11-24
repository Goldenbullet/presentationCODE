package express.dataService.statisticsDataService;

import java.util.ArrayList;

import express.po.OperateFormPO;
import express.po.ProfitFormPO;

public interface StatisticsDataService {

	public boolean createProfitForm(ProfitFormPO profitForm);
	
	public boolean createOperateForm(OperateFormPO operateForm);
	
	public ArrayList<ProfitFormPO> getProfitFormList();
	
	public ArrayList<OperateFormPO> getOperateFormList();
	
	public ProfitFormPO getProfitForm(int index);
	
	public OperateFormPO getOperateForm(int index);
}
