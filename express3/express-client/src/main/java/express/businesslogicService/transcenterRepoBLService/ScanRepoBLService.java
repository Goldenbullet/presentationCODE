package express.businesslogicService.transcenterRepoBLService;

import express.vo.DateAvailableVO;
import express.vo.RepoInfoVO;

public interface ScanRepoBLService {

	public RepoInfoVO getRepoInfo(String city,String startDate,String endDate);
	
	public DateAvailableVO checkBeginAndEndDate(String BeginDate,String endDate);
}
