package TestCases;

import org.openqa.selenium.WebDriver;

import com.flight.booking.pages.FlightLogin;
import com.flight.booking.utilities.DriverSupplier;

public class Login_TC1 {

	public static void main(String[] args) {
		DriverSupplier supplier=new DriverSupplier();
		WebDriver driver=supplier.getdriver();
		FlightLogin login=new FlightLogin(driver);
		login.login("dineshkumartest", "dineshtest");
	}
}
