package TestNG;

import org.testng.annotations.Test;
public class program20 {
	
	@Test(priority=1)
	public void b()
	{
		System.out.println("first");
	}
@Test()
public void c()
{
	System.out.println("second");
}

@Test(priority=2)
public void a()
{
	System.out.println("third");
}
@Test (priority=-999)
public void d()
{
	System.out.println("fourth");
}
}
	
	
