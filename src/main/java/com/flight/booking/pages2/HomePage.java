package com.flight.booking.pages2;

import java.util.List;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindAll;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.FindBys;

public class HomePage {
	
	@FindBy(linkText="Home")
	private WebElement linkHome;
	
	@FindBys(
			@FindBy(xpath="//li[contains(@class,'level1')]/a[text()='About']/..//li[contains(@class,'level2') and not(contains(@class,'invi'))]/a")
			)
	private List<WebElement> aboutMenuSubItems;
	
	@FindBys(
			@FindBy(xpath="//li[contains(@class,'level1')]/a[text()='Contact']/..//li[contains(@class,'level2') and not(contains(@class,'invi'))]/a")
			)
	private List<WebElement> contactMenuSubItems;
	
	@FindBys(
			@FindBy(xpath="//li[contains(@class,'level1')]/a[text()='Industries']/..//li[contains(@class,'level2') and not(contains(@class,'invi'))]/a")
			)
	private List<WebElement> industriesMenuSubItems;
	
	@FindBys(
			@FindBy(xpath="//li[contains(@class,'level1')]/a[text()='News']/..//li[contains(@class,'level2') and not(contains(@class,'invi'))]/a")
			)
	private List<WebElement> newsMenuSubItems;
	
	@FindBys(
			@FindBy(xpath="//li[contains(@class,'level1')]/a[text()='Campaigns']/..//li[contains(@class,'level2') and not(contains(@class,'invi'))]/a")
			)
	private List<WebElement> campMenuSubItems;
	
	@FindBys(
			@FindBy(xpath="//li[contains(@class,'level1')]/a[text()='Resources']/..//li[contains(@class,'level2') and not(contains(@class,'invi'))]/a")
			)
	private List<WebElement> resMenuSubItems;
	
	@FindAll(
			{
				@FindBy(xpath="//li[contains(@class,'level1')]/a[text()='About']/..//li[contains(@class,'level2') and not(contains(@class,'invi'))]/a"),
				@FindBy(xpath="//li[contains(@class,'level1')]/a[text()='Contact']/..//li[contains(@class,'level2') and not(contains(@class,'invi'))]/a"),
				@FindBy(xpath="//li[contains(@class,'level1')]/a[text()='Industries']/..//li[contains(@class,'level2') and not(contains(@class,'invi'))]/a"),
				@FindBy(xpath="//li[contains(@class,'level1')]/a[text()='News']/..//li[contains(@class,'level2') and not(contains(@class,'invi'))]/a"),
				@FindBy(xpath="//li[contains(@class,'level1')]/a[text()='Campaigns']/..//li[contains(@class,'level2') and not(contains(@class,'invi'))]/a"),
				@FindBy(xpath="//li[contains(@class,'level1')]/a[text()='Resources']/..//li[contains(@class,'level2') and not(contains(@class,'invi'))]/a"),
			}
			)
	private List<WebElement> allMenuSubItems1;
	
	
	public void goToHome() {
		linkHome.click();
	}

	
	public void verifySubMenuCount(String menuName, int expectedCount) throws Exception {
		int actualCount = 0;
		
		if(menuName.equalsIgnoreCase("About")) {
			actualCount = aboutMenuSubItems.size();
		}else if(menuName.equalsIgnoreCase("Contact")) {
			actualCount = contactMenuSubItems.size();
		}else if(menuName.equalsIgnoreCase("Industries")) {
			actualCount = industriesMenuSubItems.size();
		}else if(menuName.equalsIgnoreCase("News")) {
			actualCount = newsMenuSubItems.size();
		}else if(menuName.equalsIgnoreCase("Campaigns")) {
			actualCount = campMenuSubItems.size();
		}else if(menuName.equalsIgnoreCase("Resources")) {
			actualCount = resMenuSubItems.size();
		}else {
			throw new Exception("Invalid Menu Name - " + menuName);
		}
		
		
		if(expectedCount != actualCount)
			throw new Exception("Sub menu items count not matching, expected : " + expectedCount + ", Actual: " + actualCount);
	}
	
	
	public void findSubMenu(String parentMenu, String childMenu) throws Exception {
		// Find the target menu to work with
		List<WebElement> subMenu = null;
		if(parentMenu.equalsIgnoreCase("About")) {
			subMenu = aboutMenuSubItems;
		}else if(parentMenu.equalsIgnoreCase("Contact")) {
			subMenu = contactMenuSubItems;
		}else if(parentMenu.equalsIgnoreCase("Industries")) {
			subMenu = industriesMenuSubItems;
		}else if(parentMenu.equalsIgnoreCase("News")) {
			subMenu = newsMenuSubItems;
		}else if(parentMenu.equalsIgnoreCase("Campaigns")) {
			subMenu = campMenuSubItems;
		}else if(parentMenu.equalsIgnoreCase("Resources")) {
			subMenu = resMenuSubItems;
		}else {
			throw new Exception("Invalid Menu Name - " + parentMenu);
		}
		
		// Iterate each sub menu in the list to find
		boolean isFound = false;
		for(WebElement subMenuItem : subMenu) {
			String name = subMenuItem.getText();
			
			if(name != null && name.equalsIgnoreCase(childMenu)) {
				isFound = true;
				break;
			}
		}
		
		if(isFound == false) {
			throw new Exception("Could not find the sub menu item.");
		}
		
	}
}
