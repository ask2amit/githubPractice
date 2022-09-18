package Testng.Testng;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class loginpage {

	WebDriver driver;
	
	public loginpage(WebDriver driver)
	{
		this.driver=driver;
	}
	
	public void logintoaccount() 
	{
		WebElement username = driver.findElement(By.xpath("//*[@placeholder=\"Username\"]"));
		username.sendKeys("Admin");
		WebElement pswrd = driver.findElement(By.xpath("//*[@placeholder=\"Password\"]"));
		pswrd.sendKeys("admin@123");
		WebElement sbmit = driver.findElement(By.xpath("//button"));
		sbmit.click();
	}
}
