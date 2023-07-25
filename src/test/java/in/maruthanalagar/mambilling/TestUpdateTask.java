package in.maruthanalagar.mambilling;

import static org.junit.jupiter.api.Assertions.assertDoesNotThrow;

import java.time.LocalDate;

import org.junit.jupiter.api.Test;

import in.maruthanalagar.mambilling.model.Task;
import in.maruthanalagar.mambilling.service.TaskService;

public class TestUpdateTask {
	@Test
	public void testUpdateUserWithValidData(){
		TaskService taskService = new TaskService();

		Task newTask = new Task();

		String userInput = "27/07/2023";

		newTask.setTaskName("Open the Door");
		LocalDate convertedDate = TaskService.convertToDate(userInput);
		newTask.setDueDate(convertedDate);

		assertDoesNotThrow(() -> {
			taskService.update(1,newTask );
		});

	}

}
