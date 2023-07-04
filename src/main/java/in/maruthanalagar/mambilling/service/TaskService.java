package in.maruthanalagar.mambilling.service;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

import in.maruthanalagar.mambilling.dao.TaskDAO;
import in.maruthanalagar.mambilling.model.Task;
import in.maruthanalagar.mambilling.validation.TaskValidator;

public class TaskService {
	public Task[] getAll() {

		TaskDAO taskdao = new TaskDAO();

		Task[] TaskList = taskdao.findAll();

		for (int i = 0; i < 5; i++) {
			
			if(TaskList[i]==null) {
				System.out.println("???????? No Task Available ????????");
				break;
			}
			System.out.println(TaskList[i]);
		}

		return TaskList;

	}
	
	
	
	
	 public static LocalDate convertToDate(String dateString) {
	        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd/MM/yyyy");

	        try {
	            LocalDate localDate = LocalDate.parse(dateString, formatter);
	            return localDate;
	        } catch (Exception e) {
	            System.out.println("Invalid date format!");
	            return null;
	        }
	    }
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	

	public void create(Task task) throws Exception {

		TaskValidator.validate(task);
		
		TaskDAO taskDAO = new TaskDAO();
		
		taskDAO.create(task);
		
		

	}
	public void update(Task updatedTask) {

//		TaskValidator.validate(updatedTask);
		
		TaskDAO taskDAO = new TaskDAO();
		
		taskDAO.update(updatedTask);
		
	}	
	
	public void delete(int id) {

		TaskDAO taskDAO = new TaskDAO();
	
		taskDAO.delete(id);
		
	}	
	public void findById(int id) {

		TaskDAO taskDAO = new TaskDAO();
	
		taskDAO.findById(id);
		
	}	
	
		
	

}
