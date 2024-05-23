package Day22;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class FlipkartLink {

	public static void main(String[] args) 
	{
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.flipkart.com/");
		//WebElement Link=driver.findElement(By.linkText("Travel"));
		//driver.findElement(By.linkText("Travel")).click();
		WebElement partial_Link=driver.findElement(By.partialLinkText("vel"));
		driver.findElement(By.partialLinkText("vel")).click();
		
		
		

	}

}
