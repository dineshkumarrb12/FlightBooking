package com.flight.booking.factory;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class FlightLoginPF {
	@FindBy(name="userName") //Locator
	 WebElement txtUserName; //Declaration
	@FindBy(name="password")
	 WebElement txtPassword;
	@FindBy(name="login")
	 WebElement btnLogin;
	
	//css locator --> fastest (best option)
	// id
	// name 
	//xpath locator --> slowest (last option)
	
	private WebDriver driver;
	private WebDriverWait wait;
	
	public FlightLoginPF(WebDriver driver) {
		this.driver = driver;
		this.wait = new WebDriverWait(driver, 5);
	}
	public void login(String username, String password) {
		//wait
		wait.until(ExpectedConditions.titleContains("Welcome: Mercury Tours"));
		wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath("//input[@name='login']")));
		System.out.println("login method started");
		System.out.println("username    "+username);
		System.out.println("password\n    "+password);
		txtUserName.sendKeys(username); //Lazy Initialization
		txtPassword.sendKeys(password);
		btnLogin.click();
		WebElement profileLink = driver.findElement(By.linkText("Welcome, " + username));
		profileLink.click();
		
	}
}