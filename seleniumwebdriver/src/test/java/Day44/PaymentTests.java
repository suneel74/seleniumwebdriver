package Day44;

import org.testng.annotations.Test;

public class PaymentTests 
{
	@Test(priority=1,groups= {"sanity","regression","functional"})
	void paymentinRupess()
	{
		System.out.println("Payment in rupess");
		
	}
	@Test(priority=2,groups= {"sanity","regression","functional"})
	void paymentDollars()
	{
		System.out.println("payment in dollors");
	}
	

}
