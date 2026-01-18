package keyword_driven;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class ActionKeyword {
	
	//Keyword Driven 
	
	
	public static WebDriver d;
	
	public static void openBrowser(String browser)
	{
		if(browser.equalsIgnoreCase("chrome"))
		{
			d=new ChromeDriver();
		}
		else if(browser.equalsIgnoreCase("firefox"))
		{
			d=new FirefoxDriver();
		}
		else if(browser.equalsIgnoreCase("edge"))
		{
			d=new EdgeDriver();
		}
	}

	
	public static void getURL(String homeurl) throws InterruptedException
	{
		d.get(homeurl);
		Thread.sleep(2000);
		
	}
	
	
	 //                                  xpath              //a[@id=              
	public static By getLocator(String locatortype, String locatorvalue) throws Exception
	{
		
	return	switch(locatortype)
		{
		case "id" -> By.id(locatorvalue);
		case "className" -> By.className(locatorvalue);
		case "xpath" -> By.xpath(locatorvalue);
		case "linktext" -> By.linkText(locatorvalue);
		case "cssselector" -> By.cssSelector(locatorvalue);
		default -> throw new Exception("You selected wrong option");
		
		};	
	}
	
	
	
	public static void EnterText(String locatorType, String locatorValue, String text) throws Exception
	{
		d.findElement(getLocator(locatorType, locatorValue)).sendKeys(text);
	}
	
	public static void onClick(String locatortype, String locatorValue) throws Exception
	{
		d.findElement(getLocator(locatortype, locatorValue)).click();
	}
	
	
	
	
	
}
