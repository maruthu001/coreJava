package in.maruthanalagar.mambilling.validation;

import in.maruthanalagar.mambilling.exception.ValidationException;
import in.maruthanalagar.mambilling.model.User;
import in.maruthanalagar.mambilling.util.StringUtil;


public class UserValidator {

	public static void validate(User newUser) throws ValidationException {
		
		if(newUser == null) {
			throw new ValidationException("Invalid User Input");
		}
		
//		if (newUser.getEmail() == null || "".equals(newUser.getEmail().trim())) {
//			throw new ValidationException("Email Cannot be Null or Empty");
//		}
		
//		if (newUser.getPassword() == null || "".equals(newUser.getPassword().trim())) {
//			throw new ValidationException("Password Can not be Null or Empty");
//		}
		
//		if (newUser.getFirstname() == null || "".equals(newUser.getFirstname().trim())) {
//			throw new ValidationException("First Name Can not be Null or Empty");
//		}		
		StringUtil.rejectIfInvalidString(newUser.getEmail(), "Email");
		StringUtil.rejectIfInvalidString(newUser.getPassword(), "Password");
		StringUtil.rejectIfInvalidString(newUser.getFirstname(), "Firstname");
		
		
		

	}
	
	
}
