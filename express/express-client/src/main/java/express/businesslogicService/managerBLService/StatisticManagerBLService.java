package express.businesslogicService.managerBLService;

import express.vo.OperateFormListVO;
import express.vo.OperateFormVO;
import express.vo.ProfitFormListVO;
import express.vo.ProfitFormVO;

public interface StatisticManagerBLService {

	public ProfitFormListVO getProfitFormList();
	
	public OperateFormListVO getOperateFormList();
	
	public ProfitFormVO getProfitForm(int index);
	
	public OperateFormVO getOperateForm(int index);
}
