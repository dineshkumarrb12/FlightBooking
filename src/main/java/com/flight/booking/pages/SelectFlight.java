package com.flight.booking.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class SelectFlight {
	By depart_flight1= By.xpath("//input[@value='Blue Skies Airlines$360$270$5:03]");
	By depart_flight2= By.xpath("//input[@value='Blue Skies Airlines$361$271$7:10']");
	By depart_flight3= By.xpath("//input[@value='Pangea Airlines$362$274$9:17']");
	By depart_flight4= By.xpath("//input[@value='Unified Airlines$363$281$11:24']");
	
	By return_flight1=By.xpath("//input[@value='Blue Skies Airlines$630$270$12:23']");
	By return_flight2=By.xpath("//input[@value='Blue Skies Airlines$631$273$14:30]");
	By return_flight3=By.xpath("//input[@value='Pangea Airlines$632$282$16:37']");
	By return_flight4=By.xpath("//input[@value='Unified Airlines$633$303$18:44']");
	
	WebDriver driver;
	WebDriverWait wait=new WebDriverWait(driver,600); //10 mins
	public SelectFlight(WebDriver driver)
	{
		this.driver=driver;
	}
	
	public void select_flight(String depart_flight, String return_flight)
	{{
		if(depart_flight.equalsIgnoreCase("Blue Skies Airlines 360"))
		{
			WebElement departflight=driver.findElement(depart_flight1);
			departflight.click();
		}
		else if(depart_flight.equalsIgnoreCase("Blue Skies Airlines 361"))
		{
			WebElement departflight=driver.findElement(depart_flight2);
			departflight.click();
		}
		else if(depart_flight.equalsIgnoreCase("Pangaea Airlines 362"))
		{
			WebElement departflight=driver.findElement(depart_flight3);
			departflight.click();
		}
		else if(depart_flight.equalsIgnoreCase("Unified Airlines 363"))
		{
			WebElement departflight=driver.findElement(depart_flight4);
			departflight.click();
		}}
	{
		if(return_flight.equalsIgnoreCase("Blue Skies Airlines 630"))
		{
			WebElement departflight=driver.findElement(return_flight1);
			departflight.click();
		}
		else if(return_flight.equalsIgnoreCase("Blue Skies Airlines 631"))
		{
			WebElement departflight=driver.findElement(return_flight2);
			departflight.click();
		}
		else if(return_flight.equalsIgnoreCase("Pangea Airlines 632"))
		{
			WebElement departflight=driver.findElement(return_flight3);
			departflight.click();
		}
		else if(return_flight.equalsIgnoreCase("Unified Airlines 633"))
		{
			WebElement departflight=driver.findElement(return_flight4);
			departflight.click();
		}
	}	
	}
	public void book_flight_continue()
	{
		WebElement selectfligt_continue=driver.findElement(By.name("reserveFlights"));
		selectfligt_continue.click();
		wait.until(ExpectedConditions.invisibilityOfElementLocated(By.name("reserveFlights")));//Exit Criteria

	}
}
