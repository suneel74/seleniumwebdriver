package Day22;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class FlipkartClassName {

	public static void main(String[] args) 
	{
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.flipkart.com/");
		//List<WebElement> flip_link=driver.findElements(By.className("jF78FJ"));
		//System.out.println(flip_link.size());
		//List<WebElement> flip_tag=driver.findElements(By.tagName("a"));
		//System.out.println(flip_tag.size());
List<WebElement> flip_image=driver.findElements(By.tagName("img"));
System.out.println(flip_image.size());
	}

}
