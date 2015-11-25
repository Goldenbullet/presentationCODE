package express.businesslogicService.transcenterRepoBLService;

import express.vo.RepoPositionVO;

public interface AdjustRepoBLService {

	public boolean checkRepoBlockUsed(RepoPositionVO position);
	
	public boolean setRepoBlock(RepoPositionVO position);
	
	public boolean alarm();
	
	public void adjustRepo();
	
	public void endRepoManage();
}
