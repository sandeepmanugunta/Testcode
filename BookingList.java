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

public class BookingList {

			WebDriver driver;
						
			@BeforeMethod
			public void startBrowser()
			{
				System.setProperty("webdriver.gecko.driver","C:\\Users\\smanugunta\\eclipse-workspace\\Project1\\lib\\geckodriver.exe");
				System.out.println("Browser is opened");	
			}
			
			
			@Test (priority=1, description="It will show list of all containers")
			public void ContainerList() throws InterruptedException 
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
			
			
			@Test(priority=2, description="It will show list of all bookings done on that particular selection")	
			public void BookingList2() throws InterruptedException 
			{
				
				driver=new FirefoxDriver();
				driver.manage().timeouts().implicitlyWait(30,TimeUnit.SECONDS);
				//driver.manage().window().maximize();
				driver.get("https://ictsi20-dev.vbs.1-stop.biz/SignIn.aspx?ReturnUrl=%2FHomeSubscriber.aspx");
				System.out.println("Url is correct");
				
				driver.findElement(By.xpath(".//*[@id='SignInDiv___USERNAME']")).sendKeys("whiplash");
				driver.findElement(By.xpath(".//*[@id='SignInDiv___CLEAR-PASSWORD']")).sendKeys("test1234");
				driver.findElement(By.xpath(".//*[@id='btnSubmit']")).click();
				System.out.println("Login Successful");
				
				Select facility = new Select(driver.findElement(By.xpath(".//*[@id='vbs_new_selected_FACILITYID']")));
				facility.selectByVisibleText("Asian Terminals Inc.");
				
				driver.findElement(By.xpath(".//*[@id='Accept']")).click();
				
				driver.findElement(By.xpath(".//*[@id='quickLinkManage']/div/ul/li/a")).click();
				
				driver.findElement(By.xpath(".//*[@id='SearchDateBasic']/table/tbody/tr/td[1]/img")).click();
				//driver.findElement(By.linkText("Next")).click();
				driver.findElement(By.linkText("9")).click();
				
				Select zone = new Select(driver.findElement(By.xpath(".//*[@id='BOOKINGZONE']")));
				zone.selectByVisibleText("4");
				
				Select pool = new Select(driver.findElement(By.xpath(".//*[@id='POOL']")));
				pool.selectByVisibleText("General");
				
				Select vessel = new Select(driver.findElement(By.xpath(".//*[@id='VESSEL']")));
				vessel.selectByVisibleText("ANNIKA");
				
				Select status = new Select(driver.findElement(By.xpath(".//*[@id='STATUSCODE']")));
				status.selectByVisibleText("Rejected");
				
				driver.findElement(By.xpath(".//*[@id='BookingByDateSearchOptions___LATERECEIVAL']")).click();
				
				driver.findElement(By.xpath(".//*[@id='BookingByDateSearchOptions___EARLYRECEIVAL']")).click();
				
				driver.findElement(By.xpath(".//*[@id='SEARCH_COMPANY_DATE']")).click();	
				
			}
			@AfterMethod
			public void closeBrowser()
			{
				driver.quit();
				System.out.println("Browser is closed");
			}

				
				
				
				
		
				
			
}
