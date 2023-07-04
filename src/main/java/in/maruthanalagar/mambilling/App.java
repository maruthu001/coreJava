package in.maruthanalagar.mambilling;

import java.time.LocalDate;

import in.maruthanalagar.mambilling.model.Task;
import in.maruthanalagar.mambilling.model.User;
import in.maruthanalagar.mambilling.service.TaskService;
import in.maruthanalagar.mambilling.service.UserService;

public class App {

	public static void main(String[] args){


		
		TaskService taskService;
		Task newTask;
	
			taskService = new TaskService();

			newTask = new Task();
			
			
			newTask.setTaskName("Open the Door");
			
			 String userInput = "23/07/2023";
		     LocalDate convertedDate = TaskService.convertToDate(userInput);
		     newTask.setDueDate(convertedDate);
			newTask.setTaskID(00001);
			newTask.setActive(true);
			
			try {
				
				taskService.create(newTask);
			} catch (Exception e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			taskService.getAll();
			
		
		
		
		
		
		
		
	

}
}
