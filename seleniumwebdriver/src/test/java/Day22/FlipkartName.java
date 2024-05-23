package Day22;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class FlipkartName {

	public static void main(String[] args) 
	{
	WebDriver driver=new ChromeDriver();
	driver.get("https://www.flipkart.com/");
	//WebElement flip_name=driver.findElement(By.name("q"));
	//flip_name.sendKeys("Grocery");
	driver.findElement(By.name("q")).sendKeys("Grocery");
	

	}

}
