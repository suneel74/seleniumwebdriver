package Day21;

import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.WebDriver;

public class FirstTestCase {

	public static void main(String[] args) 
	{
		//ChromeDriver driver=new ChromeDriver();
		WebDriver driver = new ChromeDriver();
		driver.get("https://demo.opencart.com/");
		String act_title=driver.getTitle();
		if(act_title.equals("Your Store"))
		{
			System.out.println("Test is passed");
		}
		else
		{
			System.out.println("Test is failed");
		}
		//driver.close();
		driver.quit();

	}

}
