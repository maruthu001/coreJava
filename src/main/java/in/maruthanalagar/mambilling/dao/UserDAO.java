package in.maruthanalagar.mambilling.dao;

import in.maruthanalagar.mambilling.model.User;

public class UserDAO {
	
	public User[] findAll() {
		User[] userList = UserList.ListOfUsers;	
		return userList;
	}
	

	public void create() {
		User newUser = new User();
		
		newUser.setId(12345);
		newUser.setFirstname("Maruthan");
		newUser.setLastname("Alagar");
		newUser.setEmail("maruthu@gmail.com");
		newUser.setPassword("Asdf");
		newUser.setActive(true);
		
		UserList.ListOfUsers[0] = newUser; 
		
	}
}
