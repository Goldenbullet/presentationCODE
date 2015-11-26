package express.businessLogic.stub;

import java.util.ArrayList;

import express.businesslogicService.managerBLService.SyslogBLService;
import express.vo.LogVO;

public class SyslogBLService_stub implements SyslogBLService{
	ArrayList<LogVO> log;
	
	public SyslogBLService_stub(ArrayList<LogVO> log){
		this.log = log;
	}
	
	public ArrayList<LogVO> getSystemLog (){
		return log;
	}
	
	public boolean addSystemLog (String time, String operation){
		log.add(new LogVO(time,operation));
		return false;
	}
}
