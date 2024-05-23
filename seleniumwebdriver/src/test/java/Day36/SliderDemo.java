package Day36;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class SliderDemo {

	public static void main(String[] args) 
	{
	 WebDriver driver=new ChromeDriver();
	 driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
	 Actions act=new Actions(driver);
	 driver.get("https://www.jqueryscript.net/demo/Price-Range-Slider-jQuery-UI/");
	 driver.manage().window().maximize();
	 /*WebElement min_slider=driver.findElement(By.xpath("//div[@class='price-range-block']//span[1]"));
	 System.out.println("Default location of min slider:"+min_slider.getLocation());
	 act.dragAndDropBy(min_slider, 500, 250).perform();
	 System.out.println("After changing:"+min_slider.getLocation());
	 */
	WebElement max_slider= driver.findElement(By.xpath("//span[2]"));
	System.out.println("Default max slider location:"+max_slider.getLocation());
	act.dragAndDropBy(max_slider, -500, 250).perform();
	System.out.println("After moving:"+max_slider.getLocation());

	}

}
