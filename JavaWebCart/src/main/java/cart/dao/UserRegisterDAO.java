package cart.dao;

import cart.model.entity.User;

public interface UserRegisterDAO {
	// 新稱 User
	int addUser(User user);
	
	// email 驗證成功並修改 將completed = true               
	int emailConfirmOK(String username);
	

}
