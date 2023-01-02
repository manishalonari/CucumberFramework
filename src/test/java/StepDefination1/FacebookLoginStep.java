package StepDefination1;



import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.When;

public class FacebookLoginStep {
	WebDriver driver;
	
	@Given("user is on login page")
	public void user_is_on_login_page() {
		System.setProperty("webdriver.chrome.driver","C:\\Users\\91959\\Downloads\\chromedriver_win32\\chromedriver.exe");
		driver = new ChromeDriver();
	    driver.get("https://www.facebook.com/");
	}
	@When("user enter username and password")
	public void user_enter_username_and_password() {
	   driver.findElement(By.id("email")).sendKeys("neema");
	   driver.findElement(By.id("pass")).sendKeys("patil123");
	   
	}

}
