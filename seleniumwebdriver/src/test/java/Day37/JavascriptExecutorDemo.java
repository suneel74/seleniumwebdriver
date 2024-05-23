package Day37;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class JavascriptExecutorDemo {

	public static void main(String[] args) 
	{
	WebDriver driver=new ChromeDriver();
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
	driver.get("https://testautomationpractice.blogspot.com/");
	driver.manage().window().maximize();
	WebElement name=driver.findElement(By.xpath("//input[@id='name']"));
	JavascriptExecutor js=(JavascriptExecutor)driver;
	js.executeScript("arguments[0].setAttribute('value','Suneel')",name);
	
	WebElement checkbox=driver.findElement(By.xpath("//input[@id='male']"));
	js.executeScript("arguments[0].click()", checkbox);

	}

}
