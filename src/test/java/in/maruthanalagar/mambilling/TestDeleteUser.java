package in.maruthanalagar.mambilling;

import static org.junit.jupiter.api.Assertions.assertDoesNotThrow;

import org.junit.jupiter.api.Test;

import in.maruthanalagar.mambilling.service.UserService;

public class TestDeleteUser {
	@Test
	public void testUpdateUserWithValidData(){
		UserService userService = new UserService();

		assertDoesNotThrow(() -> {
			userService.delete(1);
		});

	}

}
