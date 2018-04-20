package AutomatedProgram1;

import java.awt.AWTException;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class program14 {
	public static void main (String[] args) throws InterruptedException, AWTException {
		System.setProperty("webdriver.chrome.driver" , "C:\\Users\\Sneha\\Desktop\\chromedriver.exe");
		WebDriver d = new ChromeDriver();
		d.get("https://www.cleartrip.com/");
		Thread.sleep(1000);
		d.findElement(By.id("DepartDate")).click();
		Thread.sleep(1000);
		d.findElement(By.xpath("//span[.='February']/../../..//a[.='11']")).click();
	}

}
