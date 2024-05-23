package Day26;

import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;


public class GetMethods {

	public static void main(String[] args) throws InterruptedException 
	{
	WebDriver driver=new ChromeDriver();
	driver.manage().window().maximize();
	driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
	Thread.sleep(5000);
	//System.out.println(driver.getTitle());
	//System.out.println(driver.getCurrentUrl());
	//System.out.println(driver.getPageSource());
	//String Windowid=driver.getWindowHandle();
	//System.out.println("Window id:"+Windowid);
	driver.findElement(By.linkText("OrangeHRM, Inc")).click();
	Set<String> windowids=driver.getWindowHandles();
	System.out.println("Window Id is:"+windowids);
	driver.quit();
	

	}

}
