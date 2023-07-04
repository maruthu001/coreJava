package in.maruthanalagar.mambilling.validation;

import in.maruthanalagar.mambilling.exception.ValidationException;
import in.maruthanalagar.mambilling.model.Task;
import in.maruthanalagar.mambilling.util.StringUtil;

public class TaskValidator {
public static void validate(Task newTask) throws ValidationException {
		
		if(newTask == null) {
			throw new ValidationException("Invalid Task Input");
		}

		StringUtil.rejectIfInvalidString(newTask.getTaskName(), "Taskname");
		StringUtil.rejectIfInvalidDate(newTask.getDueDate(), "Due Date");
		
		
		

	}

}
