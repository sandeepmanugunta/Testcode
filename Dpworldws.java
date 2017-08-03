package vbs;

import java.util.concurrent.TimeUnit;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;


public class Dpworldws {
	WebDriver driver;
	
	@BeforeMethod
	public void startBrowser()
	{
		System.setProperty("webdriver.gecko.driver","C:\\Users\\smanugunta\\eclipse-workspace\\Project1\\lib\\geckodriver.exe");
		System.out.println("Browser is opened");	
	}
		
		@Test (priority=1)
		public void CBNow() throws InterruptedException
		{
			driver=new FirefoxDriver();
			driver.manage().timeouts().implicitlyWait(30,TimeUnit.SECONDS);
						 
			LoginPage login=new LoginPage(driver);
			login.logintovbs20("whiplash", "test1234");
			
			Select dropdown = new Select(driver.findElement(By.xpath(".//*[@id='vbs_new_selected_FACILITYID']")));
			dropdown.selectByVisibleText("DP WORLD WS Intermodal");
			driver.findElement(By.xpath(".//*[@id='Accept']")).click();
			driver.findElement(By.xpath(".//*[@id='quickLinkBooking']/div/ul/li[1]/a")).click();
			
			Select first = new Select(driver.findElement(By.xpath(".//*[@id='BOOKINGTYPE']")));
			first.selectByVisibleText("Dual");
			
			driver.findElement(By.xpath(".//*[@id='BOOKINGDATE']/option[2]")).click();
			
			Select pool = new Select(driver.findElement(By.xpath(".//*[@id='FACILITYPOOLID']")));
			pool.selectByVisibleText("Empty Return");
			
			Select length = new Select(driver.findElement(By.xpath(".//*[@id='LENGTH']")));
			length.selectByValue("2");
			
			Select commodity = new Select(driver.findElement(By.xpath(".//*[@id='COMMODITY']")));
			commodity.selectByVisibleText("Nested");
			
			driver.findElement(By.xpath(".//*[@id='FULL']/option[3]")).click();
			driver.findElement(By.xpath(".//*[@id='BookingsSearchP2___LOOKAHEAD']")).click();
			driver.findElement(By.xpath(".//*[@id='Search']")).click();
		}	
		
		@AfterMethod
		public void closeBrowser()
		{
			driver.quit();
			System.out.println("Browser is closed");
		}
		
		
}
