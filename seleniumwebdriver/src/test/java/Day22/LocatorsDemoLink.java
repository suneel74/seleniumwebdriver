package Day22;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class LocatorsDemoLink {

	public static void main(String[] args) 
	{
		WebDriver driver=new ChromeDriver();
		driver.get("https://demo.opencart.com/");
		//WebElement link=driver.findElement(By.linkText("Software"));
		//driver.findElement(By.linkText("Software")).click();
		WebElement partial_link=driver.findElement(By.partialLinkText("ware"));
		driver.findElement(By.partialLinkText("ware")).click();
			

	}

}
