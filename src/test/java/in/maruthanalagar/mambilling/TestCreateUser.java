package in.maruthanalagar.mambilling;

import static org.junit.jupiter.api.Assertions.assertDoesNotThrow;
import static org.junit.jupiter.api.Assertions.assertThrows;
import static org.junit.jupiter.api.Assertions.assertTrue;

import org.junit.jupiter.api.Test;

import in.maruthanalagar.mambilling.model.User;
import in.maruthanalagar.mambilling.service.UserService;

public class TestCreateUser {
	@Test
	public void testCreateUserWithValidData() {
		UserService userService = new UserService();

		User newUser = new User();

		newUser.setId(12345);
		newUser.setFirstname("Maruthan");
		newUser.setLastname("Alagar");
		newUser.setEmail("maruthanalagar@gmail.com");
		newUser.setPassword("Asdf@123");
		newUser.setActive(true);

		assertDoesNotThrow(() -> {
			userService.create(newUser);
		});

	}

	@Test
	public void testCreateUserWithInvalidData(){
		UserService userService = new UserService();
		Exception exception = assertThrows(Exception.class,()->{
			userService.create(null);
		});
		String expectedMessage = "Invalid User Input";
		String actualMessage = exception.getMessage();
		assertTrue(expectedMessage.equals(actualMessage));
	}
	

	@Test
	public void testCreateUserWithEmailNull(){
		UserService userService = new UserService();
		Exception exception = assertThrows(Exception.class,()->{
			
			User newUser = new User();

			newUser.setId(12345);
			newUser.setFirstname("Maruthan");
			newUser.setLastname("Alagar");
			newUser.setEmail(null);
			newUser.setPassword("Asdf@123");
			newUser.setActive(true);

			
			userService.create(newUser);
		});
		String expectedMessage = "Email Cannot be Null or Empty";
		String actualMessage = exception.getMessage();
		assertTrue(expectedMessage.equals(actualMessage));
	}
	@Test
	public void testCreateUserWithEmailEmpty(){
		UserService userService = new UserService();
		Exception exception = assertThrows(Exception.class,()->{
			
			User newUser = new User();

			newUser.setId(12345);
			newUser.setFirstname("Maruthan");
			newUser.setLastname("Alagar");
			newUser.setEmail("");
			newUser.setPassword("Asdf@123");
			newUser.setActive(true);

			
			userService.create(newUser);
		});
		String expectedMessage = "Email Cannot be Null or Empty";
		String actualMessage = exception.getMessage();
		assertTrue(expectedMessage.equals(actualMessage));
	}
	
	
	

}
