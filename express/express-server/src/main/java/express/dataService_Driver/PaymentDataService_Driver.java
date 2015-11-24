package express.dataService_Driver;

import express.dataService.documentDataService.PaymentDocDataService;
import express.po.PaymentDocPO;

public class PaymentDataService_Driver {

	public void drive(PaymentDocDataService paymentDataService){
		if(paymentDataService.createPaymentDoc(null))
			System.out.print("Create payment");
		paymentDataService.getPaymentDoc("1");
	}
}
