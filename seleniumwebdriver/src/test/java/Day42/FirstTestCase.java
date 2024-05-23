package Day42;

import org.testng.annotations.Test;

public class FirstTestCase 
{
	@Test(priority=20)
	void open() 
	{
        System.out.println("Open allpication");
	}

	@Test(priority=28)
	void login() 
	{
       System.out.println("Login to applocation");
	}

	@Test(priority=25)
	void logout() 
	{
       System.out.println("Logout from spplocation");
	}
}
