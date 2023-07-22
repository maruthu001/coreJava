package in.maruthanalagar.mambilling.service;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
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

	public void findById(int id) {

		taskDAO.findById(id);

	}

	public int count() {
		return taskDAO.count();

	}

	public List<Task> getAll() {

		List<Task> TaskList = taskDAO.findAll();

		return TaskList;

	}

}
