package stepdef;



import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import junit.framework.Assert;

public class Stepdefinition {
WebDriver driver;

@Given("User must be on homepage by clicking on url  {string}")
public void user_must_be_on_homepage_by_clicking_on_url(String string) {
    // Write code here that turns the phrase above into concrete actions
   // throw new io.cucumber.java.PendingException();
    System.setProperty("webdriver.gecko.driver", "geckodriver.exe");
    driver=new FirefoxDriver();
    driver.get(string);
}

@When("user clicks on signup button")
public void user_clicks_on_signup_button() {
    // Write code here that turns the phrase above into concrete actions
    //throw new io.cucumber.java.PendingException();
    driver.findElement(By.id("signin2")).click();
}

@Then("Signup dialog box should be displayed")
public void signup_dialog_box_should_be_displayed() {
    // Write code here that turns the phrase above into concrete actions
    //throw new io.cucumber.java.PendingException();
	boolean actual=driver.findElement(By.cssSelector("#signInModal > div > div > div.modal-header")).isDisplayed();
Assert.assertEquals(true, actual);
}	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
