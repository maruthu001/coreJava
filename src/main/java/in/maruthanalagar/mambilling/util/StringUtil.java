package in.maruthanalagar.mambilling.util;

import in.maruthanalagar.mambilling.exception.ValidationException;

public class StringUtil {

	public static void rejectIfInvalidString(String input, String inputName) throws ValidationException {
		if (input == null || "".equals(input.trim())) {
			throw new ValidationException(inputName.concat(" cannot be Null or Empty"));
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
