package com.unndunn.TaskList.TaskFilter;

import java.util.Calendar;
import java.util.Date;

import com.unndunn.TaskList.Task;

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
	
	public DateTaskFilter() {
		StartDate = new Date();
	}
	
	public DateTaskFilter(Date startDate, Date endDate) {
		StartDate = startDate;
		EndDate = endDate;
	}
	
	protected void CheckDates() {
		try {
			// start date must be before end date.
			if(!StartDate.before(EndDate)) {
				Date tempDate = StartDate;
				StartDate = EndDate;
				EndDate = tempDate;
			}
		}
		catch(NullPointerException exc)
		{
			// one or both dates is null, which is OK
			return;
		}
	}
}
