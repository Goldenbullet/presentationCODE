package express.dataService.documentDataService;

import express.po.PaymentDocPO;

public interface PaymentDocDataService {

	public boolean createPaymentDoc(PaymentDocPO payment);
	
	public PaymentDocPO getPaymentDoc(String id);
}
