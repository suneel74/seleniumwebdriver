package Day34;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Day34Assignment2 {

	public static void main(String[] args) throws InterruptedException 
	{
    WebDriver driver=new ChromeDriver();
    driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
    driver.manage().deleteAllCookies();
    driver.get("https://dummy-tickets.com/buyticket");
    driver.manage().window().maximize();
    driver.findElement(By.xpath("//form[@id='flight_oneway']//div[@class='col-sm-12 p-0 suggestion-container']//input[@name='source[]']")).sendKeys("Hyderabad");
	Thread.sleep(3000);

	}

}
