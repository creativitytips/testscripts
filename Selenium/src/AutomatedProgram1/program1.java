package AutomatedProgram1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;


public class program1 {
public static void main(String[] args) throws InterruptedException {
	System.setProperty("webdriver.gecko.driver" , "C:\\Users\\Sneha\\Desktop\\geckodriver.exe");
	WebDriver d = new FirefoxDriver();
	d.get("file:///C:/Users/Sneha/Desktop/B.html");
	//WebElement e = d.findElement(By.id("b")); 
	//e.sendKeys("abcdef");
	d.findElement(By.name("vada")).sendKeys("idli");
	d.findElement(By.className("brkfst")).sendKeys("lunch");
	
}
}
