package AutomatedProgram1;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class program19 {
	
	@FindBy(id="username")
	private WebElement username;
	
	@FindBy(name="password")
	private WebElement password;
	
	@FindBy(xpath="//a[.='Login']")
	private WebElement login;
	
	public program19(WebDriver d)
	{
		PageFactory.initElements(d, this);
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
	program19 e = new program19(d);
	e.username().sendKeys("skajhdkas");
	e.password().sendKeys("fd, jfdlksjf");
	e.login.click();
	Thread.sleep(2000);
	e.username().sendKeys("admin");
	e.password().sendKeys("manager");
	e.login.click();
}
}
	




