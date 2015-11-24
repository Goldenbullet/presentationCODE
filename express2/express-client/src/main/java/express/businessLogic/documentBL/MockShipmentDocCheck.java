package express.businessLogic.documentBL;

public class MockShipmentDocCheck extends ShipmentDocCheck{
	public boolean isOrderIDavailable(String id){
		MockCheckOrder checker=new MockCheckOrder();
		if(checker.isOrderIDAvailable(id)){
			return true;
		}
		else{
			return false;
		}
	}
	public boolean isBusinessshallavailable(String Businessshallid){
		if(Businessshallid.equals("0250"))
			return true;
		else
			return false;
	}
	public boolean isTransCarIDavailable(String TransCarIDid){
		if(TransCarIDid.equals("00001"))
			return true;
		else
			return false;
	}
}
