package Day26;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class BrowserMethods {

	public static void main(String[] args) throws InterruptedException 
	{
   WebDriver driver=new ChromeDriver();
   driver.manage().window().maximize();
   driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
   Thread.sleep(5000);
   driver.findElement(By.linkText("OrangeHRM, Inc")).click();
   Thread.sleep(5000);
   //driver.close();
   driver.quit();
		  
   
	}

}
