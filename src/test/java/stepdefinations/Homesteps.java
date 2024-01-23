package stepdefinations;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import junit.framework.Assert;

public class Homesteps {
	
	
	public WebDriver driver;
	String tit="Account – AskOmDch";
	
	
	@Given("I am logged in after entering \"(.*)\" and \"(.*)\"$")
	public void i_am_logged_in_after_entering_and(String username, String password) throws Throwable {
	   
		System.setProperty("webdriver.chrome.driver", "D:/chromedriver-win64/chromedriver.exe");
		driver= new ChromeDriver();
		driver.get("https://askomdch.com/account/");
		driver.manage().window().maximize();
		
		Thread.sleep(3000);
		driver.findElement(By.id("username")).clear();
		driver.findElement(By.id("username")).sendKeys(username);
		
		driver.findElement(By.id("password")).clear();
		driver.findElement(By.id("password")).sendKeys(password);
		
		driver.findElement(By.name("login")).click();
		
		String title = driver.getTitle();
		Assert.assertEquals(tit, title);
		
		
	}


	@Given("I click on home button")
	public void i_click_on_home_button() {
		driver.findElement(By.xpath("(//*[contains(text(),'Home')])[1]")).click();
	    
	}


@When("I click on shop now button")
public void i_click_on_shop_now_button() {
    driver.findElement(By.xpath("//a[@class='wp-block-button__link']")).click();
}


}
