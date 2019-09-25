package com.testcases;

import java.util.Date;

import org.testng.annotations.Test;

import com.lanstad.CalendarPage;
import com.lanstad.CreateTask;
import com.lanstad.beans.Task;

public class TaskTC {
	
	@Test
	public void moveTaskTest() {
		
		// Edit the project
		
		// Create task
		
		// Navigate to create task page
		
		CreateTask cPage = new CreateTask(); // Page Object
		Date today = new Date();
		String start = "01/" + today.getMonth() + "/" + today.getYear();
		
		Task myTask  = cPage.create("01/01/2019", "20/01/2019");
		
		// Go to Calendar View
		// Switch to month view
		
	}
	
	@Test
	public void moveTaskTestFromPast() {
		
		// Edit the project
		
		// Create task
		
		// Navigate to create task page
		
		int past = (int) Math.random();
		
		CreateTask cPage = new CreateTask(); // Page Object
		Date today = new Date();
		String start = "01/" + (today.getMonth() - past) + "/" + today.getYear();
		String end = "20/" + (today.getMonth() - past) + "/" + today.getYear();
		
		Task myTask  = cPage.create(start, end);
		
		// Go to Calendar View
		
		String newEndDate = "25/" + (today.getMonth() - past) + "/" + today.getYear();
		
		CalendarPage calPage = new CalendarPage();
		calPage.moveTask(myTask, newEndDate);
		
	}

}
