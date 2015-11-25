package express.businessLogic.initAccountBL;

import express.vo.InnerAccountVO;

public class MockInitAccount {
	
	public boolean addInnerAccount(InnerAccountVO vo){
		
		return true;
	}
	
	public InnerAccountVO getPrevious(){
		
		return null;
	}
}
