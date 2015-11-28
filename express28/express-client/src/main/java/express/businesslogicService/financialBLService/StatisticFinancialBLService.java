package express.businesslogicService.financialBLService;

import java.util.ArrayList;

import express.vo.DateAvailableVO;
import express.vo.OperateFormListVO;
import express.vo.OperateFormVO;
import express.vo.ProfitFormListVO;
import express.vo.ProfitFormVO;

public interface StatisticFinancialBLService {
	
	public ProfitFormVO addProfitForm();
	
	public OperateFormVO addOperateForm(String beginDate,String endDate);
	
	public DateAvailableVO checkDateAvailable(String beginDate,String endDate);
	
	public ProfitFormListVO getProfitFormList();
	
	public OperateFormListVO getOperateFormList();
	
	public ProfitFormVO getProfitForm(int index);
	
	public OperateFormVO getOperateForm(int index);
}
