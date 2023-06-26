package in.maruthanalagar.mambilling.service;

import in.maruthanalagar.mambilling.dao.UserDAO;
import in.maruthanalagar.mambilling.model.User;

public class UserService {

	public User[] getAll() {

		UserDAO userdao = new UserDAO();

		User[] UserList = userdao.findAll();

		System.out.println(UserList[0]);

		return UserList;

	}

	public void create() {

		User newUser = new User();
		newUser.setId(12345);
		newUser.setFirstname("Maruthan");
		newUser.setLastname("Alagar");
		newUser.setEmail("maruthanalagar@gmail.com");
		newUser.setPassword("Asdf@123");
		newUser.setActive(true);

		UserDAO userDAO = new UserDAO();
		userDAO.create(newUser);
	}

}
