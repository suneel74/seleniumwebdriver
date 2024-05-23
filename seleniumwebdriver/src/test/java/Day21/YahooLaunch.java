package Day21;

import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.WebDriver;

public class YahooLaunch {

	public static void main(String[] args) 
	{
	//EdgeDriver driver=new EdgeDriver();
	WebDriver driver=new EdgeDriver();
	driver.get("https://www.amazon.in/minitv?ref_=nav_avod_desktop_topnav/");
	driver.quit();
	

	}

}
