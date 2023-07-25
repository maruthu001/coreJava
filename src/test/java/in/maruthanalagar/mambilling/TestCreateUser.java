package in.maruthanalagar.mambilling;

import static org.junit.jupiter.api.Assertions.assertDoesNotThrow;
import static org.junit.jupiter.api.Assertions.assertThrows;
import static org.junit.jupiter.api.Assertions.assertTrue;

import org.junit.jupiter.api.Test;

import in.maruthanalagar.mambilling.exception.ValidationException;
import in.maruthanalagar.mambilling.model.User;
import in.maruthanalagar.mambilling.service.UserService;

public class TestCreateUser {
	@Test
	public void testCreateUserWithValidData() {
		UserService userService = new UserService();

		User newUser = new User();

		
		newUser.setFirstname("Maruthan");
		newUser.setLastname("Alagar");
		newUser.setEmail("amaruthan@gmail.com");
		newUser.setPassword("Asdf@123");
		

		assertDoesNotThrow(() -> {
			userService.create(newUser);
		});

	}

	@Test
	public void testCreateUserWithInvalidData() {
		UserService userService = new UserService();
		Exception exception = assertThrows(ValidationException.class, () -> {
			userService.create(null);
		});
		String expectedMessage = "Invalid User Input";
		String actualMessage = exception.getMessage();
		assertTrue(expectedMessage.equals(actualMessage));
	}

	@Test
	public void testCreateUserWithEmailNull() {
		UserService userService = new UserService();
		Exception exception = assertThrows(ValidationException.class, () -> {

			User newUser = new User();

			newUser.setId(12345);
			newUser.setFirstname("Maruthan");
			newUser.setLastname("Alagar");
			newUser.setEmail(null);
			newUser.setPassword("Asdf@123");
			newUser.setActive(true);

			userService.create(newUser);
		});
		String expectedMessage = "Email cannot be Null or Empty";
		String actualMessage = exception.getMessage();
		assertTrue(expectedMessage.equals(actualMessage));
	}

	@Test
	public void testCreateUserWithEmailEmpty() {
		UserService userService = new UserService();
		Exception exception = assertThrows(ValidationException.class, () -> {

			User newUser = new User();

			newUser.setId(12345);
			newUser.setFirstname("Maruthan");
			newUser.setLastname("Alagar");
			newUser.setEmail("");
			newUser.setPassword("Asdf@123");
			newUser.setActive(true);

			userService.create(newUser);
		});
		String expectedMessage = "Email cannot be Null or Empty";
		String actualMessage = exception.getMessage();
		assertTrue(expectedMessage.equals(actualMessage));
	}
	@Test
	public void testCreateUserWithExistingEmail() {
		UserService userService = new UserService();
		Exception exception = assertThrows(RuntimeException.class, () -> {

			User newUser = new User();

		
			newUser.setFirstname("Maruthan");
			newUser.setLastname("Alagar");
			newUser.setEmail("maruthan@gmail.com");
			newUser.setPassword("Asdf@123");
		

			userService.create(newUser);
		});
		String expectedMessage = "Duplicate constraint";
		String actualMessage = exception.getMessage();
		assertTrue(expectedMessage.equals(actualMessage));
	}

	@Test
	public void testCreateUserWithPasswordEmpty() {
		UserService userService = new UserService();
		Exception exception = assertThrows(ValidationException.class, () -> {

			User newUser = new User();

			newUser.setId(12345);
			newUser.setFirstname("Maruthan");
			newUser.setLastname("Alagar");
			newUser.setEmail("amaruthanalagar@gmail.com");
			newUser.setPassword("");
			newUser.setActive(true);

			userService.create(newUser);
		});
		String expectedMessage = "Password cannot be Null or Empty";
		String actualMessage = exception.getMessage();
		assertTrue(expectedMessage.equals(actualMessage));
	}

	@Test
	public void testCreateUserWithPasswordNull() {
		UserService userService = new UserService();
		Exception exception = assertThrows(ValidationException.class, () -> {

			User newUser = new User();

			newUser.setId(12345);
			newUser.setFirstname("Maruthan");
			newUser.setLastname("Alagar");
			newUser.setEmail("amaruthanalagar@gmail.com");
			newUser.setPassword(null);
			newUser.setActive(true);

			userService.create(newUser);
		});
		String expectedMessage = "Password cannot be Null or Empty";
		String actualMessage = exception.getMessage();
		assertTrue(expectedMessage.equals(actualMessage));
	}

	@Test
	public void testCreateUserWithFirstnameEmpty() {
		UserService userService = new UserService();
		Exception exception = assertThrows(ValidationException.class, () -> {

			User newUser = new User();

			newUser.setId(12345);
			newUser.setFirstname("");
			newUser.setLastname("Alagar");
			newUser.setEmail("amaruthanalagar@gmail.com");
			newUser.setPassword("asdf@123");
			newUser.setActive(true);

			userService.create(newUser);
		});
		String expectedMessage = "Firstname cannot be Null or Empty";
		String actualMessage = exception.getMessage();
		assertTrue(expectedMessage.equals(actualMessage));
	}

	@Test
	public void testCreateUserWithFirstnameNull() {
		UserService userService = new UserService();
		Exception exception = assertThrows(ValidationException.class, () -> {

			User newUser = new User();

			newUser.setId(12345);
			newUser.setFirstname(null);
			newUser.setLastname("Alagar");
			newUser.setEmail("amaruthanalagar@gmail.com");
			newUser.setPassword("asdf@123");
			newUser.setActive(true);

			userService.create(newUser);
		});
		String expectedMessage = "Firstname cannot be Null or Empty";
		String actualMessage = exception.getMessage();
		assertTrue(expectedMessage.equals(actualMessage));
	}

}
