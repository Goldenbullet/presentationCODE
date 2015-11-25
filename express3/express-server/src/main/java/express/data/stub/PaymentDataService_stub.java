package express.data.stub;

import express.dataService.documentDataService.PaymentDocDataService;
import express.po.PaymentDocPO;

public class PaymentDataService_stub implements PaymentDocDataService{

	PaymentDocPO payment;
	
	public PaymentDataService_stub(PaymentDocPO payment){
		this.payment=payment;
	}
	
	public boolean createPaymentDoc(PaymentDocPO payment){
		return true;
	}
	
	public PaymentDocPO getPaymentDoc(String id){
		System.out.println("Get payment");
		return payment;
	}
}
