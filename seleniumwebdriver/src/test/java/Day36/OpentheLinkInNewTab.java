package Day36;

import java.time.Duration;
import java.util.ArrayList;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class OpentheLinkInNewTab {

	public static void main(String[] args) throws InterruptedException 
	{
	WebDriver driver=new ChromeDriver();
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
	driver.get("https://demo.nopcommerce.com/");
	driver.manage().window().maximize();
	Actions act=new Actions(driver);
	WebElement link=driver.findElement(By.xpath("//a[normalize-space()='Register']"));
	Thread.sleep(5000);
	act.keyDown(Keys.CONTROL).click(link).keyUp(Keys.CONTROL).perform();
	List<String> ids=new ArrayList(driver.getWindowHandles());
	Thread.sleep(5000);
	driver.switchTo().window(ids.get(1));
	driver.findElement(By.xpath("//input[@id='FirstName']")).sendKeys("Suneel");
	driver.switchTo().window(ids.get(0));
	driver.findElement(By.xpath("//input[@id='small-searchterms']")).sendKeys("Mobiles");
	driver.findElement(By.xpath("//button[normalize-space()='Search']")).click();

	}

}
