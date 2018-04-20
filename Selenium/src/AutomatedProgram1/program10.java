package AutomatedProgram1;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class program10 {
	public static void main (String[] args) throws InterruptedException {
		System.setProperty("webdriver.gecko.driver" , "C:\\Users\\Sneha\\Desktop\\geckodriver.exe");
		WebDriver d = new FirefoxDriver();
		d.get("file:///C:/Users/Sneha/Desktop/B.html");
		Thread.sleep(1000);
		WebElement e = d.findElement(By.id("b"));
		JavascriptExecutor j = (JavascriptExecutor) d;
		j.executeScript("arguments[0].value=arguments[2]" ,e , "abcdefghi" , "1234567");
	}
}
