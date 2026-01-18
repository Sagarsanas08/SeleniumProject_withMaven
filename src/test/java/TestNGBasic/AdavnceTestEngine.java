package TestNGBasic;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.Test;

public class AdavnceTestEngine {

	
	WebDriver d;
	String url="https://marriageking.com/";
	
	@Test (priority = 1)
	public void Setup() throws InterruptedException
	{
		 d=new ChromeDriver();
		  d.get(url);
		//  d.manage().window().maximize();
		  d.manage().window().fullscreen();
		  Thread.sleep(5000);
	}
	
	@Test (priority  = 2, invocationCount = 4)
	public void LoginFormAutomate() throws InterruptedException
	{
		d.findElement(By.xpath("//a[@id='open-login-modal']")).click();
		  Thread.sleep(2000);
		  d.findElement(By.xpath("//input[@id='username']")).sendKeys("abcd");
		  Thread.sleep(2000);
		  d.findElement(By.xpath("//input[@id='userpassword']")).sendKeys("12344");
		  Thread.sleep(2000);
		  d.findElement(By.xpath("//input[@value='Login']")).click();
		  Thread.sleep(2000);
		  
		  d.navigate().refresh();
		  d.manage().window().fullscreen();
	}
	
	@Test (priority = 4)
	public void SignupformAutomate() throws InterruptedException
	{
		 WebElement gender=d.findElement(By.xpath("//select[@id='register-gender']"));
		  Select s1=new Select(gender);
		  s1.selectByVisibleText("Male");
		  
		 // new Select(d.findElement(By.xpath(""))).selectByVisibleText("Male");
		  d.findElement(By.xpath("//input[@id='reg-fname']")).sendKeys("Abcd");
		  Thread.sleep(2000);
		  
		 d.findElement(By.xpath("//input[@id='reg-lname']")).sendKeys("xyz");
		 Thread.sleep(2000);	
	}
	
	@Test (priority = 3)
	public void MouseHoverAutomate() throws InterruptedException
	{
		Actions a=new Actions(d);
		  
		  WebElement login=d.findElement(By.xpath("//a[@id='open-login-modal']"));
		  a.moveToElement(login).perform();
		  Thread.sleep(2000);
		  
		  a.moveToElement(d.findElement(By.xpath("(//a[@title='Register Free'])[1]"))).perform();
	     Thread.sleep(2000);	  
	}
}

	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
