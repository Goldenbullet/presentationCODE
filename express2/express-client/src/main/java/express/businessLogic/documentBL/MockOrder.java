package express.businessLogic.documentBL;

import express.vo.OrderVO;

public class MockOrder extends Order{
	public OrderVO getOrder(String id){
		MockCheckOrder checker=new MockCheckOrder();
		if(checker.isOrderIDAvailable(id))
		System.out.println("Order get!");
		return new OrderVO();
	}
}
