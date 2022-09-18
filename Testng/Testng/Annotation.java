package Testng.Testng;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Annotation {
	
//	 @BeforeSuite
	 
		@Test
		public void A()
		{
		
		    WebDriverManager.chromedriver().setup();
			WebDriver driver= new ChromeDriver();
			driver.get("https://opensource-demo.orangehrmlive.com/");
			driver.manage().window().maximize();
			driver.manage().deleteAllCookies();
		}
	 
		
//	@BeforeTest
//	  
//	  public void T(WebDriver driver)
//		{
//		   WebElement username = driver.findElement(By.xpath("//*[@name=\"username\"]"));
//		   username.sendKeys("Admin");
//		   WebElement pswrd = driver.findElement(By.xpath("//*[@name=\"password\"]"));
//		   pswrd.sendKeys("admin@123");
//		   
//		   WebElement sbmit = driver.findElement(By.xpath("type=\"submit\""));
//		   sbmit.click();
//		}
	
	
	 
//	@Test 
//	
//	public void login(driver)
//	{
//		 
//	}
//	
//    @Test 
//	
//	public void admin()
//	{
//		
//	}
//    
//  
	
 
 
//  @AfterSuite
//  
// public void C()
//	{
//		System.out.println("AfterSuite Annotation Method");
//	}
//  
//  @BeforeTest
//  
//  public void D()
//	{
//		System.out.println("BeforeTest Annotation Method");
//	}
//  
// @AfterTest
//  
//  public void E()
//	{
//		System.out.println("AftereTest Annotation Method");
//	}
// 
// @BeforeClass
// 
// public void F()
//	{
//		System.out.println("Beforeclass Annotation Method");
//	}
// 
//@AfterClass
// 
// public void G()
//	{
//		System.out.println("Afterclass Annotation Method");
//	}
//	
//@BeforeMethod
//
//public void H()
//	{
//		System.out.println("BeforeMethod Annotation Method");
//	}
//
//@AfterMethod
//
//public void I()
//	{
//		System.out.println("AfterMethod Annotation Method");
//	}
//	
//	
}
