package express.businesslogicService.transcenterRepoBLService;

import express.vo.RepoCacheVO;

public interface InventoryRepoBLService {

	public RepoCacheVO inventoryRepo();
	
	public boolean exportExcel(RepoCacheVO repoCache);
	
	public void endRepoInventory();
}
