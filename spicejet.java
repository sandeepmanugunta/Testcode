package myproj;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class spicejet 
{

	public static void main(String[] args) throws Exception
	{
		System.setProperty("webdriver.gecko.driver","d:\\geckodriver.exe");
		FirefoxDriver driver=new FirefoxDriver();
		driver.manage().timeouts().implicitlyWait(20,TimeUnit.SECONDS);
		driver.manage().window().maximize();
		driver.get("http://www.spicejet.com/");
		
		driver.findElement(By.xpath("//input[@value='OneWay']")).click();
		
		driver.findElement(By.id("ctl00_mainContent_ddl_originStation1_CTXT")).click();
		Thread.sleep(2000);
		driver.findElement(By.linkText("Hyderabad (HYD)")).click();
		Thread.sleep(2000);
		driver.findElement(By.linkText("Bengaluru (BLR)")).click();
		Thread.sleep(2000);
		WebElement lastcal=driver.findElement(By.xpath("//div[@class='ui-datepicker-group ui-datepicker-group-last']"));
		while(lastcal.findElement(By.xpath("div/div/span[1]")).getText().matches("October")==false)
		{
	      driver.findElement(By.xpath("//span[text()='Next']")).click();
	      lastcal=driver.findElement(By.xpath("//div[@class='ui-datepicker-group ui-datepicker-group-last']"));
		}
		lastcal.findElement(By.linkText("18")).click();

	}

}
