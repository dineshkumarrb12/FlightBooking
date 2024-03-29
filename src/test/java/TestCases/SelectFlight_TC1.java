package TestCases;

import java.util.HashMap;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import com.flight.booking.factory.FlightLoginPF;
import com.flight.booking.pages.FlightFinder;
import com.flight.booking.pages.SelectFlight;


public class SelectFlight_TC1 {
	public static void main(String[] args) {
		
	
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
	
	FlightLoginPF login=new FlightLoginPF(driver);
	
	//login page
	login.login("dineshkumartest", "dineshtest");
	
	FlightFinder flight=new FlightFinder(driver);
	HashMap<String,String> flightinput= new HashMap<String,String>();
	flightinput.put("Type", "One Way");
	flightinput.put("passangers", "3");
	flightinput.put("departfrom","London");
	flightinput.put("departmonth", "March");
	flightinput.put("departday", "12");
	flightinput.put("arrivingto", "Paris");
	flightinput.put("arrivingmonth", "February");
	flightinput.put("arrivingday", "27");
	
	
	

		
	//select flight page
	SelectFlight flight1=new SelectFlight(driver);
	flight1.select_flight("Unified Airlines 363", "Pangea Airlines 632");
	flight1.book_flight_continue();
}
}