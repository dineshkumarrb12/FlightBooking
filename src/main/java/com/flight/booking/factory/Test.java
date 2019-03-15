package com.flight.booking.factory;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;

import com.flight.booking.utilities.DriverSupplier;

public class Test {
	
	public static void main(String[] args) {
		DriverSupplier supplier = new DriverSupplier();
		WebDriver driver = supplier.getdriver();
		//Page Initialization using Page Factory
		FlightLoginPF login = PageFactory.initElements(driver, FlightLoginPF.class);
		//login.login("dineshkumartest", "dineshtest");
		login.login("bhuvanesh", "dineshtest");
	}

}
