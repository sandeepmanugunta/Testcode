package myproj;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class yahoo_login
{
	public static void main(String[] args) throws Exception
	{
		System.setProperty("webdriver.gecko.driver","d:\\geckodriver.exe");
		FirefoxDriver driver=new FirefoxDriver();
		driver.manage().timeouts().implicitlyWait(20,TimeUnit.SECONDS);
		driver.manage().window().maximize();
		driver.get("http://www.yahoomail.com");
		
		driver.findElement(By.name("username")).sendKeys("venkat123456a");
		driver.findElement(By.name("signin")).click();
		Thread.sleep(5000);
		driver.findElement(By.name("password")).sendKeys("mqq987654");
		driver.findElement(By.name("verifyPassword")).click();
		
		driver.findElement(By.xpath("(//input[@name='mid'])[position()=5]")).click();
		
		List<WebElement> lst=driver.findElements(By.xpath("//input[@name='mid']"));
		lst.get(8).click();
	}
}
