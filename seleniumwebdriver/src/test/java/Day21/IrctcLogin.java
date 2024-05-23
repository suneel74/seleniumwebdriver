package Day21;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class IrctcLogin {

	public static void main(String[] args) 
	{
    WebDriver driver=new ChromeDriver();
    driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
    driver.get("https://www.irctc.co.in/nget/train-search");
    driver.manage().window().maximize();
    driver.findElement(By.xpath("//a[normalize-space()='LOGIN']")).click();
    driver.findElement(By.xpath("//input[@id='2929072']")).sendKeys("sunee007");
    driver.findElement(By.xpath("//input[@id='1700271']")).sendKeys("suneel9999");
	}

}
