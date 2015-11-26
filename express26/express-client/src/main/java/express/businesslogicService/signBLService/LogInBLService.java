package express.businesslogicService.signBLService;

import express.vo.SignInVO;
import express.vo.UserInfoSignVO;

public interface LogInBLService {
		public SignInVO isIdentified(String id,String password);
		public boolean isSigned(String id);
		public UserInfoSignVO getUserInfo(String id);
		public boolean LogOut(String id);
		public boolean changeSigned(String id);
}
