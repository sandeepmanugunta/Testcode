package vbs;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;


public class Integration{
	
	WebDriver driver;
	
	@BeforeMethod
	public void start()
	{		
		System.setProperty("webdriver.gecko.driver","C:\\Users\\smanugunta\\eclipse-workspace\\Project1\\lib\\geckodriver.exe");		
	}
	
	@Test(priority=1,description="TestScenario1")
	public void m1() throws InterruptedException 
	{
		Dpworldws.CBNow();
		System.out.println("Dpworldws testcases are passed");
	}
	
	@Test(priority=2,description="TestScenario2")
	public void m2() throws InterruptedException 
	{
		InitialSetup.test1();
		System.out.println("Asian testcases are passed");
	}
		
	@Test(priority=3,description="TestScenario3")
	public void m3() throws InterruptedException 
	{
		BookingList2.BookingList20();
		System.out.println("ContainerList testcases are passed");
	}
	
		
	//@AfterClass
	//public void closeBrowser()
	//{
		//driver.quit();
	//}
	
	

}
