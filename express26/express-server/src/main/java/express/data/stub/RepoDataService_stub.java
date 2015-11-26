package express.data.stub;

import express.dataService.repoDataService.RepoDataService;
import express.po.RepoInfoPO;
import express.po.RepoPositionPO;

public class RepoDataService_stub implements RepoDataService{
	
	RepoInfoPO repoInfo;
	
	public RepoDataService_stub(RepoInfoPO repoInfo){
		this.repoInfo=repoInfo;
	}

	public boolean getBlockUsed(RepoPositionPO position) {
		// TODO Auto-generated method stub
		return true;
	}

	public boolean changeBlockPositionState(RepoPositionPO position) {
		// TODO Auto-generated method stub
		return true;
	}

	public RepoInfoPO getRepoInfo(String city, String beginDate, String endDate) {
		// TODO Auto-generated method stub
		System.out.println("Get repository imformation");
		return repoInfo;
	}

}
