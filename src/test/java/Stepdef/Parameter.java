package Stepdef;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class Parameter {
	WebDriver driver=null;
	@Given("User is open the application")
	public void user_is_open_the_application() {
		System.setProperty("webdriver.chrome.driver","C:\\Users\\TRAINING_b6b.00.02\\Desktop\\Browser N Driver\\chromedriver.exe");
		  driver=new ChromeDriver();
		  String url="http://10.232.237.143:443/TestMeApp/fetchcat.htm";
		  driver.get(url);
		  driver.manage().window().maximize();
		  

	}

	@When("User click on to signin link")
	public void user_click_on_to_signin_link() {
		driver.findElement(By.linkText("SignIn")).click();

	}

	@When("User enters {string} and {string}")
	public void user_enters_and(String username, String password) {
		driver.findElement(By.id("userName")).sendKeys(username);
		 driver.findElement(By.name("password")).sendKeys(password);
		  driver.findElement(By.name("Login")).click();
		  driver.findElement(By.xpath("//a[@href='logout.htm']")).click();
		  driver.close();

	}

	@Then("Message displayed Login Successfully")
	public void message_displayed_Login_Successfully() {

	}


}
