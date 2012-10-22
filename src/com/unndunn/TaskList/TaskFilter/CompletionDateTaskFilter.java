package com.unndunn.TaskList.TaskFilter;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import com.unndunn.TaskList.Task;

public class CompletionDateTaskFilter extends DateTaskFilter {

	public CompletionDateTaskFilter() {
	}

	public CompletionDateTaskFilter(Date startDate, Date endDate) {
		super(startDate, endDate);
	}

	@Override
	public Task[] filter(Task[] tasks) {
		List<Task> result = new ArrayList<Task>();

		for (Task currTask : tasks) {
			Date completionDate = currTask.getCompletionDate();
			if(IsInDateRange(completionDate))
				result.add(currTask);
		}
		
		return (Task[]) result.toArray();
	}

}
