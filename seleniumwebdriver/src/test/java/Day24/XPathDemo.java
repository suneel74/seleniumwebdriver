package Day24;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class XPathDemo {

	public static void main(String[] args) 
	{

   WebDriver driver=new ChromeDriver();
   driver.manage().window().maximize();
   driver.get("https://demo.opencart.com/");
   //driver.findElement(By.xpath("//input[@name='search']")).sendKeys("MacBook");
   //driver.findElement(By.xpath("//*[@name=\"search\"]")).sendKeys("MacBook");
   //driver.findElement(By.xpath("//input[@name='search'][@placeholder='Search']")).sendKeys("Mackbook");
   //driver.findElement(By.xpath("//*[@name=\"search\"][@placeholder=\"Search\"]")).sendKeys("Mackbook");
   //driver.findElement(By.xpath("//input[@name='search' and @placeholder='Search']")).sendKeys("MacBook");
   //driver.findElement(By.xpath("//*[@name=\"search\" and @placeholder=\"Search\"]")).sendKeys("Mackbook");
   //driver.findElement(By.xpath("//input[@name='ytyt' or @placeholder='Search']")).sendKeys("MackBook");
     driver.findElement(By.xpath("//*[@name=\"JHGJH\" or @placeholder=\"Search\"]")).sendKeys("macBook");
	}

}
