package in.maruthanalagar.mambilling.service;

import java.time.Instant;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.ZoneId;
import java.time.format.DateTimeFormatter;
import java.util.Date;
import java.util.List;

import in.maruthanalagar.mambilling.dao.TaskDAO;
import in.maruthanalagar.mambilling.exception.ValidationException;
import in.maruthanalagar.mambilling.model.Task;
import in.maruthanalagar.mambilling.validation.TaskValidator;

public class TaskService {
	TaskDAO taskDAO = new TaskDAO();

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
	
	public static Date convertDate(LocalDate newDate) {
	    LocalDateTime localDateTime = newDate.atStartOfDay();
        Date date = Date.from(localDateTime.atZone(ZoneId.systemDefault()).toInstant());
        return date;
	
	}
	
	public static LocalDate convertSqlDateToLocalDate(Date sqlDate) {
		java.sql.Date c = (java.sql.Date) sqlDate;
		java.util.Date utilDate = new java.util.Date(c.getTime());
		 return utilDate.toInstant().atZone(ZoneId.systemDefault()).toLocalDate();
    }

	public void create(Task task) throws Exception {

		TaskValidator.validate(task);

		taskDAO.create(task);

	}

	public void update(int id, Task updatedTask) throws ValidationException {

		TaskValidator.validate(updatedTask);

		taskDAO.update(id, updatedTask);

	}

	public void delete(int id) {

		taskDAO.delete(id);

	}

	public Task findById(int id) {

		return taskDAO.findById(id);

	}

	public int count() {
		return taskDAO.count();

	}

	public List<Task> getAll() {

		List<Task> TaskList = taskDAO.findAll();

		return TaskList;

	}
	
	public List<Task> getByDate(LocalDate date){
		List<Task> TaskList = taskDAO.findByDate(date);

		return TaskList;
		
	}

}
