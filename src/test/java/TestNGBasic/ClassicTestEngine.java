package TestNGBasic;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;

import java.awt.Desktop.Action;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.AfterSuite;

public class ClassicTestEngine {
 
	/*
	 TestNG is a base framework 
	 NG means Next Generation 
	 TestNG does not have java main method 
	 TestNG has its own main method 
	 
	 @Test
	 public void f()
	 {
	 
	 }
	 
	 Annotations are the term used to control flow of executions of methods
	 Annotations has its dependency with method 
	 
	 TestNG is used for cross browser testing - Regression test
	 TestNG is used for testing scenarios parallel 
	 TestNG is used for testing valid and invalid inputs for login, signup 
	 TestNG is also used for SEO Testing (Imp) - 200 
	 
	 TestNG are of 2 types:-
	 1.Classic Testng
	 2.Advanced Testng 
	 
	 */

  
 WebDriver d;
 String url="https://marriageking.com/";
  
 @Test
 public void f() {
	  System.out.println("main method");
 }
  
  @BeforeMethod
  public void MouseHoverAutomate() throws InterruptedException {
	  System.out.println("Before Method");
	  
	 Actions a=new Actions(d);
	  
	  WebElement login=d.findElement(By.xpath("//a[@id='open-login-modal']"));
	  a.moveToElement(login).perform();
	  Thread.sleep(2000);
	  
	  a.moveToElement(d.findElement(By.xpath("(//a[@title='Register Free'])[1]"))).perform();
     Thread.sleep(2000);
     
     d.manage().window().fullscreen();
	  
  }
  
  

  @AfterMethod
  public void afterMethod() {
	  System.out.println("after method");
  }

  
  @BeforeClass
  public void SignupFormAutomate() throws InterruptedException {
	  System.out.println("Before class");
	  
	  WebElement gender=d.findElement(By.xpath("//select[@id='register-gender']"));
	  Select s1=new Select(gender);
	  s1.selectByVisibleText("Male");
	  
	 // new Select(d.findElement(By.xpath(""))).selectByVisibleText("Male");
	  d.findElement(By.xpath("//input[@id='reg-fname']")).sendKeys("Abcd");
	  Thread.sleep(2000);
	  
	 d.findElement(By.xpath("//input[@id='reg-lname']")).sendKeys("xyz");
	 Thread.sleep(2000);
	 
	 
	  
	  
	  
  }
  

  @AfterClass
  public void afterClass() {
	  System.out.println("after class");
  }

  @BeforeTest
  public void LoginFormAutomate() throws InterruptedException {
	  System.out.println("Before Test");
	  
	  d.findElement(By.xpath("//a[@id='open-login-modal']")).click();
	  Thread.sleep(2000);
	  d.findElement(By.xpath("//input[@id='username']")).sendKeys("abcd");
	  Thread.sleep(2000);
	  d.findElement(By.xpath("//input[@id='userpassword']")).sendKeys("12344");
	  Thread.sleep(2000);
	  d.findElement(By.xpath("//input[@value='Login']")).click();
	  Thread.sleep(2000);
	  
	  d.navigate().refresh();
	  
	 // d.navigate().back();
	 // d.navigate().forward();
	  
	  
	  
  }
  @AfterTest
  public void afterTest() {
	  System.out.println("after test");
  }

  @BeforeSuite
  public void setup() throws InterruptedException {
	  d=new ChromeDriver();
	  d.get(url);
	//  d.manage().window().maximize();
		  d.manage().window().fullscreen();
	  Thread.sleep(2000);
	  }

  @AfterSuite
  public void afterSuite() {
	  System.out.println("after suite");
  }

}
