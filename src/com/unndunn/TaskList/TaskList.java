package com.unndunn.TaskList;

import java.util.ArrayList;
import java.util.List;

public class TaskList {

	private List<Task> AllTasks;

	public TaskList() {
		AllTasks = new ArrayList<Task>();
	}
	
	public TaskList(Task[] tasks) {
		AllTasks = new ArrayList<Task>();
		for (Task task : tasks) AllTasks.add(task);
	}

	public void DeleteTask(int index) {
		if(index >= AllTasks.size() || index < 0) return;
		AllTasks.remove(index);
	}

	public int AddTask(Task task) {
		int newIndex = AllTasks.size();
		AllTasks.add(task);
		
		return newIndex;
	}
	
	public Task[] listTasks()
	{
		return (Task[]) AllTasks.toArray();
	}
	
	public Task getTask(int index)
	{
		if(index >= AllTasks.size() || index < 0) return null;
		return AllTasks.get(index);
	}
}
