package in.maruthanalagar.mambilling.validation;

import in.maruthanalagar.mambilling.model.User;
import java.lang.Exception;

public class UserValidator {

	public static void validate(User newUser) throws Exception {
		
		if(newUser == null) {
			throw new Exception("Invalid User Input");
		}
		
		if (newUser.getEmail() == null || "".equals(newUser.getEmail().trim())) {
			throw new Exception("Email Cannot be Null or Empty");
		}
		
		if (newUser.getPassword() == null || "".equals(newUser.getPassword().trim())) {
			throw new IllegalArgumentException("Password Can not be Null or Empty");
		}
		if (newUser.getFirstname() == null || "".equals(newUser.getFirstname().trim())) {
			throw new IllegalArgumentException("First Name Can not be Null or Empty");
		}
	}
	
	
}
