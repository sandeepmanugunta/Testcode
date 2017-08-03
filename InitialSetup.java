package vbs;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class InitialSetup {

			WebDriver driver;
						
			@BeforeMethod
			public void startBrowser()
			{
				System.setProperty("webdriver.gecko.driver","C:\\Users\\smanugunta\\eclipse-workspace\\Project1\\lib\\geckodriver.exe");
				System.out.println("Browser is opened");	
			}
			
			@Test	
			public void test1() throws InterruptedException 
			{
				
				driver=new FirefoxDriver();
				driver.manage().timeouts().implicitlyWait(30,TimeUnit.SECONDS);
				//driver.manage().window().maximize();
				driver.get("https://ictsi20-dev.vbs.1-stop.biz/SignIn.aspx?ReturnUrl=%2FHomeSubscriber.aspx");
				System.out.println("Url is correct");
				
				LoginPage login=new LoginPage(driver);
				login.logintovbs20("whiplash", "test1234");
				
				Select dropdown = new Select(driver.findElement(By.xpath(".//*[@id='vbs_new_selected_FACILITYID']")));
				dropdown.selectByVisibleText("Asian Terminals Inc.");
				driver.findElement(By.xpath(".//*[@id='Accept']")).click();
				driver.findElement(By.xpath(".//*[@id='quickLinkBooking']/div/ul/li/a")).click();
				
				driver.findElement(By.xpath(".//*[@id='VESSEL_chosen']/a/span")).click();
				driver.findElement(By.xpath(".//*[@id='VESSEL_chosen']/div/ul/li[2]")).click();
				
				driver.findElement(By.xpath(".//*[@id='DIRECTION_chosen']/a/span")).click();
				driver.findElement(By.xpath(".//*[@id='DIRECTION_chosen']/div/ul/li[2]")).click();
				
							
				driver.findElement(By.xpath(".//*[@id='CBIStatusFilterForm___STATNOTREADY_Label']")).click();
				
				driver.findElement(By.xpath(".//*[@id='CBIFilterForm___CONTAINSTXT']")).sendKeys("test");
				
				driver.findElement(By.xpath(".//*[@id='SEARCH']")).click();
				
				WebElement result = driver.findElement(By.xpath(".//*[@id='CBItemsGridHolder']"));
				Assert.assertTrue(result.isDisplayed());
				System.out.println("Test Scenario is Succesful");
			}
			
			
			
				@AfterMethod
				public void closeBrowser()
				{
					driver.quit();
					System.out.println("Browser is closed");
				}

}
