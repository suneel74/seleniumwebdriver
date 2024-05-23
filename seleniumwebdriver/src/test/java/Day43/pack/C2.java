package Day43.pack;

import org.testng.annotations.AfterClass;
import org.testng.annotations.Test;

public class C2 
{
	@Test
	void xyz()
	{
		System.out.println("This is xyz from C2");
	}
	@AfterClass
	void at()
	{
		System.out.println("This is AfterTest method");
	}

}
