package express.dataService.repoDataService;

import express.po.RepoInfoPO;
import express.po.RepoPositionPO;

public interface RepoDataService {

	public boolean getBlockUsed(RepoPositionPO position);
	
	public boolean changeBlockPositionState(RepoPositionPO position);
	
	public RepoInfoPO getRepoInfo(String city,String beginDate,String endDate);
}
