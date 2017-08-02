package myproj;

import java.awt.Robot;
import java.awt.Toolkit;
import java.awt.datatransfer.StringSelection;
import java.awt.event.KeyEvent;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;

public class skilledpool 
{

	public void f1()
	{
		
	}
	
	public static void main(String[] args) throws Exception
	{
		System.setProperty("webdriver.gecko.driver","d:\\geckodriver.exe");
		FirefoxDriver driver=new FirefoxDriver();
		driver.manage().timeouts().implicitlyWait(20,TimeUnit.SECONDS);
		driver.manage().window().maximize();
		driver.get("http://www.skilledpool.com");
		
		WebElement w=driver.findElement(By.xpath("//a[text()='Sign up']"));
		
		new Actions(driver).moveToElement(w).perform();
		driver.findElement(By.linkText("Employer")).click();
		
		new Select(driver.findElement(By.id("country_code1"))).selectByVisibleText("India");
		Thread.sleep(3000);
		new Select(driver.findElement(By.id("state"))).selectByVisibleText("Delhi");
		Thread.sleep(3000);
		new Select(driver.findElement(By.id("city"))).selectByVisibleText("Bawana");
		
		//in some app, for uploadfile directly using sendKeys
		//driver.findElement(By.id("userfile")).sendKeys("d:\\testdata.xls");
		
		Runtime.getRuntime().exec("D:\\7PM_may_11\\fileupload.exe");
		
		driver.findElement(By.id("userfile")).click();
		
		
		
		//Thread.sleep(2000);
		
		/*Robot r=new Robot();
		//copy the text into clipboard memory
		Toolkit.getDefaultToolkit().getSystemClipboard().setContents(new StringSelection("d:\\testdata.xls"), null);
		
		r.keyPress(KeyEvent.VK_CONTROL);
		r.keyPress(KeyEvent.VK_V);
		r.keyRelease(KeyEvent.VK_CONTROL);
		r.keyRelease(KeyEvent.VK_V);
		Thread.sleep(2000);
		r.keyPress(KeyEvent.VK_ENTER);*/
		
		
		

	}

}
