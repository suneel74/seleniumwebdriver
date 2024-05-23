package Day43;

import org.testng.Assert;
import org.testng.annotations.Test;

public class HardAssertions 
{
	@Test
	void test()
	{
		String act_result="OpenCart";
		String exe_result="OpenCart";
		if(act_result.equals(exe_result))
		{
			System.out.println("TEst passed");
			Assert.assertTrue(true);
		}
		else
		{
			System.out.println("test failed");
			Assert.assertTrue(false);
		}
		//Assert.assertEquals("xyz", "abc");
		//Assert.assertEquals("123", "123");
		//Assert.assertNotEquals("Abc", "AYc");
		//Assert.assertTrue(false);
		//Assert.assertFalse(false);
		//Assert.fail();
	}

}
