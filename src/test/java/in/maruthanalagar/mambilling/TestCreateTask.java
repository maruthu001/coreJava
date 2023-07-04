
package in.maruthanalagar.mambilling;

import static org.junit.jupiter.api.Assertions.assertDoesNotThrow;
import static org.junit.jupiter.api.Assertions.assertThrows;
import static org.junit.jupiter.api.Assertions.assertTrue;

import java.time.LocalDate;

import org.junit.jupiter.api.Test;

import in.maruthanalagar.mambilling.exception.ValidationException;
import in.maruthanalagar.mambilling.model.Task;
import in.maruthanalagar.mambilling.service.TaskService;

public class TestCreateTask {

	@Test
	public void testCreateTaskWithValidData() {
		TaskService taskService = new TaskService();

		Task newTask = new Task();

		newTask.setTaskID(12345);
		String userInput = "23/07/2023";

		newTask.setTaskName("Open the Door");
		LocalDate convertedDate = TaskService.convertToDate(userInput);
		newTask.setDueDate(convertedDate);
		newTask.setActive(true);

		assertDoesNotThrow(() -> {
			taskService.create(newTask);
		});

	}

	@Test
	public void testCreateTaskWithInvalidData() {
		TaskService taskService = new TaskService();
		Exception exception = assertThrows(ValidationException.class, () -> {
			taskService.create(null);
		});
		String expectedMessage = "Invalid Task Input";
		String actualMessage = exception.getMessage();
		assertTrue(expectedMessage.equals(actualMessage));
	}

	@Test
	public void testCreateTaskWithTaskNameNull() {
		TaskService taskService = new TaskService();
		Exception exception = assertThrows(ValidationException.class, () -> {

			Task newTask = new Task();

			newTask.setTaskID(12345);
			String userInput = "23/07/2023";

			newTask.setTaskName(null);
			LocalDate convertedDate = TaskService.convertToDate(userInput);
			newTask.setDueDate(convertedDate);
			newTask.setActive(true);

			taskService.create(newTask);
		});
		String expectedMessage = "Taskname cannot be Null or Empty";
		String actualMessage = exception.getMessage();
		assertTrue(expectedMessage.equals(actualMessage));
	}

	@Test
	public void testCreateTaskWithTaskNameEmpty() {
		TaskService taskService = new TaskService();
		Exception exception = assertThrows(ValidationException.class, () -> {

			Task newTask = new Task();

			newTask.setTaskID(12345);
			String userInput = "23/07/2023";

			newTask.setTaskName("");
			LocalDate convertedDate = TaskService.convertToDate(userInput);
			newTask.setDueDate(convertedDate);
			newTask.setActive(true);

			taskService.create(newTask);
		});
		String expectedMessage = "Taskname cannot be Null or Empty";
		String actualMessage = exception.getMessage();
		assertTrue(expectedMessage.equals(actualMessage));
	}

	@Test
	public void testCreateTaskWithIdZero() {
		TaskService taskService = new TaskService();
		Exception exception = assertThrows(ValidationException.class, () -> {

			Task newTask = new Task();

			newTask.setTaskID(0);
			String userInput = "23/07/2023";

			newTask.setTaskName("Close The Door");
			LocalDate convertedDate = TaskService.convertToDate(userInput);
			newTask.setDueDate(convertedDate);
			newTask.setActive(true);

			taskService.create(newTask);
		});
		String expectedMessage = "Task ID cannot be 0 or more than 99999";
		String actualMessage = exception.getMessage();
		assertTrue(expectedMessage.equals(actualMessage));
	}

	@Test
	public void testCreateTaskWithIdMoreThanLimit() {
		TaskService taskService = new TaskService();
		Exception exception = assertThrows(ValidationException.class, () -> {

			Task newTask = new Task();

			newTask.setTaskID(999999);
			String userInput = "23/07/2023";

			newTask.setTaskName("Close The Door");
			LocalDate convertedDate = TaskService.convertToDate(userInput);
			newTask.setDueDate(convertedDate);
			newTask.setActive(true);

			taskService.create(newTask);
		});
		String expectedMessage = "Task ID cannot be 0 or more than 99999";
		String actualMessage = exception.getMessage();
		assertTrue(expectedMessage.equals(actualMessage));
	}


}
