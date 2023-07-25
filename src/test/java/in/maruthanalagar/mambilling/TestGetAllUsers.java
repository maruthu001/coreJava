package in.maruthanalagar.mambilling;

import org.junit.jupiter.api.Test;

import in.maruthanalagar.mambilling.model.User;
import in.maruthanalagar.mambilling.service.UserService;

public class TestGetAllUsers {
	
	
	
	@Test
	public void findById() {
		UserService userService = new UserService();
		
		User finalUser = userService.findById(1);
		System.out.println(finalUser);
		
	}
	@Test
	public void getAllUsers() {
		UserService userService = new UserService();
		System.out.println(userService.getAll());

	}
	@Test
	public void findByEmailId() {
		UserService userService = new UserService();
		
		User finalUser = userService.findByEmail("amaruthanalagar@gmail.com");
		System.out.println(finalUser);
		
	}
	@Test
	public void counting() {
		UserService userService = new UserService();
		
		
		System.out.println(userService.count());
		
	}

}
