package express.businesslogicService.businessSaleBLService;

import express.vo.ArrivalDocVO;

public interface BusinessSaleArrivalDocumentblService {

	public boolean addArrivalDoc(ArrivalDocVO vo);
	public ArrivalDocVO getArrivalDoc(String OrderID);
	public void endArrivalDoc();
}
