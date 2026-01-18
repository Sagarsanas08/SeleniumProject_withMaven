package bdd;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class orangehrmtesting {

	WebDriver d;
	String url="https://opensource-demo.orangehrmlive.com/web/index.php/auth/login";
	
	
	
	
	@Given("we are in login page")
	public void we_are_in_login_page() throws InterruptedException {
	    // Write code here that turns the phrase above into concrete actions
	  d=new ChromeDriver();
	  d.get(url);
	  Thread.sleep(8000);
	  d.manage().timeouts().implicitlyWait(Duration.ofMinutes(2));			
	}

	@When("we will enter the valid username in username field")
	public void we_will_enter_the_valid_username_in_username_field() throws InterruptedException {
	    // Write code here that turns the phrase above into concrete actions
	d.findElement(By.xpath("//input[@name='username']")).sendKeys("Admin");
	Thread.sleep(2000);
	}

	@And("we will enter the valid password in password field")
	public void we_will_enter_the_valid_password_in_password_field() throws InterruptedException {
	    // Write code here that turns the phrase above into concrete actions
	    d.findElement(By.xpath("//input[@type='password']")).sendKeys("admin123");
	    Thread.sleep(2000);
	}

	@Then("we will click on login butoon")
	public void we_will_click_on_login_butoon() throws InterruptedException {
	    // Write code here that turns the phrase above into concrete actions
	    d.findElement(By.xpath("//button[@type='submit']")).click();
	    Thread.sleep(2000);
	}

	@When("we will mousehover on admin option")
	public void we_will_mousehover_on_admin_option() throws InterruptedException {
	    // Write code here that turns the phrase above into concrete actions
	    new Actions(d).moveToElement(d.findElement(By.xpath("//a[contains(.,'Admin')]"))).perform();
	Thread.sleep(2000);
	}

	@And("we will mousehover on PIM option")
	public void we_will_mousehover_on_pim_option() throws InterruptedException {
	    // Write code here that turns the phrase above into concrete actions
	   new Actions(d).moveToElement(d.findElement(By.xpath("//a[contains(.,'PIM')]"))).perform();
	Thread.sleep(2000);
	}

	@When("we will mousehover on Leave option")
	public void we_will_mousehover_on_leave_option() throws InterruptedException {
	    // Write code here that turns the phrase above into concrete actions
	    new Actions(d).moveToElement(d.findElement(By.xpath("//span[contains(.,'Leave')]"))).perform();
	    Thread.sleep(2000);
	    
	}

	@And("we will mousehover on Time option")
	public void we_will_mousehover_on_time_option() throws InterruptedException {
	    // Write code here that turns the phrase above into concrete actions
	    new Actions(d).moveToElement(d.findElement(By.xpath("//a[contains(.,'Time')]"))).perform();
	    Thread.sleep(2000);
	}

	@Then("we will mousehover on Recruitment option")
	public void we_will_mousehover_on_recruitment_option() throws InterruptedException {
	    // Write code here that
		new Actions(d).moveToElement(d.findElement(By.xpath("//span[contains(.,'Recruitment')]"))).perform();
	    Thread.sleep(2000);
	}

	@When("we will navigate to PIM option and click on the add button")
	public void we_will_navigate_to_pim_option_and_click_on_the_add_button() throws InterruptedException {
	    // Write code here that turns the phrase above into concrete actions
	    d.findElement(By.xpath("//a[contains(.,'PIM')]")).click();
	    Thread.sleep(2000);
	    d.findElement(By.xpath("//a[contains(.,'Add Employee')]")).click();
	}

	@And("<we will enter (.*) in the firstname field$")
	public void we_will_enter_sam_in_the_firstname_field(String fname) throws InterruptedException {
	    // Write code here that turns the phrase above into concrete actions
	    d.findElement(By.xpath("//input[@name='firstName']")).sendKeys(fname);
	    Thread.sleep(2000)
	    ;
	}

	@When("<we will enter (.*) in the middletname field$")
	public void we_will_enter_abc_in_the_middletname_field(String mname) throws InterruptedException {
	    // Write code here that turns the phrase above into concrete actions
	   d.findElement(By.xpath("//input[@name='middleName']")).sendKeys(mname);
	   Thread.sleep(2000);
	}

	@And("<we will enter (.*) in the lastname field$")
	public void we_will_enter_xyz_in_the_lastname_field(String lname) throws InterruptedException {
	    // Write code here that turns the phrase above into concrete actions
	   d.findElement(By.xpath("//input[@name='lastName']")).sendKeys(lname);
	   Thread.sleep(2000);
	}

	@Then("we will click on save button")
	public void we_will_click_on_save_button() throws InterruptedException {
	    // Write code here that turns the phrase above into concrete actions
	   d.findElement(By.xpath("//button[@type='submit']")).click();
	
		
		d.findElement(By.xpath("//a[contains(.,'PIM')]")).click(); //PIM BUTTON
	    Thread.sleep(2000);
	    d.findElement(By.xpath("//a[contains(.,'Add Employee')]")).click(); //ADD BUTTON
	}



	
	
	
}
