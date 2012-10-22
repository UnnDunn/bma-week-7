package com.unndunn.TaskList;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Date;
import java.util.List;

public abstract class RepeatingTask extends Task
{
	protected List<Date> DueDates;
	
	public Date getDueDate() {
		if (DueDates.isEmpty()) return null;
		
		Date result = null;
		
		Collections.sort(DueDates);
		
		Date currentDate = new Date();
		
		for(Date testDate : DueDates){
			if(testDate.compareTo(currentDate) > 1) {
				result = testDate;
				break;
			}
		}
		
		if (result == null) result = DueDates.get(DueDates.size() - 1);
		return result;
	}
	
	public List<Date> listDueDates() {
		return DueDates;
	}
	
	public void SetDueDate(Date dueDate) {
		if(!DueDates.contains(dueDate)) DueDates.add(dueDate);
	}
	
	public void ResetDueDates() {
		DueDates.clear();
	}
	
	public String toString() {
		String result = "Repeating ";
		result += super.toString();
		result += DueDatesString(false);
		
		return result;
	}
	
	protected List<Date> getDueDatesAfter(Date minDate)
	{
		List<Date> resultDates = new ArrayList<Date>();
		for(Date date : DueDates) {
			if(date.compareTo(minDate) > 0) {
				resultDates.add(date);
			}
		}
		
		return resultDates;
	}
	
	protected String DueDatesString(Boolean showUpcomingOnly) {
		showUpcomingOnly = showUpcomingOnly != null ? showUpcomingOnly : false;
		
		List<Date> resultDates = new ArrayList<Date>();
		if(showUpcomingOnly) {
			resultDates = getDueDatesAfter(new Date());
		}
		
		String result = null;
		// add due dates to string if necessary
		if(resultDates.isEmpty()) {
			result += showUpcomingOnly ? "\nNo upcoming due dates for this task.\n" : "\nNo due dates for this task.\n";
		} else {
			result += showUpcomingOnly ? "\nUpcoming Due Dates:\n" : "\nDue dates:\n";
			for(Date date : resultDates) {
				result += "\t" + date + "\n";
			}
			
			result += showUpcomingOnly
					? String.format("%s upcoming dates (out of %s total dates.)\n", resultDates.size(), DueDates.size())
					: String.format("%s total dates.", resultDates.size());
		}
		
		return result;

	}
}
