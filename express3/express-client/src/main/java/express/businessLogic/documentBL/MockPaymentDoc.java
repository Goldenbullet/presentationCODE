package express.businessLogic.documentBL;

import express.vo.DateAvailableVO;
import express.vo.PaymentDocVO;

public class MockPaymentDoc extends PaymentDoc{

	public boolean addPaymentDoc(PaymentDocVO payment) {
		// TODO Auto-generated method stub
		return false;
	}

	public PaymentDocVO getPaymentDoc(String id) {
		// TODO Auto-generated method stub
		return null;
	}

	public DateAvailableVO checkDateAvailable(String date) {
		// TODO Auto-generated method stub
		//DateAvailableVO是一个枚举类
		return DateAvailableVO.Found;
	}

	public void endPaymentDoc() {
		super.endPaymentDoc();
	}
}
