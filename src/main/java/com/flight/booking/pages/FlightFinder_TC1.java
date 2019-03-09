package com.flight.booking.pages;

import java.util.HashMap;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import com.flight.booking.pages.FlightFinder;
import com.flight.booking.pages.FlightLogin;


public class FlightFinder_TC1 {
	

FlightFinder_TC1()
		{
			WebDriver driver=null;
			String path=null;
			path=System.getProperty("user.dir");
			path= path + "/src/test/sources/chromedriver.exe";
			System.out.println(""+path);
			System.setProperty("webdriver.chrome.driver",path);
			driver=new ChromeDriver();
			driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
			driver.get("http://newtours.demoaut.com/mercuryreservation.php");

			driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

			WebDriverWait wait=new WebDriverWait(driver,600); //10 mins
			wait.until(ExpectedConditions.titleContains("Welcome: Mercury Tours"));
			wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath("//input[@name='login']")));
			FlightLogin login=new FlightLogin(driver);
			login.login("dineshkumartest", "dineshtest");



			FlightFinder flightdetails=new FlightFinder(driver);

			HashMap<String,String> flightinput= new HashMap<String,String>();
			flightinput.put("Type", "One Way");
			flightinput.put("passangers", "3");
			flightinput.put("departfrom","London");
			flightinput.put("departmonth", "March");
			flightinput.put("departday", "12");
			flightinput.put("arrivingto", "Paris");
			flightinput.put("arrivingmonth", "February");
			flightinput.put("arrivingday", "27");
			flightdetails.flight_details(flightinput);

			flightdetails.preferences("Business class","Unified Airlines");
			flightdetails.continue_selectflight();
		}		
	}

