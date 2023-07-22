package in.maruthanalagar.mambilling.validation;

import in.maruthanalagar.mambilling.exception.ValidationException;
import in.maruthanalagar.mambilling.model.User;
import in.maruthanalagar.mambilling.util.StringUtil;

public class UserValidator {

	public static void validate(User newUser) throws ValidationException {

		if (newUser == null) {
			throw new ValidationException("Invalid User Input");
		}

		StringUtil.rejectIfInvalidString(newUser.getEmail(), "Email");
		StringUtil.rejectIfInvalidString(newUser.getPassword(), "Password");
		StringUtil.rejectIfInvalidString(newUser.getFirstname(), "Firstname");

	}

}
