package TestNG;

import org.testng.Reporter;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class program21 {
	
	@BeforeMethod
	public void beforeMethod()
	{
		Reporter.log("BeforeMethod" , true);
	}
	@AfterMethod
	public void aftermethod()
	{
		Reporter.log("AfterMethod"  , true);
	}
	@BeforeClass
	public void beforeclass()
	{
	Reporter.log("BeforeClass" ,true);	
	}
	@AfterClass
	public void afterclass()
	{
		Reporter.log("AfterClass" , true);
	}
}




