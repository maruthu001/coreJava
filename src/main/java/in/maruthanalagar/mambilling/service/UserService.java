package in.maruthanalagar.mambilling.service;

import in.maruthanalagar.mambilling.dao.UserDAO;
import in.maruthanalagar.mambilling.model.User;

public class UserService {

	public User[] getAll() {

		UserDAO userdao = new UserDAO();

		User[] UserList = userdao.findAll();

		for (int i = 0; i < 5; i++) {
			
			if(UserList[i]==null) {
				System.out.println("????????No Data????????");
				break;
			}
			System.out.println(UserList[i]);
		}

		return UserList;

	}

	public void create() {

		User newUser = new User();
		UserDAO userDAO = new UserDAO();
		newUser.setId(12345);
		newUser.setFirstname("Maruthan");
		newUser.setLastname("Alagar");
		newUser.setEmail("maruthanalagar@gmail.com");
		newUser.setPassword("Asdf@123");
		newUser.setActive(true);

		userDAO.create(newUser);

		User newUser1 = new User();

		newUser1.setId(123456);
		newUser1.setFirstname("Surya");
		newUser1.setLastname("Umapathy");
		newUser1.setEmail("suryaumathy@gmail.com");
		newUser1.setPassword("Asdf@123");
		newUser1.setActive(true);

		userDAO.create(newUser1);

	}
	public void update() {

		User updatedUser = new User();
		UserDAO userDAO = new UserDAO();
		updatedUser.setId(12345);
		updatedUser.setFirstname("Dhanush");
		updatedUser.setLastname("Selvam");
		updatedUser.setEmail("asdfg@gmail.com");
		updatedUser.setPassword("Asdf@123");
		updatedUser.setActive(false);
		
		userDAO.update(updatedUser);
		
	}	
	
	public void delete() {

		UserDAO userDAO = new UserDAO();
	
		userDAO.delete(12345);
		
	}	
	public void findById() {

		UserDAO userDAO = new UserDAO();
	
		userDAO.findById(12345);
		
	}	
	
	public void findByEmail() {

		UserDAO userDAO = new UserDAO();
	
		userDAO.findByEmail("suryaumathy@gmail.com");
		
	}	
	
	
	
	
	
	
	
	
	
	
	

}
