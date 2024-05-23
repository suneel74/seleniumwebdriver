package Day22;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class FlipkartId {

	public static void main(String[] args) 
	{
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.flipkart.com/");
		WebElement logo=driver.findElement(By.id("container"));
		//boolean status=logo.isDisplayed();
		boolean status=driver.findElement(By.id("container")).isDisplayed();
		System.out.println("Display status is:" +status);

	}

}
