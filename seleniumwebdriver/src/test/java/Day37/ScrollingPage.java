package Day37;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ScrollingPage {

	public static void main(String[] args) throws InterruptedException 
	{
	WebDriver driver=new ChromeDriver();
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
	driver.get("https://demo.nopcommerce.com/");
	driver.manage().window().maximize();
	JavascriptExecutor js=(JavascriptExecutor)driver;
	js.executeScript("window.scrollBy(0,1500)", "");
	System.out.println(js.executeScript("return window.pageYOffset;"));
	WebElement ele=driver.findElement(By.xpath("//strong[normalize-space()='Community poll']"));
	js.executeScript("arguments[0].scrollIntoView()", ele);
	System.out.println(js.executeScript("return window.pageYOffset;"));
	js.executeScript("window.scrollBy(0,document.body.scrollHeighjt)");
	System.out.println(js.executeScript("return window.pageYOffset;"));
	Thread.sleep(5000);
	js.executeScript("window.scrollBy(0,-document.body.scrollHeight)");
	System.out.println(js.executeScript("return window.pageYOffset;"));
	}

}
