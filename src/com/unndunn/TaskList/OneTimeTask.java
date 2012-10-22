package com.unndunn.TaskList;

import java.util.Date;

public class OneTimeTask extends Task
{
	public OneTimeTask() {
		super();
	}
	
	public OneTimeTask(String title) {
		super(title);
	}

	public OneTimeTask(String title, Date dueDate) {
		super(title, dueDate);
	}
}



