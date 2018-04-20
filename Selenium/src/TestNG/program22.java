package TestNG;

import org.testng.Reporter;
import org.testng.annotations.Test;

public class program22 extends program21 {
	
	@Test
	public void b()
	{
		Reporter.log("first" , true);
	}

	@Test
	public void c()
	{
		Reporter.log("second" , true);
	}
}