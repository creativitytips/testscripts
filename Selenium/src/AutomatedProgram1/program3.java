package AutomatedProgram1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class program3 {
	public static void main (String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver" , "C:\\Users\\Sneha\\Desktop\\chromedriver.exe");
		WebDriver d = new ChromeDriver();
		d.get("file:///C:/Users/Sneha/Desktop/1st%20batch/demo1.html");
        d.findElement(By.linkText("Google")).click();
        d.findElement(By.partialLinkText("Goog")).click();
	}
	}




