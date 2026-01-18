package TestNGBasic;

import org.testng.annotations.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.DataProvider;

public class DataProviderTest {
	
	
	WebDriver d;
	String url="https://marriageking.com/";
	
	
	
	
	
  @Test(dataProvider = "dp")
  public void LoginFormTest(String username, String password) throws InterruptedException {
	  
	  d.findElement(By.xpath("//a[@id='open-login-modal']")).click();
	  Thread
	  .sleep(2000);
	  d.findElement(By.xpath("//input[@id='username']")).sendKeys(username);
	  Thread.sleep(2000);
	  d.findElement(By.xpath("//input[@id='userpassword']")).sendKeys(password);
	  Thread.sleep(2000);
	  d.findElement(By.xpath("//input[@value='Login']")).click();
	  Thread.sleep(2000);
	  
	  d.navigate().refresh();  
	  
	  
	  
  }

  @BeforeMethod
  public void Setup() throws InterruptedException {
	  d=new ChromeDriver();
	  d.get(url);
	  Thread.sleep(5000);
	  d.manage().window().fullscreen();
  }
  
  
  
  @DataProvider
  public Object[][] dp() {
   
    Object[][] obj=new Object[3][2];
//                            [no of users][no of inputs]
//0th set 
    
    obj[0][0]="abcd@gmail.com";
    obj[0][1]="12345";
    
  //1st set 
	  obj[1][0]="#%^&";
	  obj[1][1]="83838";
    
	  //2nd set
	  obj[2][0]="Admin@gmail.com";
	  obj[2][1]="abcd@1234";
	  
    
    return obj;
  }
}
