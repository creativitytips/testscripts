package AutomatedProgram1;

import java.awt.AWTException;
import java.text.SimpleDateFormat;
import java.util.Date;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class program15 {
	public static void main (String[] args) throws InterruptedException, AWTException {
		Date date = new Date();
		SimpleDateFormat s1 = new SimpleDateFormat("dd");
		SimpleDateFormat s2 = new SimpleDateFormat("MMMM");
		String str1 = s1.format(date);
		String str2 = s2.format(date);
		System.out.println(str1);
	    System.out.println(str2);
		System.setProperty("webdriver.chrome.driver" , "C:\\Users\\Sneha\\Desktop\\chromedriver.exe");
		WebDriver d = new ChromeDriver();
		d.get("https://www.cleartrip.com/");
		Thread.sleep(1000);
		d.findElement(By.id("DepartDate")).click();
		Thread.sleep(1000);
		//d.findElement(By.xpath("//span[.='February']/../../..//a[.='11']")).click();
		d.findElement(By.xpath("//span[.='"+str2+"']/../../..//a[.='"+str1+"']")).click();
				
	}			

}
