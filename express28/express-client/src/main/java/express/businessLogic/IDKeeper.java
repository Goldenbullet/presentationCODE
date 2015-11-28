package express.businessLogic;

public class IDKeeper {

	private static String id;
	
	public IDKeeper(){
		id=null;
	}
	
	public static String getID(){
		return id;
	}
	
	public static void setID(String i){
		id=i;
	}
}
