package PageAuto;

import java.io.IOException;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import pageObj.LogPage;
import resources.Base;



public class LoginNew extends Base{
	public WebDriver driver;
	
	@BeforeTest
	public void initialize() throws IOException
	{
	
		 driver =initializeDriver();

	}
	@Test
	
	public void pagenew() throws IOException, InterruptedException
	{
		driver.get(prop.getProperty("url"));
		LogPage lp= new LogPage(driver);
		Thread.sleep(3000); 
		lp.getEmail().sendKeys("abc@gmail.com");//add your email address
		Thread.sleep(3000); 
		lp.getNext().click();
		Thread.sleep(3000);
		lp.getPassword().sendKeys("Password");// add respective password
		Thread.sleep(3000);
		lp.getLogin().click();
				}

	@AfterTest
	public void teardown()
	{
		
		driver.close();
	
		
	}

	
}
