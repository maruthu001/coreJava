package in.maruthanalagar.mambilling.service;

import in.maruthanalagar.mambilling.dao.UserDAO;
import in.maruthanalagar.mambilling.model.User;

public class UserService {

	public User[] getAll() {

		UserDAO userdao = new UserDAO();

		User[] UserList = userdao.findAll();
		
		
		for (int i = 0;i<UserList.length;i++) {
			System.out.println(UserList[i]);
		}
//		System.out.println(UserList[0]);
		
		
		return UserList;

	}

}
