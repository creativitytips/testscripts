package AutomatedProgram1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;



	class program6 {
	
	public static void main (String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver" , "C:\\Users\\Sneha\\Desktop\\chromedriver.exe");
		WebDriver d = new ChromeDriver();
		d.get("https://www.amazon.in/");
		Thread.sleep(1000);
		Actions a = new Actions(d);// predefined class Actions is used not class name
		a.moveToElement(d.findElement(By.xpath("//span[.='Category']"))).perform();
		
	}		

}
