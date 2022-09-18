package Testng.Testng;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeSuite;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Basetest {
	static WebDriver driver;
	loginpage lp;
	
	@BeforeSuite
	
	public void initdriver()
	{
		WebDriverManager.chromedriver().setup();
		 driver= new ChromeDriver();
		driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
	}
	
	@BeforeClass
	
	public void creatobject() {
		
		 lp = new loginpage(driver);
	}

}
