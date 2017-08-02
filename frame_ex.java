package myproj;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;

public class frame_ex 
{

	public static void main(String[] args) throws Exception
	{
		System.setProperty("webdriver.gecko.driver","d:\\geckodriver.exe");
		FirefoxDriver driver=new FirefoxDriver();
		driver.manage().timeouts().implicitlyWait(20,TimeUnit.SECONDS);
		driver.manage().window().maximize();
		driver.get("http://jqueryui.com/droppable/");
		
		driver.switchTo().frame(driver.findElement(By.xpath("//iframe[@class='demo-frame']")));
		
		WebElement w1=driver.findElement(By.id("draggable"));
		WebElement w2=driver.findElement(By.id("droppable"));
		
		new Actions(driver).dragAndDrop(w1,w2).perform();
		Thread.sleep(5000);
		driver.switchTo().window(driver.getWindowHandle());
		driver.findElement(By.linkText("Selectable")).click();
		
		driver.switchTo().frame(driver.findElement(By.xpath("//iframe[@class='demo-frame']")));
		
		WebElement itms=driver.findElement(By.id("selectable"));
		List<WebElement> lst=itms.findElements(By.tagName("li"));
		
		new Actions(driver)
		   .keyDown(itms, Keys.CONTROL)
		   .click(lst.get(1))
		   .click(lst.get(3))
		   .click(lst.get(6))
		   .keyUp(itms,Keys.CONTROL)
		   .perform();
		
		

	}

}
