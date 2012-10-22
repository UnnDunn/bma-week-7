import java.util.ArrayList;
import java.util.Calendar;
import java.util.Date;
import java.util.List;

import com.unndunn.TaskList.Task;



class Assignment {
	
	/**
	 * @param args
	 */
	public static void main(String[] args) {
		
		List<Task> taskList = new ArrayList<Task>(); // Our list of tasks
		
		// generate five OneTime tasks, 
		for(int i = 0; i < 5; i++)
		{
			Calendar cal = Calendar.getInstance(); // Calendar object to generate dates
			String taskName = String.format("OneTime task %d", i + 1);
			cal.add(Calendar.DAY_OF_MONTH, i);
			Date dueDate = cal.getTime();
		}
	}
	
	public static String getElement(String[] values, int index) {
		if(index >= values.length || index < 0)
			return null;
		
		return values[index];
	}

	public static String ShowHeading(String prompt) {
		String hrule = "";
		for(int i = 0; i < prompt.length(); i++) hrule += "=";
		return prompt + "\n" + hrule;
	}

}
