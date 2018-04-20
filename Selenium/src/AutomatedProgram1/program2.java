package AutomatedProgram1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

// working with multiple elements
public class program2 {
public static void main (String[] args) throws InterruptedException {
	System.setProperty("webdriver.chrome.driver" , "C:\\Users\\Sneha\\Desktop\\chromedriver.exe");
	WebDriver d = new ChromeDriver();
	d.get("file:///C:/Users/Sneha/Desktop/1st%20batch/demo1.html");
	WebElement e = d.findElement(By.id("abc")); 
	java.util.List<WebElement> list = d.findElements(By.tagName("input"));
	
	for(WebElement e1 : list){
		e1.sendKeys("abc");
		Thread.sleep(10000);
			
	}
}
}
