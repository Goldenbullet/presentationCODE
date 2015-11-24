package express.businessLogic.documentBL;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;

import express.businesslogicService.financialBLService.PaymentBLService;
import express.data.logData.LogIO;
import express.po.LogPO;
import express.vo.DateAvailableVO;
import express.vo.PaymentDocVO;

public class PaymentDoc implements PaymentBLService{

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
		return null;
	}

	public void endPaymentDoc() {
		
		LogIO log=new LogIO();
		System.currentTimeMillis();
		Date date=new Date();
		DateFormat format=new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
		String time=format.format(date); 
		log.createSystemLog(new LogPO("生成付款单",time));
	}

}
