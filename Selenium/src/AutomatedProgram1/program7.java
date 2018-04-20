package AutomatedProgram1;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;

public class program7 {
	public static void main (String[] args) throws InterruptedException, AWTException {
		System.setProperty("webdriver.gecko.driver" , "C:\\Users\\Sneha\\Desktop\\geckodriver.exe");
		WebDriver d = new FirefoxDriver();
		d.get("https://demo.actitime.com/");
		Thread.sleep(1000);
		Actions a = new Actions(d);
		a.contextClick(d.findElement(By.xpath("a[.='actiTIME Inc.']"))).perform();
		Thread.sleep(1000);
		Robot r = new Robot();
		r.keyPress(KeyEvent.VK_W); // ***always do key release after key press otherwise system will crash***
		r.keyRelease(KeyEvent.VK_W);
		
	}
}
