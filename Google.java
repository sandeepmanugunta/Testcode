package myproj;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class Google 
{

	public static void main(String[] args) 
	{
		//System.setProperty("webdriver.gecko.driver","d:\\geckodriver.exe");
		//FirefoxDriver driver=new FirefoxDriver();
		
		System.setProperty("webdriver.chrome.driver","d:\\7pm_may_11\\chromedriver.exe");
		ChromeDriver driver=new ChromeDriver();
		driver.get("http://www.google.com");
		
		//WebElement w=driver.findElement(By.name("q"));
		//w.sendKeys("java");
		
		driver.findElement(By.name("q")).sendKeys("java");
		driver.findElement(By.name("btnG")).click();

	}

}
