package express.dataService.logDataService;

import java.util.ArrayList;

import express.po.LogPO;

public interface LogDataService {
	
	public ArrayList<LogPO> getSystemLog();
	
	public boolean createSystemLog(LogPO po);
}
