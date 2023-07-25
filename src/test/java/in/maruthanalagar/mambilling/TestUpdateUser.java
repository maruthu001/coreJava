package in.maruthanalagar.mambilling;

import static org.junit.jupiter.api.Assertions.assertDoesNotThrow;
import static org.junit.jupiter.api.Assertions.assertThrows;
import static org.junit.jupiter.api.Assertions.assertTrue;

import org.junit.jupiter.api.Test;

import in.maruthanalagar.mambilling.exception.ValidationException;
import in.maruthanalagar.mambilling.model.User;
import in.maruthanalagar.mambilling.service.UserService;


public class TestUpdateUser {
	@Test
	public void testUpdateUserWithValidData(){
		UserService userService = new UserService();

		User newUser = new User();

		
		newUser.setFirstname("Alagar");
		newUser.setLastname("Muthakonar");
		newUser.setEmail("alagarmuthakonar@gmail.com");
		newUser.setPassword("asdfghj");

		assertDoesNotThrow(() -> {
			userService.update(1,newUser );
		});

	}
	
	@Test
	public void testCreateUserWithInvalidData() {
		UserService userService = new UserService();
		Exception exception = assertThrows(ValidationException.class, () -> {
			userService.update(0,null);
		});
		String expectedMessage = "Invalid User Input";
		String actualMessage = exception.getMessage();
		assertTrue(expectedMessage.equals(actualMessage));
	}


}
