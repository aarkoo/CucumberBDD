package stepdefinations;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import junit.framework.Assert;

public class LoginSteps {

	public WebDriver driver;
	String tit="Account – AskOmDch";
	
	@Given("I am on login page")
	public void i_am_on_login_page() {
	   
		System.setProperty("webdriver.chrome.driver", "D:/chromedriver-win64/chromedriver.exe");
		driver= new ChromeDriver();
		driver.get("https://askomdch.com/account/");
		driver.manage().window().maximize();
	}

	@When("I enter \"(.*)\" and \"(.*)\"$")
	public void i_enter_name_and_password(String name, String password) throws Throwable {
		Thread.sleep(3000);
		driver.findElement(By.id("username")).clear();
		driver.findElement(By.id("username")).sendKeys(name);
		
		driver.findElement(By.id("password")).clear();
		driver.findElement(By.id("password")).sendKeys(password);
	}

	@When("I click on login btn")
	public void i_click_on_login_btn() {
		driver.findElement(By.name("login")).click();
	}


	@Then("user is on home page")
	public void user_is_on_home_page()
	{
		String title = driver.getTitle();
		Assert.assertEquals(tit, title);
	}

	
	


}
