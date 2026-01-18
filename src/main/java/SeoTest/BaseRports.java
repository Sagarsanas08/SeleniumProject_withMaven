package SeoTest;

import java.time.Duration;

import org.apache.xmlbeans.impl.values.XmlDurationImpl;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.ITestResult;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.Status;
import com.aventstack.extentreports.markuputils.ExtentColor;
import com.aventstack.extentreports.markuputils.MarkupHelper;
import com.aventstack.extentreports.reporter.ExtentHtmlReporter;
import com.aventstack.extentreports.reporter.configuration.Theme;

public class BaseRports {
	
	
	ExtentHtmlReporter ht;
	//it is used to store reports in report folder 
		//it is predefined class from com.aventstack package
		
		ExtentReports ex;
		//it is used to generate report
		//it is predefined class from com.aventstack package
		
		ExtentTest et;
		//it is used to give label, font color 
		//it is predefined class from com.aventstack package
		
	
	WebDriver d;
	String homeurl="https://www.facebook.com/";
	
	
	@BeforeSuite 
	public void Setup()
	{
		d=new FirefoxDriver();
		d.get(homeurl);
		d.manage().timeouts().implicitlyWait(Duration.ofMinutes(2));
		
		ht=new ExtentHtmlReporter("./Reports/seoreports.html");
		
		ex=new ExtentReports();
		
		ex.attachReporter(ht);  //connecting ExtentReports with ExtentHtmlReporter
		
		
		ex.setSystemInfo("Operating System", "Windows 10");
		ex.setSystemInfo("Browser Name", "Chrome");
		ex.setSystemInfo("Host", "Realtime");
		ex.setSystemInfo("QA", "Kshitij");
		
		ht.config().setReportName("SEO TEST REPORTS");
		ht.config().setTheme(Theme.DARK);
	}
	
	@BeforeMethod
	public void setValidation_For_Reports(ITestResult it)
	{
		//PASS - GREEN COLOR - TEST CASE PASS
		//FAIL - RED COLOR - TEST CASE FAIL 
		
		if(it.getStatus()==ITestResult.SUCCESS)
		{
			//MarkupHelper is predefined class 
			//it is used to create label
		et.log(Status.PASS, MarkupHelper.createLabel("Test Case Pass", ExtentColor.GREEN));	
		et.fail(it.getThrowable()); //getThrowable is the predefined method ITest Result
		// it is used to handle external exceptions or errors while generating reports
		}
		
		else if(it.getStatus()==ITestResult.FAILURE)
		{
			et.log(Status.FAIL, MarkupHelper.createLabel("Test Case Fail", ExtentColor.RED));	
		}
		
	}
	
	
	@AfterSuite
	public void TearDown()
	{
		ex.flush();
		//it is used to close reports
	}
	
	
	
	
	
}

		
		
		
	
	
	
	
	


