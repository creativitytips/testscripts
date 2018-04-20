package TestNG;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class program25 {
	public static void main(String[] args) throws IOException
	{
		System.setProperty("webdriver.chrome.driver" , "C:\\Users\\Sneha\\Desktop\\chromedriver.exe");
		WebDriver d = new ChromeDriver();
		d.get("https://www.actitime.com/");
		TakesScreenshot t = (TakesScreenshot) d;
		File src = t.getScreenshotAs(OutputType.FILE);
			FileUtils.copyFile(src, new File("C:\\Users\\Sneha\\Java classes\\Selenium\\screen"));
	}

}
