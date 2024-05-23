package Day31;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Day31assignmentwithoutusingselectclass {

	public static void main(String[] args) 
	{
    WebDriver driver=new ChromeDriver();
    driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
    driver.get("https://phppot.com/demo/jquery-dependent-dropdown-list-countries-and-states/");
    driver.manage().window().maximize();
    WebElement options=driver.findElement(By.xpath("//select[@id='country-list']"));
    System.out.println("number of list:"+options.getSize());
	}

}
