package express.data.stub;

import java.util.ArrayList;

import express.dataService.statisticsDataService.StatisticsDataService;
import express.po.OperateFormPO;
import express.po.OrderPO;
import express.po.PaymentDocPO;
import express.po.ProfitFormPO;

public class StatisticsDataService_stub implements StatisticsDataService{
//需要类之间调用，需要得到收款单和付款单
	ArrayList<OrderPO> order;
	ArrayList<PaymentDocPO> payment;
	ArrayList<ProfitFormPO> profitForm;
	ArrayList<OperateFormPO> operateForm;
	
	public StatisticsDataService_stub(ArrayList<OrderPO> order,
			ArrayList<PaymentDocPO> payment,ArrayList<ProfitFormPO> profitForm,
			ArrayList<OperateFormPO> operateForm){
		this.order=order;
		this.payment=payment;
		this.profitForm=profitForm;
		this.operateForm=operateForm;
	}
	
	public boolean createProfitForm(ProfitFormPO profitForm){
		return true;
	}
	
	public boolean createOperateForm(OperateFormPO operateForm){
		return true;
	}
	
	public ArrayList<ProfitFormPO> getProfitFormList(){
		System.out.println("get profit form list");
		return profitForm;
	}
	
	public ArrayList<OperateFormPO> getOperateFormList(){
		System.out.println("get operate form list");
		return operateForm;
	}
	
	public ProfitFormPO getProfitForm(int index){
		System.out.println("get profit form");
		return profitForm.get(index);
	}
	
	public OperateFormPO getOperateForm(int index){
		System.out.println("get operate form");
		return operateForm.get(index);
	}
}
