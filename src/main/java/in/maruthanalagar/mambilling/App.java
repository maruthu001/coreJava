package in.maruthanalagar.mambilling;

import in.maruthanalagar.mambilling.service.UserService;

public class App {

	public static void main(String[] args) {
		UserService userService = new UserService();
		userService.getAll();

	}

}
