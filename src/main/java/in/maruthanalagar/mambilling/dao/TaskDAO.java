package in.maruthanalagar.mambilling.dao;

import in.maruthanalagar.mambilling.model.Task;

public class TaskDAO {
	public Task[] findAll() {
		Task[] taskList = TaskList.taskList;
		return taskList;
	}

	
	public void create(Task newTask) {

		Task[] taskList1 = TaskList.taskList;

		for (int i = 0; i < taskList1.length; i++) {
			Task task1 = TaskList.taskList[i];
			if (task1 == null) {
				 TaskList.taskList[i] = newTask;
				break;
			}

		}


	}

	public void update(Task updatedTask) {

		Task[] taskList2 = TaskList.taskList;

		for (int i = 0; i < taskList2.length; i++) {
			Task task1 = taskList2[i];

			if (task1 == null) {
				continue;
			}
			if (task1.getTaskID() == updatedTask.getTaskID()) {
				task1 = updatedTask;

			}

		}

	}
	
	public void delete(int id) {

		Task[] taskList3 = TaskList.taskList;


		for (int i = 0; i < taskList3.length; i++) {
			Task task1 = taskList3[i];

			if (task1 == null) {
				continue;
			}
			if (task1.getTaskID() == id) {
				task1.setActive(false);

			}

		}

	}
	
	
	
		public Task findById(int taskId) {
			Task[] taskList4 = TaskList.taskList;
			Task matchedTask = null;

			for (int i = 0; i < taskList4.length; i++) {
				Task task = taskList4[i];
				if (task.getTaskID() == taskId) {
					matchedTask = task;
					break;
				}
			}
			System.out.println(matchedTask);
			return matchedTask;
		}

}
