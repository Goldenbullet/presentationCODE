package express.po;

import java.io.Serializable;
import java.util.ArrayList;

public class OperateFormPO implements Serializable{
	private String startDate;
	private String endDate;
	private ArrayList<ReceiveDocPO> receiveDoc;
	private ArrayList<PaymentItemPO> paymentDoc;
	
	public OperateFormPO(String startDate,String endDate,ArrayList<ReceiveDocPO> receiveDoc,ArrayList<PaymentItemPO> paymentDoc){
		this.startDate=startDate;
                this.endDate=endDate;
		this.receiveDoc=receiveDoc;
		this.paymentDoc=paymentDoc;
	}
	public String getstartDate(){
		return startDate;
	}
        public String getendDate(){
		return endDate;
	}
	public ArrayList<ReceiveDocPO> getReceiveDoc(){
		return receiveDoc;
	}
	public ArrayList<PaymentItemPO> getPaymentDoc(){
		return paymentDoc;
	}
}
