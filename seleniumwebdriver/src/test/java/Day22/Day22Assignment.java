package Day22;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Day22Assignment {

	public static void main(String[] args) 
	{
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.demoblaze.com/index.html");
		//Total Number of links
		//List<WebElement> Links=driver.findElements(By.tagName("a"));
		//System.out.println(Links.size());
		//Total number of images
		//List<WebElement> images=driver.findElements(By.tagName("img"));
		//System.out.println(images.size());
		//Click on Any product link using linkText /partialLinkText
		//WebElement Link_Text=driver.findElement(By.linkText("Monitors"));
		//driver.findElement(By.linkText("Monitors")).click();
		//WebElement Link_Text=driver.findElement(By.partialLinkText("tops"));
		 driver.findElement(By.partialLinkText("Lap")).click();
		
		

	}

}
