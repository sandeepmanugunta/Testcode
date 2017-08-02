package myproj;

import java.awt.Robot;
import java.awt.event.KeyEvent;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.firefox.FirefoxDriver;

public class downloadfile_alert 
{

	public static void main(String[] args) throws Exception
	{
		System.setProperty("webdriver.gecko.driver","d:\\geckodriver.exe");
		FirefoxDriver driver=new FirefoxDriver();
		driver.manage().timeouts().implicitlyWait(20,TimeUnit.SECONDS);
		driver.manage().window().maximize();
		driver.get("http://www.eclipse.org/downloads/download.php?file=/technology/epp/downloads/release/neon/3/eclipse-java-neon-3-win32.zip");

		driver.findElement(By.linkText("eclipse-java-neon-3-win32.zip")).click();
		Thread.sleep(5000);
		
		Robot r=new Robot();
		r.keyPress(KeyEvent.VK_DOWN);
		Thread.sleep(2000);
		r.keyPress(KeyEvent.VK_ENTER);
		
	}

}
