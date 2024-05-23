package Day26;

import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class FlipKartGetMethods {

	public static void main(String[] args) throws InterruptedException 
	{
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.flipkart.com/");
		Thread.sleep(5000);
		//get tile
		System.out.println(driver.getTitle());
		System.out.println(driver.getCurrentUrl());
		//System.out.println(driver.getPageSource());
		//String windowid=driver.getWindowHandle();
		//System.out.println("Window id is:"+windowid);
		driver.findElement(By.linkText("Shopsy")).click();
		Set<String> windowids=driver.getWindowHandles();
		System.out.println("Window id is:"+windowids);
       
	}

}
