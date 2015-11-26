package express.vo;

public class LogVO {
	String operation;
	String time;
	
	public LogVO(String time, String operation){
		this.time = time;
		this.operation = operation;
	}
}
