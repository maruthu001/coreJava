package in.maruthanalagar.mambilling;

import static org.junit.jupiter.api.Assertions.assertDoesNotThrow;

import org.junit.jupiter.api.Test;

import in.maruthanalagar.mambilling.service.TaskService;



public class TestDeleteTask {
	@Test
	public void testUpdateUserWithValidData(){
		TaskService taskService = new TaskService();

		assertDoesNotThrow(() -> {
			taskService.delete(3);
		});

	}

}
