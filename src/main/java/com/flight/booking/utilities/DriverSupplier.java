package com.flight.booking.utilities;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class DriverSupplier {
public WebDriver getdriver()
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
	return driver;
}
}
