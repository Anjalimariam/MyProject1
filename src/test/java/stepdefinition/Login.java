package stepdefinition;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import junit.framework.Assert;

public class Login 
{
	WebDriver driver;
	@Given("User must be on homepage by clicking url {string}")
	public void user_must_be_on_homepage_by_clicking_url(String string) {
	    // Write code here that turns the phrase above into concrete actions
	    //throw new io.cucumber.java.PendingException();
		System.setProperty("webdriver.gecko.driver", "geckodriver.exe");
	   driver=new FirefoxDriver();
	    driver.get(string);
	
	
	}

	@When("^Enter valid (.*) and (.*)$")
	public void enter_valid_username_and_password(String username, String password) throws InterruptedException {
	    // Write code here that turns the phrase above into concrete actions
	    //throw new io.cucumber.java.PendingException();
		
		driver.findElement(By.id("username")).sendKeys(username);
		driver.findElement(By.id("password")).sendKeys(password);
		Thread.sleep(3000);
		
	}

	@When("Click on Signin button")
	public void click_on_signin_button() {
	    // Write code here that turns the phrase above into concrete actions
	    //throw new io.cucumber.java.PendingException();
		driver.findElement(By.id("log-in")).click();
	}

	@Then("User must be navigated to his or her account")
	public void user_must_be_navigated_to_his_or_her_account() {
	    // Write code here that turns the phrase above into concrete actions
	   // throw new io.cucumber.java.PendingException();
String actualresult=driver.getCurrentUrl();
Assert.assertEquals("https://demo.applitools.com/app.html", actualresult);
		
		
		
	}
	
	
	
	
	
	
	
	
}
