package Day26;

import java.time.Duration;
import java.util.NoSuchElementException;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.FluentWait;
import org.openqa.selenium.support.ui.Wait;

import com.google.common.base.Function;

public class FlipkartConditional {

	public static void main(String[] args) throws InterruptedException 
	{
	WebDriver driver=new ChromeDriver();
	driver.manage().window().maximize();
	driver.get("https://www.flipkart.com/");
	Thread.sleep(5000);
	//WebElement logo=driver.findElement(By.xpath("//img[@title='Flipkart']"));
	//System.out.println("Display status of logo:"+logo.isDisplayed());
	//boolean status=driver.findElement(By.xpath("//img[@title='Flipkart']")).isDisplayed();
	//System.out.println("Display status of logo:"+status);
	
	/*Wait<WebDriver> wait = new FluentWait<WebDriver>(driver)
		       .withTimeout(Duration.ofSeconds(10))
		       .pollingEvery(Duration.ofSeconds(5))
		       .ignoring(NoSuchElementException.class);

		   WebElement foo = wait.until(new Function<WebDriver, WebElement>() {
		     public WebElement apply(WebDriver driver) {
		       return driver.findElement(By.id("foo"));
		     }
		   });*/
		   
		   /*Wait<WebDriver> wait=new FluentWait<WebDriver>(driver)
				   .withTimeout(Duration.ofSeconds(10))
				   .pollingEvery(Duration.ofSeconds(5))
				   .ignoring(NoSuchElementException.class);*/
		   
		  
			   
		   
		   
		   
	
	

	}

}
