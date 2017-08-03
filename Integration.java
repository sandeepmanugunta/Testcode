package vbs;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class Integration{
	WebDriver driver;
	
	@BeforeClass
	public void startBrowser()
	{
		System.setProperty("webdriver.gecko.driver","C:\\Users\\smanugunta\\eclipse-workspace\\Project1\\lib\\geckodriver.exe");
		System.out.println("Browser is opened");	
	}
	
	@Test(priority=1,description="This testcases are for Dpworldws")
	public void m2() throws InterruptedException 
	{
		Dpworldws t=new Dpworldws();
		t.CBNow();
		System.out.println("Dpworldws testcases are passed");
	}
	
	@Test(priority=2,description="This testcases are for Asian Terminals Inc.")
	public void m3() throws InterruptedException 
	{
		InitialSetup a=new InitialSetup();
		a.test1();
		System.out.println("Asian testcases are passed");
	}
	
	@Test(priority=3,description="These testcases are for BookingList.")
	public void m4() throws InterruptedException 
	{
		BookingList b=new BookingList();
		b.ContainerList();
		System.out.println("ContainerList testcases are passed");
	}
	
	@AfterClass
	public void closeBrowser()
	{
		driver.quit();
		System.out.println("Browser is closed");
	}

}
