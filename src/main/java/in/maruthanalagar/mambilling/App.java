package in.maruthanalagar.mambilling;

import in.maruthanalagar.mambilling.model.User;
import in.maruthanalagar.mambilling.service.UserService;

public class App {

	public static void main(String[] args){
		UserService userService;
		User newUser;
		try {
			userService = new UserService();

			newUser = new User();
			
			newUser.setId(12345);
			newUser.setFirstname("Maruthan");
			newUser.setLastname("Alagar");
			newUser.setEmail("maruthanalagar@gmail.com");
			newUser.setPassword("Asdf@123");
			newUser.setActive(true);
			userService.create(newUser);
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		
		
		
		

//		userService.update();
//		userService.delete();
//		userService.getAll();
//		userService.findById();
//		userService.findByEmail();

	}

}
