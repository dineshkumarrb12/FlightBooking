package com.flight.booking.pages;

import java.util.HashMap;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

public class FlightFinder { //6KB for 60 By objects
	WebDriver driver;	
	public By typeRound_tripe= By.xpath("//input[@value='roundtrip']");
	public By typeOneway_trip= By.xpath("//input[@value='oneway']");
	public By passanger_no =By.name("passCount");
	public By Depature_from =By.name("fromPort");
	public By depature_month=By.name("fromMonth");
	public By depature_date=By.name("fromDay");
	public By arriving_in=By.name("toPort");
	public By returning_month=By.name("toMonth");
	public By returning_date=By.name("toDay");
	public By serive_economy=By.xpath("//input[@name='servClass' and @value='Coach']");
	public By serive_business=By.xpath("//input[@name='servClass' and @value='Business']");
	public By serive_fistclass=By.xpath("//input[@name='servClass' and @value='First']");
	public By airline=By.name("airline");
	WebDriverWait wait=null;
	public FlightFinder(WebDriver driver)
	{
		this.driver=driver;
		this.wait=new WebDriverWait(driver,600);
	}
	public void flight_details(HashMap<String, String> flightinput)
	{
		String inputtype= flightinput.get("Type");	
		if(inputtype.equalsIgnoreCase("Round Trip"))
		{
			WebElement round_tripe= driver.findElement(typeRound_tripe);
			round_tripe.click();
		}
		else if(inputtype.equalsIgnoreCase("One Way")) 
		{
			WebElement 	oneway=driver.findElement(typeOneway_trip);
			oneway.click();
		}
		//String passanger_input= flightinput.get("passangers");
		WebElement passanger= driver.findElement(passanger_no);
		Select selectpassanger= new Select(passanger);
		selectpassanger.selectByVisibleText(flightinput.get("passangers"));

		WebElement depart_from=driver.findElement(Depature_from);
		Select fromcity= new Select(depart_from);
		fromcity.selectByVisibleText(flightinput.get("departfrom"));

		WebElement depart_onmonth= driver.findElement(depature_month);
		Select departmonth= new Select(depart_onmonth);
		departmonth.selectByVisibleText(flightinput.get("departmonth"));

		WebElement depart_onday= driver.findElement(depature_date);
		Select departday= new Select(depart_onday);
		departday.selectByVisibleText(flightinput.get("departday"));


		WebElement arrive_to=driver.findElement(arriving_in);
		Select arrivecity= new Select(arrive_to);
		arrivecity.selectByVisibleText("arrivecity");

		WebElement arrive_returnmonth=driver.findElement(returning_month);
		Select arrive_month= new Select(arrive_returnmonth);
		arrive_month.selectByVisibleText(flightinput.get("arrivingmonth"));

		WebElement arrive_returnday=driver.findElement(returning_month);
		Select arrive_day= new Select(arrive_returnday);
		arrive_day.selectByVisibleText(flightinput.get("arrivingday"));

	}
	public void preferences(String inputservice, String inputairline)
	{

		if(inputservice.equalsIgnoreCase("Economy class"))
		{
			WebElement preference_service = driver.findElement(serive_economy);
			preference_service.click();
		}
		else if(inputservice.equalsIgnoreCase("Business class"))
		{
			WebElement preference_service = driver.findElement(serive_business);
			preference_service.click();
		}
		else if(inputservice.equalsIgnoreCase("First class"))
		{
			WebElement preference_service = driver.findElement(serive_fistclass);
			preference_service.click();
		}
		WebElement preference_airline=driver.findElement(airline);
		Select select_airline=new Select(preference_airline);
		select_airline.selectByValue(inputairline);
		
	}
	public void continue_selectflight()
	{
		wait.until(ExpectedConditions.titleContains("Select a Flight: Mercury Tours"));
		wait.until(ExpectedConditions.textToBePresentInElementLocated(By.xpath("//td[@class='title']//font[text()='DEPART']"), "ASD"));//Deprecated
	}
}
