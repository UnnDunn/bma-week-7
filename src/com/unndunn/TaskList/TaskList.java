package com.unndunn.TaskList;

import java.util.ArrayList;
import java.util.List;

public class TaskList {

	private List<Task> AllTasks;

	public TaskList() {
		AllTasks = new ArrayList<Task>();
	}

	public void ListTasks() {
		if(AllTasks.isEmpty()) {
			System.out.println("There are no tasks in the list");
			return;
		}
		
		System.out.println(ShowHeading("All Tasks"));
		
		int i = 1;
		for (Task task : AllTasks) {
			System.out.println(i + ": " + task + "\n---");
			i++;
		}
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
