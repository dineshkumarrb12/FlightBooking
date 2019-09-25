package com.lanstad;

import java.text.SimpleDateFormat;
import java.util.Date;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import com.lanstad.beans.Task;

public class CalendarPage {
	@FindBy(xpath="//button[text()='month']")
	private WebElement btnMonth;
	
	@FindBy(xpath="//div[@id='calendar']//h2")
	private WebElement currentMonth; 
	
	@FindBy(css="button.fc-prev-button")
	private WebElement prevButton;
	
	private WebDriver driver;
	
	public CalendarPage(WebDriver driver) {
		this.driver = driver;
	}

	private void switchToMonth() {
		btnMonth.click();
	}
	
	public void moveTask(Task task, String toDate) {
		Date endDate  = task.getEndDate();
		SimpleDateFormat sdf = new SimpleDateFormat("MMMM");
		String strEndDate = sdf.format(endDate);
		strEndDate = strEndDate + " " + endDate.getYear();
		
		String cMonth = currentMonth.getText();
		
		if(!strEndDate.equalsIgnoreCase(cMonth)) {
			//logic 
		}
		
		WebElement source = driver.findElement(By.xpath("//span[text()='" + task.getName() +"']"));
		
		// Move to task's month
	}
	
	
}
