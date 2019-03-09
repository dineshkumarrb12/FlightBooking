package com.flight.booking.pages;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class FlightLogin {

	private By login_name= By.name("userName");
	public By login_password= By.name("password");
	WebDriver driver;
	WebDriverWait wait;
	public FlightLogin(WebDriver driver)
	{
		this.driver=driver;
		this.wait=new WebDriverWait(driver,600); //10 mins
	}
	
	public void login(String username, String password)
	{
		wait.until(ExpectedConditions.titleContains("Welcome: Mercury Tours"));
		wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath("//input[@name='login']")));
		WebElement login_username=driver.findElement(login_name);
		login_username.sendKeys(username);
		WebElement login_userpassword=driver.findElement(login_password);
		login_userpassword.sendKeys(password);
		WebElement signin= driver.findElement(By.name("login"));
		signin.click();
	}
}
