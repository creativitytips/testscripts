package AutomatedProgram1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class program5 {
	public static void main (String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver" , "C:\\Users\\Sneha\\Desktop\\chromedriver.exe");
		WebDriver d = new ChromeDriver();
		d.get("file:///C:/Users/Sneha/Desktop/a.html");
		d.findElement(By.id("a")).sendKeys("abcdefgh");
		Thread.sleep(1000);
		d.switchTo().frame("frame");
		d.findElement(By.id("b")).sendKeys("abcdefghijkl");
		Thread.sleep(1000);
		d.switchTo().defaultContent();
		d.findElement(By.id("c")).sendKeys("AQWER");

}
}