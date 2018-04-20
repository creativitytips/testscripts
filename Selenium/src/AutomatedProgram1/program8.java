package AutomatedProgram1;

import java.awt.AWTException;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.Select;

public class program8 {
	public static void main (String[] args) throws InterruptedException, AWTException {
		System.setProperty("webdriver.gecko.driver" , "C:\\Users\\Sneha\\Desktop\\geckodriver.exe");
		WebDriver d = new FirefoxDriver();
		d.get("file:///C:/Users/Sneha/Desktop/c.html");
		Select s = new Select(d.findElement(By.id("abc")));
		Thread.sleep(1000);
		s.selectByIndex(3);
		Thread.sleep(1000);
		s.selectByVisibleText("D");
		Thread.sleep(1000);
		s.selectByValue("j");
}
}