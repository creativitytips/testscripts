package AutomatedProgram1;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

// launching an empty browser
public class program 
{
	public static void main(String[]args)
	{
		System.setProperty("webdriver.chrome.driver" , "C:\\Users\\Sneha\\Desktop\\chromedriver.exe");
		WebDriver d = new ChromeDriver();
		System.setProperty("webdriver.gecko.driver" , "C:\\Users\\Sneha\\Desktop\\geckodriver.exe");
		WebDriver d1 = new FirefoxDriver();
		
	}

}
