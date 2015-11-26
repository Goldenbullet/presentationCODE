package express.businessLogic.documentBL;

public class MockCheckOrder extends CheckOrder{
	public boolean isOrderIDAvailable(String id){
		if(id.equals("0000000001")){
			System.out.println("correct!");
			return true;
		}
		else{
			System.out.println("wrong!");
			return false;
		}
		//return true;
	}
	
	
}
