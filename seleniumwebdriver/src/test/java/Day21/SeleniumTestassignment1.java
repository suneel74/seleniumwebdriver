package Day21;

import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.WebDriver;

public class SeleniumTestassignment1 {

	public static void main(String[] args) 
	{
		//ChromeDriver driver=new ChromeDriver();
		WebDriver driver=new ChromeDriver();
		driver.get("https://demo.nopcommerce.com/");
		String act_title=driver.getTitle();
		if(act_title.equals("nopCommerce demo store"))
		{
			System.out.println("Test is passed");
		}
		else
		{
			System.out.println("Test is fialed");
		}
		//driver.close();
		driver.quit();
		

	}

}
