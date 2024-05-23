package Day24;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class AmazonXpathDemo {

	public static void main(String[] args) 
	{
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.amazon.in/");
		//driver.findElement(By.xpath("//input[@type='text']")).sendKeys("Mobiles");
		//driver.findElement(By.xpath("//input[@id='twotabsearchtextbox'][@placeholder='Search Amazon.in']")).sendKeys("Clothes");
		//driver.findElement(By.xpath("//input[@id='twotabsearchtextbox' and @placeholder='Search Amazon.in']" )).sendKeys("Mobile");
		//driver.findElement(By.xpath("//*[@id='twotabsearchtextbox' or @placeholder='Search Amazon.in']")).sendKeys("Laptops");
        driver.findElement(By.xpath("//a[text()='Home & Kitchen']")).click();
	}

}
