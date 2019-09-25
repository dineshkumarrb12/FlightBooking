package com.lanstad;

import java.text.SimpleDateFormat;
import java.util.Date;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.Select;

import com.lanstad.beans.Task;

public class CreateTask {
	@FindBy(id="Tasks_task_name")
	private WebElement txtTaskName;
	@FindBy(id="Tasks_milestone_id")
	private WebElement drpMileStone;
	
	public Task create() {
		Task task = new Task();
		
		return task;
	}
	
	public Task create(String start, String end) {
		Task task = new Task();
		task.setName("New Task " + getTimeStamp()); 
		task.setMilestone("First Page Proofs");
		task.setType("Internal");
		task.setDescription("Automation Created");
		task.setStartDate(start);
		task.setEndDate(end);
		task.setTaskComplexity("Simple");
		
		txtTaskName.sendKeys(task.getName());
		
		Select mstone = new Select(drpMileStone);
		mstone.selectByVisibleText(task.getMilestone());
		
		/// complete remaining
		
		// Click Create button
		
		return task;
	}
	
	
	
	public  String getTimeStamp() {
		SimpleDateFormat sdf = new SimpleDateFormat("yyyyMMddHHmmssSSS");
		Date myDate = new Date();
		String timestamp = sdf.format(myDate);
		return timestamp;
	}

}
