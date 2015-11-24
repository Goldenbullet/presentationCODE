package express.dataService_Driver;

import express.dataService.repoDataService.RepoDataService;
import express.po.RepoInfoPO;

public class RepoDataService_Driver {
	
	public void drive(RepoDataService repoDataService){
		if(repoDataService.changeBlockPositionState(null))
			System.out.println("Change state");
		if(repoDataService.getBlockUsed(null))
			System.out.println("Position is free");
		repoDataService.getRepoInfo("Beijing", "2015-10-25", "2015-10-26");
	}
}
