package Day43;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class AnnotationsDemo1 
{
	@BeforeMethod
	void login()
	{
		System.out.println("This is login..");
	}
	@AfterMethod
	void logout()
	{
		System.out.println("This is log out");
	}
	@Test(priority=1)
	void search()
	{
		System.out.println("This is searhc...");
	}
	@Test(priority=2)
	void advancesearch()
	{
		System.out.println("This is advance search..");
		
	}
	

}
