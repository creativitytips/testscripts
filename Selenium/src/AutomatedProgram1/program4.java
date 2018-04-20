package AutomatedProgram1;

import org.openqa.selenium.By;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class program4 {
	public static void main (String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver" , "C:\\Users\\Sneha\\Desktop\\chromedriver.exe");
		WebDriver d = new ChromeDriver();
		d.get("file:///C:/Users/Sneha/Desktop/B.html");
		d.findElement(By.cssSelector("input[value='a']")).sendKeys("hgvhgfhh");
}
}
