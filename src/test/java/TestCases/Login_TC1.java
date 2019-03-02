package TestCases;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import Login.FlightLogin;

public class Login_TC1 {

	Login_TC1() {
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
		
	}
}
