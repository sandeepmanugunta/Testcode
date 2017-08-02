package myproj;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.firefox.FirefoxDriver;

public class facebook 
{

	public static void main(String[] args) 
	{
		System.setProperty("webdriver.gecko.driver","d:\\geckodriver.exe");
		FirefoxDriver driver=new FirefoxDriver();
		driver.manage().timeouts().implicitlyWait(20,TimeUnit.SECONDS);
		driver.manage().window().maximize();
		driver.get("http://www.facebook.com");
		
		driver.findElement(By.name("email")).sendKeys("dsfdsfdsf");
		driver.findElement(By.name("pass")).sendKeys("dsfsdfdsf");
		driver.findElement(By.id("loginbutton")).click();
		
		String str=driver.findElement(By.xpath("//div[@class='_4rbf _53ij']")).getText();
		System.out.println(str);

	}

}
