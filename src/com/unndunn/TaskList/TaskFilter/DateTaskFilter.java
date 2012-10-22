package com.unndunn.TaskList.TaskFilter;

import java.util.Date;

public abstract class DateTaskFilter implements TaskFilter {
	private Date StartDate;
	private Date EndDate;
	
	public void setStartDate(Date startDate) {
		StartDate = startDate;
	}
	
	public Date getStartDate() {
		return StartDate;
	}
	
	public void setEndDate(Date endDate) {
		EndDate = endDate;
	}
	
	public Date getEndDate() {
		return EndDate;
	}
}
