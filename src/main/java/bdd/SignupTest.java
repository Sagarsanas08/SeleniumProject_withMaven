package bdd;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class SignupTest {

	
	WebDriver d;
	String url="https://www.facebook.com/r.php?entry_point=login";
	
		
	
	@Given("user is on signup page of facebook")
	public void user_is_on_signup_page_of_facebook() throws InterruptedException {
	    // Write code here that turns the phrase above into concrete actions
		d=new ChromeDriver();
		d.get(url);
		Thread.sleep(2000);	
		
	}

	@When("user will enter firstname in firstname field")
	public void user_will_enter_firstname_in_firstname_field() throws InterruptedException {
	    // Write code here that turns the phrase above into concrete actions
	   d.findElement(By.xpath("//input[@name='firstname']")).sendKeys("abc");
	   Thread.sleep(2000);
	   
		
	}

	@And("user will enter surname in surtname field")
	public void user_will_enter_surname_in_surtname_field() throws InterruptedException {
	    // Write code here that turns the phrase above into concrete actions
d.findElement(By.xpath("//input[@name='lastname']")).sendKeys("xyz");
Thread.sleep(2000);

		
		
	}

	@When("user will select date of birth in date of birth of field")
	public void user_will_select_date_of_birth_in_date_of_birth_of_field() throws InterruptedException {
	    // Write code here that turns the phrase above into concrete actions
	  new Select(d.findElement(By.xpath("//select[@title='Day']"))).selectByVisibleText("12");
	  Thread.sleep(2000);
	  new Select(d.findElement(By.xpath("//select[@title='Month']"))).selectByVisibleText("Nov");
	  Thread.sleep(2000);
	  new Select(d.findElement(By.xpath("//select[@title='Year']"))).selectByVisibleText("2012");
	  Thread.sleep(2000);
	}

	@And("user will select Gender in Gender field")
	public void user_will_select_gender_in_gender_field() throws InterruptedException {
	    // Write code here that turns the phrase above into concrete actions
	  d.findElement(By.xpath("//input[@value='2']")).click();
	  Thread.sleep(2000);
	}

	@When("user will enter mobile number or email address  in mobile number or email address field")
	public void user_will_enter_mobile_number_or_email_address_in_mobile_number_or_email_address_field() throws InterruptedException {
	    // Write code here that turns the phrase above into concrete actions
	    d.findElement(By.xpath("//input[@name='reg_email__']")).sendKeys("1234567890");
	    Thread.sleep(2000);
	    
	}

	@And("use will enter new password in new password field")
	public void use_will_enter_new_password_in_new_password_field() throws InterruptedException {
	    // Write code here that turns the phrase above into concrete actions
	    d.findElement(By.xpath("//input[@type='password']")).sendKeys("123");
	    Thread.sleep(2000);
	    
	}	

	@Then("user will click on Sign Up button")
	public void user_will_click_on_sign_up_button() throws InterruptedException {
	    // Write code here that turns the phrase above into concrete actions
	    d.findElement(By.xpath("//button[@name='websubmit']")).click();
	    Thread.sleep(2000);
	}


	
	
	
	
	
	
	
	
	
}
