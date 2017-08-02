package myproj;

import java.util.ArrayList;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.firefox.FirefoxDriver;

public class hdfc 
{

	public static void main(String[] args) 
	{
		System.setProperty("webdriver.gecko.driver","d:\\geckodriver.exe");
		FirefoxDriver driver=new FirefoxDriver();
		driver.manage().timeouts().implicitlyWait(20,TimeUnit.SECONDS);
		driver.manage().window().maximize();
		driver.get("http://www.hdfcbank.com");
		
		driver.findElement(By.id("loginsubmit")).click();
		ArrayList<String> lst=new ArrayList<String>(driver.getWindowHandles());
		
		//focus to window
		driver.switchTo().window(lst.get(1)); 
		
		System.out.println(lst.get(0));
		System.out.println(lst.get(1));
		
		driver.findElement(By.xpath("(//a[contains(text(),'Continue to NetBanking')])[2]")).click();
		
		//focus to frame
		driver.switchTo().frame("login_page");	
		//driver.findElement(By.name("fldLoginUserId")).sendKeys("767876789");
		driver.findElement(By.xpath("//img[@alt='continue']")).click();
		try
		{
			//focus to alert
			Alert a=driver.switchTo().alert();
			System.out.println(a.getText());
			a.accept();
		}
		catch(Exception e){ }		
	}
}
