package com.unndunn.TaskList;

import java.util.Date;

public abstract class Task {

	private String Title;
	private String Description;
	private Date CreateDate;
	private Date DueDate;
	private Date CompletionDate;
	
	// Accessors
	public String getTitle() {
		return this.Title;
	}
	
	public void setTitle(String title) {
		Title = title;
	}
	
	public String getDescription() {
		return Description;
	}
	
	public void setDescription(String description) {
		Description = description;
	}
	
	public Date getDueDate() {
		return DueDate;
	}
	
	public Date getCompletionDate() {
		return CompletionDate;
	}
	
	public Boolean isComplete() {
		return CompletionDate != null;
	}
	
	public Date getCreateDate() {
		return CreateDate;
	}
	// End Accessors
	
	Task() {
		Title = "Untitled Task";
		CreateDate = new Date();
	}
	
	Task(String title)
	{
		setTitle(title);
	}
	
	Task(String title, Date dueDate) {
		Title = title != null ? title : "Untitled task";
		if(dueDate != null) DueDate = dueDate;
		CreateDate = new Date();
	}
	
	public void CompleteTask() {
		// set completion date for task
		CompletionDate = new Date();
	}
	
	public String toString() {
		String result = "Task: "
				+ TitleString() 
				+ ", " + CreatedDateString()
				+ ", " + DueDateString()
				+ ", " + CompletionDateString();
		
		return result;
	}
	
	protected String CreatedDateString() {
		return "Created: " + CreateDate;
	}
	
	protected String TitleString() {
		return "\"" + Title + "\"";
	}
	
	protected String DueDateString() {
		return DueDate == null ? "No Due Date" : "Due: " + DueDate;
	}
	
	protected String CompletionDateString() {
		return CompletionDate == null ? "No Completion Date" : "Completed: " + CompletionDate;
	}
}
