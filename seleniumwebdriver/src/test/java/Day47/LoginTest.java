package Day47;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class LoginTest 
{
	WebDriver driver;
	@BeforeClass
	void setup()
	{
	driver= new ChromeDriver();
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
	driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
	driver.manage().window().maximize();
	}
	@Test
	void testLogin()
	{
		LoginPage2 lp=new LoginPage2(driver);	
		lp.SetUsername("Admin");
		lp.SetPassword("admin123");
		lp.clicklogin();
		Assert.assertEquals(driver.getTitle(), "OrangeHRM");
		
	}
	@AfterClass
	void tearDown()
	{
		driver.quit();
	}

}
