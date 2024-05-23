package Day21;

import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.WebDriver;

public class FlipkartLaunch {

	public static void main(String[] args) 
	{
		//EdgeDriver driver=new EdgeDriver();
		WebDriver driver=new EdgeDriver();
		driver.get("https://www.flipkart.com/");
		driver.close();
	}

}
