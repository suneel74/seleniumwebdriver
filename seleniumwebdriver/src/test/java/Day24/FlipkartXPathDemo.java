package Day24;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class FlipkartXPathDemo {

	public static void main(String[] args) 
	{
    WebDriver driver=new ChromeDriver();
    driver.manage().window().maximize();
    driver.get("https://www.flipkart.com/");
    //xpath with Single attribute 
   //driver.findElement(By.xpath("//input[@class='Pke_EE']")).sendKeys("Electronics");
    //driver.findElement(By.xpath("//*[@class=\"Pke_EE\"]")).sendKeys("Refridgerators");
    //xpath with multiple attributes
    //driver.findElement(By.xpath("//input[@class='Pke_EE'][@placeholder='Search for Products, Brands and More'][@name='q']")).sendKeys("Sarees");
	//driver.findElement(By.xpath("//*[@class=\"Pke_EE\"][@placeholder=\"Search for Products, Brands and More\"]")).sendKeys("Mens wear");
   // Xpath using And operator
   //driver.findElement(By.xpath("//input[@class='Pke_EE' and @placeholder='Search for Products, Brands and More']")).sendKeys("Mobiles");
    //driver.findElement(By.xpath("//*[@class=\"Pke_EE\" and @placeholder=\"Search for Products, Brands and More\"]")).sendKeys("Chargers");
    //xpath using or operator
    //driver.findElement(By.xpath("//input[@class='Pke_EE' or @placeholder='KKK']")).sendKeys("Tvs");
   // driver.findElement(By.xpath("//*[@class=\"Pke_E\" or @placeholder=\"Search for Products, Brands and More\"]")).sendKeys("Pens");
    driver.findElement(By.xpath("//a[text()='Grocery']")).click();
	}
	

}
