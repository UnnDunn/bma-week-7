package com.unndunn.TaskList.TaskFilter;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import com.unndunn.TaskList.Task;

public class DueDateTaskFilter extends DateTaskFilter {

	@Override
	public Task[] filter(Task[] tasks) {
		List<Task> result = new ArrayList<Task>();
		Date startDate = getStartDate();
		Date endDate = getEndDate();		
		
		for (Task currTask : tasks) {
			Date dueDate = currTask.getDueDate();
			if(startDate.before(dueDate) && endDate.after(dueDate))
				result.add(currTask);
		}
		
		return (Task[]) result.toArray();
	}
	
	public DueDateTaskFilter() {
		super();
	}
	
	public DueDateTaskFilter(Date startDate, Date endDate) {
		super(startDate, endDate);
	}
}
