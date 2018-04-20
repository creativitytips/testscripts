package AutomatedProgram1; //javascript popup

import java.awt.AWTException;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class program12 {
	public static void main (String[] args) throws InterruptedException, AWTException {
		System.setProperty("webdriver.chrome.driver" , "C:\\Users\\Sneha\\Desktop\\chromedriver.exe");
		WebDriver d = new ChromeDriver();
		d.get("https://www.irctc.co.in/");
		Thread.sleep(1000);
		d.findElement(By.id("loginbutton")).click();
		Alert al = d.switchTo().alert();
		Thread.sleep(1000);
		System.out.println(al.getText());
		al.accept();
	}
}
