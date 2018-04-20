package AutomatedProgram1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class program18 {
	
	private WebElement username;
	private WebElement password;
	private WebElement login;
	
	public program18(WebDriver d)
	{
		username = d.findElement(By.id("username"));
		password = d.findElement(By.name("password"));
		login = d.findElement(By.xpath("//a[.='Login']"));
	}
public WebElement username()
{
	return username;
}
public WebElement password()
{
	return password;
}
public WebElement login()
{
	return login;
}
public static void main (String[] args) throws InterruptedException
{
	System.setProperty("webdriver.chrome.driver" , "C:\\Users\\Sneha\\Desktop\\chromedriver.exe");
	WebDriver d = new ChromeDriver();
	d.get("https://demo.actitime.com/");
	program18 e = new program18(d);
	e.username().sendKeys("jhkjsdhfk");
	e.password().sendKeys("hdsfkhfd");
	e.login.click();
	Thread.sleep(2000);
	e.username().sendKeys("admin");
	e.password().sendKeys("manager");
	e.login.click();
}
}
	
	

