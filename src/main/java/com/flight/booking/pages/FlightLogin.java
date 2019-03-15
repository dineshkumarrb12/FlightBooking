package com.flight.booking.pages;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
public class FlightLogin
{
	//Locators
	private By txtUserName= By.name("userName");
	public By txtPassword= By.name("password");
	public By btnSignIn = By.name("login");
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
		WebElement login_username=driver.findElement(txtUserName); //Webelement
		login_username.sendKeys(username);
		WebElement login_userpassword=driver.findElement(txtPassword);
		login_userpassword.sendKeys(password);
		WebElement signin= driver.findElement(btnSignIn);
		signin.click();
	}
}