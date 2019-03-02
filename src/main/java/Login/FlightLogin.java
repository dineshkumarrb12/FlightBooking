package Login;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class FlightLogin {

	public By login_name= By.name("userName");
	public By login_password= By.name("password");
	WebDriver driver;
	public FlightLogin(WebDriver driver)
	{
		this.driver=driver;
	}
	public void login(String username, String password)
	{
		
		WebElement login_username=driver.findElement(login_name);
		login_username.sendKeys(username);
		WebElement login_userpassword=driver.findElement(login_password);
		login_userpassword.sendKeys(password);
		WebElement signin= driver.findElement(By.name("login"));
		signin.click();
	}
}
