package SeoTest;

import java.io.IOException;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.Iterator;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

import com.aventstack.extentreports.Status;

public class seotest extends BaseRports {
	
	
	//Selenium script with Advanced TestNG 
	
	@Test (priority=1)
	public void Test1() throws MalformedURLException, IOException
	{
		et=ex.createTest("Testing broken & Valid Links");
		
		HttpURLConnection htp=null;
		//HttpURLConnection is predefined class from java.net package 
		//it is used to generate response code 
		String testurl="";
		
		List<WebElement> sel=d.findElements(By.tagName("a"));
		//a stands for anchor tag 
		//List is predefined Interface from java.util package 
		//it is used to store ALL the URLs of website 
	
		Iterator<WebElement> iter=sel.iterator();
		//Iterator is predefined Interface from java.util package 
		//hasNext() is predefined method of Iterator
		//it is used to check whether Iterator has values (URL) or not
		while(iter.hasNext())
		{
		  testurl=iter.next().getAttribute("href");
		  
		  //Anchor tag is specified or not 
		  if(testurl==null || testurl.isEmpty())
		  {
			  et.log(Status.FAIL, testurl+" anchor tag is not specified");
			  continue;
		  }
		  
		  //domain test
		  //! is called NOT 
		  
		  if(!testurl.startsWith(homeurl))
		  {
			  et.log(Status.FAIL, testurl+" domain is incorrect");
		  }
		  
		  //broken valid links test 
		  
		  htp=(HttpURLConnection)(new URL(testurl)).openConnection();
		  //casting 		  
		  
		  htp.setRequestMethod("HEAD");
		  htp.connect();
		  int res= htp.getResponseCode();
		  
		  
		  if(res>=400)
		  {
			  et.log(Status.FAIL, testurl+" is broken link");
		  }
		  else
		  {
			  et.log(Status.PASS, testurl+" is valid link");
		  }
		  
		  
		  
		  
		  
		  
		  
		  
		 
			
			
		}
		
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
