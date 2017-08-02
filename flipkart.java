package myproj;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;

public class flipkart
{

	public static void main(String[] args) throws Exception
	{
		System.setProperty("webdriver.gecko.driver","d:\\geckodriver.exe");
		FirefoxDriver driver=new FirefoxDriver();
		//driver.manage().timeouts().implicitlyWait(20,TimeUnit.SECONDS);
		driver.manage().window().maximize();
		driver.get("http://www.flipkart.com");
		
		WebElement elec=driver.findElement(By.xpath("//span[text()='Electronics']"));
		
		Actions a=new Actions(driver);
		a.moveToElement(elec).perform();
		Thread.sleep(5000);
		driver.findElement(By.linkText("Pendrives")).click();
	}

}
