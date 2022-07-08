package pageObj;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class LogPage {

	
	public WebDriver driver;
	
	By email=By.xpath("//div[@class='rFrNMe N3Hzgf jjwyfe QBQrY zKHdkd sdJrJc Tyc9J]");
	By nextbutton=By.xpath("//div[@class='VfPpkd-RLmnJb']");
	By password=By.xpath("//button[@class='password']");
	By loginbutton = By.xpath("[href*='VfPpkd-LgbsSe VfPpkd-LgbsSe-OWXEXe-k8QpJ VfPpkd-LgbsSe-OWXEXe-dgl2Hf nCP5yc AjY5Oe DuMIQc LQeN7 qIypjc TrZEUc lw1w4b']");
	
	
	
	
	public LogPage(WebDriver driver) {
		// TODO Auto-generated constructor stub
		
		this.driver=driver;
		
	}
	
public WebElement getEmail()
	{
		return driver.findElement(email);
	}
	

	public WebElement getNext()
	{
		return driver.findElement(nextbutton);
	}
	public WebElement getPassword()
	{
		return driver.findElement(password);
	}
	
	public WebElement getLogin()
	{
		return driver.findElement(loginbutton);
	}
	
	
	
}
