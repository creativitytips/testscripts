package AutomatedProgram1;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class program9 {
	public static void main (String[] args) throws InterruptedException {
		System.setProperty("webdriver.gecko.driver" , "C:\\Users\\Sneha\\Desktop\\geckodriver.exe");
		WebDriver d = new FirefoxDriver();
		d.get("file:///C:/Users/Sneha/Desktop/B.html");
		Thread.sleep(1000);
		JavascriptExecutor j = (JavascriptExecutor) d;
	    j.executeScript("document.getElementById('b').value='abcdef'","");
		
	}

} 
