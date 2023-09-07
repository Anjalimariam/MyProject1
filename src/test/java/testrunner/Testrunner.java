package testrunner;

import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
//@CucumberOptions(features="C:\\Users\\dmathew\\eclipse-workspace\\Cucumber\\src\\test\\java\\feature1",glue= {"stepdefinition"},plugin= {"pretty","html:target/HTmlreports.html"},monochrome=true)
//@CucumberOptions(features="C:\\Users\\dmathew\\eclipse-workspace\\Cucumber\\src\\test\\java\\feature1",glue= {"stepdefinition"},plugin= {"pretty","json:target/HTmlreports.json"},monochrome=true)
//@CucumberOptions(features="C:\\Users\\dmathew\\eclipse-workspace\\Cucumber\\src\\test\\java\\feature1",glue= {"stepdefinition"},plugin= {"pretty","json:target/HTmlreports.json"},monochrome=true, dryRun=true)


//@CucumberOptions(features="C:\\Users\\dmathew\\eclipse-workspace\\Cucumber\\src\\test\\java\\feature1\\RememberMe.feature",glue= {"stepdefinition"},plugin= {"pretty","json:target/HTmlreports.json"},monochrome=true, dryRun=true,tags="@smoke")

//@CucumberOptions(features="C:\\Users\\dmathew\\eclipse-workspace\\Cucumber\\src\\test\\java\\feature1\\RememberMe.feature",glue= {"stepdefinition"},plugin= {"pretty","json:target/HTmlreports.json"},monochrome=true, dryRun=true,tags="@regression")
//@CucumberOptions(features="C:\\Users\\dmathew\\eclipse-workspace\\Cucumber\\src\\test\\java\\feature1\\RememberMe.feature",glue= {"stepdefinition"},plugin= {"pretty","json:target/HTmlreports.json"},monochrome=true, dryRun=true,tags="@regression and @smoke")
//@CucumberOptions(features="C:\\Users\\dmathew\\eclipse-workspace\\Cucumber\\src\\test\\java\\feature1\\RememberMe.feature",glue= {"stepdefinition"},plugin= {"pretty","json:target/HTmlreports.json"},monochrome=true, dryRun=true,tags="@regression or @smoke")

@CucumberOptions(features="C:\\Users\\dmathew\\eclipse-workspace\\Cucumber\\src\\test\\java\\feature1\\RememberMe.feature",glue= {"stepdefinition"},plugin= {"pretty","json:target/HTmlreports.json"},monochrome=true, dryRun=true,tags="@regression and not @smoke")

public class Testrunner {

}
