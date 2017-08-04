package vbs;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.Test;

public class BookingList2 {

			@Test(priority=1, description="It will show list of all bookings done on that particular selection")	
			public static void BookingList20() throws InterruptedException 
			{
				WebDriver driver;
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
			
}
			
