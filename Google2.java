package myproj;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Google2 
{

	public static void main(String[] args)
	{
		System.setProperty("webdriver.chrome.driver","d:\\7pm_may_11\\chromedriver.exe");
		ChromeDriver driver=new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		driver.get("http://www.google.com");
				
		driver.findElement(By.name("q")).sendKeys("selenium");
		driver.findElement(By.name("btnG")).click();
		
		List<WebElement> lst=driver.findElements(By.xpath("//a[starts-with(.,'Selenium') or starts-with(.,'selenium')]"));
		
		for(WebElement x : lst)
			System.out.println(x.getText());
		
		System.out.println("======================");
		driver.navigate().to("https://en.wikipedia.org/wiki/Selenium_(software)");
		String s1=driver.findElement(By.linkText("View history")).getAttribute("title");
		System.out.println(s1);
		s1=driver.findElement(By.linkText("View history")).getAttribute("href");
		System.out.println(s1);
		
		//driver.getCurrentUrl();
		

	}

}
