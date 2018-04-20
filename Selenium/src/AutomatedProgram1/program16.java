package AutomatedProgram1;// only works in firefox

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class program16 {
	public static void main (String[] args) throws InterruptedException, AWTException {
		System.setProperty("webdriver.gecko.driver" , "C:\\Users\\Sneha\\Desktop\\geckodriver.exe");
		WebDriver d = new FirefoxDriver();
		d.get("http://www.seleniumhq.org/download/");
		d.findElement(By.xpath("//a[contains(.,'3.9.1')]")).click();
		Robot r = new Robot();
		Thread.sleep(2000);
		r.keyPress(KeyEvent.VK_LEFT);
		r.keyRelease(KeyEvent.VK_LEFT);
		Thread.sleep(1000);
		r.keyPress(KeyEvent.VK_ENTER);
		r.keyRelease(KeyEvent.VK_ENTER);
		
	}
}
