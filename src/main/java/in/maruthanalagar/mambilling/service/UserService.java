package in.maruthanalagar.mambilling.service;


import in.maruthanalagar.mambilling.dao.UserDAO;
import in.maruthanalagar.mambilling.model.User;
import in.maruthanalagar.mambilling.validation.UserValidator;

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

	public void create(User user) throws Exception {

		UserValidator.validate(user);
		
		UserDAO userDAO = new UserDAO();
		
		userDAO.create(user);
		
		

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
