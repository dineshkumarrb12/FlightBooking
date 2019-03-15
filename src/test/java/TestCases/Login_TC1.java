package TestCases;

import org.openqa.selenium.WebDriver;

import com.flight.booking.factory.FlightLoginPF;
import com.flight.booking.utilities.DriverSupplier;

public class Login_TC1 {

	public static void main(String[] args) {
		DriverSupplier supplier=new DriverSupplier();
		WebDriver driver=supplier.getdriver();
		FlightLoginPF logins=new FlightLoginPF(driver);
		logins.login("dineshkumartest", "dineshtest");
	}
}
