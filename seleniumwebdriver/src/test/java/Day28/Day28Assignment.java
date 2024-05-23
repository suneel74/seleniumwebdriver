package Day28;

import java.time.Duration;
import java.util.List;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Day28Assignment {

	public static void main(String[] args) 
	{
		WebDriver driver=new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.get("https://testautomationpractice.blogspot.com/");
		driver.manage().window().maximize();
		driver.findElement(By.xpath("//input[@id='Wikipedia1_wikipedia-search-input']")).sendKeys("testing");
		driver.findElement(By.xpath("//input[@type='submit']")).click();
		List<WebElement> searchlinks=driver.findElements(By.xpath("//div[@id='Wikipedia1_wikipedia-search-results']//div/a"));
		System.out.println("Number of linke:"+searchlinks.size());
		System.out.println("Printing and Clicking link.....");
		for(WebElement link:searchlinks)
		{
			System.out.println(link.getText());
			link.click();
		}
       Set<String> windowids=driver.getWindowHandles();
       System.out.println("Switchin to each browser window and getting titles....");
       for(String winid:windowids)
       {
    	   String tile=driver.switchTo().window(winid).getTitle();
    	   System.out.println(tile);
    	   if(tile.equals("Testing and inspection of diving cylinders - Wikipedia"))
    	   {
    		  driver.close(); 
    	   }
       }
	}
		

	}


