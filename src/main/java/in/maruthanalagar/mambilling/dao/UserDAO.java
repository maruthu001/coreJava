package in.maruthanalagar.mambilling.dao;

import in.maruthanalagar.mambilling.model.User;

public class UserDAO {
	
	public User[] findAll() {
		User[] userList = UserList.ListOfUsers;	
		return userList;
	}
	

public void create(User newUser) {
		
		UserList.ListOfUsers[0] = newUser;
	}
}
