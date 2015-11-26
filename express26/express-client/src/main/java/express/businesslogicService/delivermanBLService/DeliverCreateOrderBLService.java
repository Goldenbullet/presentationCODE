package express.businesslogicService.delivermanBLService;

import express.vo.ArrivalTimeVO;
import express.vo.OrderVO;

public interface DeliverCreateOrderBLService {
		public boolean addOrder(OrderVO vo);
		public boolean isCellPhoneAvailable(String cellphonenumber);
		public double getTotal();
		public OrderVO getOrder(String id);
		public ArrivalTimeVO getPredictArrivalTime();
		public void endOrder();
}
