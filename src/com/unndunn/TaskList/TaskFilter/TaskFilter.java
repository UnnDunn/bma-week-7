package com.unndunn.TaskList.TaskFilter;

import com.unndunn.TaskList.Task;

public interface TaskFilter {
	public Task[] filter(Task[] tasks);
}
