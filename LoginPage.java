package vbs;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class LoginPage {
	
	WebDriver driver;
	
	By username=By.xpath(".//*[@id='SignInDiv___USERNAME']");
	By password=By.xpath(".//*[@id='SignInDiv___CLEAR-PASSWORD']");
	By loginButton=By.xpath(".//*[@id='btnSubmit']");
		
	public LoginPage(WebDriver driver)
	{
		this.driver=driver;		
	}

	public void logintovbs20(String userid, String pass)
	{
		driver.get("https://ictsi20-dev.vbs.1-stop.biz/SignIn.aspx?ReturnUrl=%2FHomeSubscriber.aspx");
		driver.findElement(username).sendKeys(userid);
		driver.findElement(password).sendKeys(pass);
		driver.findElement(loginButton).click();	
	}
	
}
