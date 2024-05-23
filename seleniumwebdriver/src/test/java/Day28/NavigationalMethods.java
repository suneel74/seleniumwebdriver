package Day28;

import java.net.MalformedURLException;
import java.net.URL;
import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class NavigationalMethods {

	public static void main(String[] args) throws MalformedURLException 
	{
    WebDriver driver=new ChromeDriver();
    driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
   // driver.navigate().to("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
    URL myurl=new URL("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
    driver.navigate().to(myurl);
    //driver.navigate().to("https://demo.opencart.com/index.php?route=common/home&language=en-gb");
    driver.manage().window().maximize();
   // driver.navigate().back();
   //driver.navigate().forward();
    driver.navigate().refresh();
    

	}

}
