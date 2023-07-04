package in.maruthanalagar.mambilling.util;

import in.maruthanalagar.mambilling.exception.ValidationException;

public class StringUtil {

	public static void rejectIfInvalidString(String input, String inputName) throws ValidationException {
		if (input == null || "".equals(input.trim())) {
			throw new ValidationException(inputName.concat(" cannot be Null or Empty"));
		}
	}
	
	public static void rejectIfInvalidInt(int input, String inputName) throws ValidationException {
		if (input <= 0 || input > 99999) {
			throw new ValidationException(inputName.concat(" cannot be 0 or more than 99999"));
		}
	}

	public static boolean isValidString(String newString) {

		if (newString == null || "".equals(newString.trim())) {

			return false;
		}
		return true;

	}

	public static boolean isInvalidString(String newString) {

		if (!isValidString(newString)) {

			return true;
		}
		return false;

	}

}
