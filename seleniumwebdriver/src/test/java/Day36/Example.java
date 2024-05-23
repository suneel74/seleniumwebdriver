package Day36;

import java.time.Duration;
import java.util.ArrayList;
import java.util.List;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WindowType;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Example {

	public static void main(String[] args) 
	{
	WebDriver driver=new ChromeDriver();
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
	driver.get("https://www.flipkart.com/");
	driver.switchTo().newWindow(WindowType.WINDOW);
	driver.get("https://www.amazon.in/");
	driver.switchTo().newWindow(WindowType.WINDOW);	driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
	List<String> ids=new ArrayList(driver.getWindowHandles());
	driver.switchTo().window(ids.get(0));

	}

}
