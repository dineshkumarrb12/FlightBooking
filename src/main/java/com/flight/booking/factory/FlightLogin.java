package com.flight.booking.factory;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class FlightLogin {
	@FindBy(name="userName") //Locator
	private WebElement txtUserName; //Declaration
	@FindBy(name="password")
	private WebElement txtPassword;
	@FindBy(name="login")
	private WebElement btnLogin;
	
	//css locator --> fastest (best option)
	// id
	// name 
	//xpath locator --> slowest (last option)
	
	private WebDriver driver;
	private WebDriverWait wait;
	
	public FlightLogin(WebDriver driver) {
		this.driver = driver;
		this.wait = new WebDriverWait(driver, 5);
	}
	
	public void login(String username, String password) {
		//wait
		wait.until(ExpectedConditions.titleContains("Welcome: Mercury Tours"));
		wait.until(ExpectedConditions.visibilityOf(btnLogin));
		
		txtUserName.sendKeys(username); //Lazy Initialization
		txtPassword.sendKeys(password);
		btnLogin.click();
		
		WebElement profileLink = driver.findElement(By.linkText("Welcome, " + username));
		profileLink.click();
		
	}
}
