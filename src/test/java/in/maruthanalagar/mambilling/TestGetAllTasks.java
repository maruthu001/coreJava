package in.maruthanalagar.mambilling;

import java.time.LocalDate;
import java.util.List;

import org.junit.jupiter.api.Test;

import in.maruthanalagar.mambilling.model.Task;
import in.maruthanalagar.mambilling.service.TaskService;
import in.maruthanalagar.mambilling.service.UserService;


public class TestGetAllTasks {
	@Test
	public void findById() {
		TaskService taskService = new TaskService();
		
		Task finalTask = taskService.findById(1);
		System.out.println(finalTask);
		
	}
	@Test
	public void getAllUsers() {
		TaskService taskService = new TaskService();
		System.out.println(taskService.getAll());

	}

	@Test
	public void findByDate() {
		TaskService taskService = new TaskService();
		String userInput2 = "27/07/2023";
		LocalDate convertedDate2 = TaskService.convertToDate(userInput2);
		List<Task> finalTask = taskService.getByDate(convertedDate2);
		System.out.println(finalTask);
		
	}
	@Test
	public void counting() {
		TaskService taskService = new TaskService();
		
		
		System.out.println(taskService.count());
		
	}
}
