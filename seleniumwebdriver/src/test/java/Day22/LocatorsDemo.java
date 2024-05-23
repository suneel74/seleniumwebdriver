package Day22;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class LocatorsDemo {

	public static void main(String[] args) 
	{
		WebDriver driver=new ChromeDriver();
		driver.get("https://demo.opencart.com/");
		//WebElement name_search=driver.findElement(By.name("search"));
		//name_search.sendKeys("Machook");
		//driver.findElement(By.name("search")).sendKeys("MacBook");
		List<WebElement> headerlinks=driver.findElements(By.className("list-unstyled"));
		System.out.println(headerlinks.size());

	}

}
