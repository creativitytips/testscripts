package AutomatedProgram1;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.Select;

public class program11 {
	public static void main (String[] args) throws InterruptedException, AWTException {
		System.setProperty("webdriver.gecko.driver" , "C:\\Users\\Sneha\\Desktop\\geckodriver.exe");
		WebDriver d = new FirefoxDriver();
		d.get("file:///C:/Users/Sneha/Desktop/d.html");
		Select s = new Select(d.findElement(By.id("abc")));
		Robot r = new Robot();
		r.keyPress(KeyEvent.VK_CONTROL);
		s.selectByIndex(3);
		Thread.sleep(1000);
		s.selectByValue("h");
		Thread.sleep(1000);
		s.selectByVisibleText("F");
		r.keyRelease(KeyEvent.VK_CONTROL);
	}
}

		
		


