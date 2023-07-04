package in.maruthanalagar.mambilling.model;

import java.time.LocalDate;

public class Task {
	
	
		int taskID;
	String taskName;
	LocalDate dueDate;
	boolean isActive;
	
	public int getTaskID() {
		return taskID;
	}
	public void setTaskID(int taskID) {
		this.taskID = taskID;
	}
	public String getTaskName() {
		return taskName;
	}
	public void setTaskName(String taskName) {
		this.taskName = taskName;
	}
	public LocalDate getDueDate() {
		return dueDate;
	}
	public void setDueDate(LocalDate dueDate) {
		this.dueDate = dueDate;
	}
	public boolean isActive() {
		return isActive;
	}
	public void setActive(boolean isActive) {
		this.isActive = isActive;
	}
	@Override
	public String toString() {
		return "Task : Task ID = " + taskID + ", Task Name = " + taskName + ", Due Date = " + dueDate + ", Is Active = " + isActive;
	}

}
