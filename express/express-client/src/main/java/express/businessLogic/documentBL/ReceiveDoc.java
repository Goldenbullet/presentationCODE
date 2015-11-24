package express.businessLogic.documentBL;

import express.businesslogicService.businessSaleBLService.BusinessSaleReceiveDocumentblService;
import express.vo.ReceiveDocVO;

public class ReceiveDoc implements BusinessSaleReceiveDocumentblService{
	public boolean addReceiveDoc(ReceiveDocVO vo){
		return false;
	}
	public ReceiveDocVO getReceiveDoc(String date){
		return new ReceiveDocVO();
	}
	public boolean isDateAvailable(String date){
		return false;
	}
	public void endReceiveDoc(){
		
	}
}
