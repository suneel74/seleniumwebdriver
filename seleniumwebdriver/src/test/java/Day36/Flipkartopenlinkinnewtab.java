package Day36;

import java.time.Duration;
import java.util.ArrayList;
import java.util.List;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Flipkartopenlinkinnewtab {

	public static void main(String[] args) 
	{
	WebDriver driver=new ChromeDriver();
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
	driver.get("https://www.flipkart.com/");
	driver.manage().window().maximize();
	WebElement app=driver.findElement(By.xpath("//span[@class='_1XjE3T']//span[contains(text(),'Appliances')]"));
	Actions act=new Actions(driver);
	act.keyDown(Keys.CONTROL).click(app).keyUp(Keys.CONTROL).perform();
	WebElement fli=driver.findElement(By.xpath("//a[normalize-space()='Flights']"));
    act.keyDown(Keys.CONTROL).click(fli).keyUp(Keys.CONTROL).perform();
    List<String> ids=new ArrayList(driver.getWindowHandles());
    driver.switchTo().window(ids.get(2));
    
	}

}
