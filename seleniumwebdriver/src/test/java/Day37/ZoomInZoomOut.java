package Day37;

import java.time.Duration;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ZoomInZoomOut {

	public static void main(String[] args) throws InterruptedException 
	{
    WebDriver driver=new ChromeDriver();
    driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
    driver.get("https://demo.nopcommerce.com/");
    Thread.sleep(5000);
    driver.manage().window().minimize();
    Thread.sleep(5000);
    driver.manage().window().maximize();
    Thread.sleep(5000);
    JavascriptExecutor js=(JavascriptExecutor)driver;
    js.executeScript("document.body.style.zoom='80%'");
    Thread.sleep(5000);
    
	}

}
