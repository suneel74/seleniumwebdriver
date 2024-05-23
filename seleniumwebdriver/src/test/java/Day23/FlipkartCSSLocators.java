package Day23;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class FlipkartCSSLocators {

	public static void main(String[] args) 
	{

    WebDriver driver=new ChromeDriver();
    driver.get("https://www.flipkart.com/");
    driver.manage().window().maximize();
   // driver.findElement(By.cssSelector("input.Pke_EE")).sendKeys("Phones");
    driver.findElement(By.cssSelector(".B_NuCI")).sendKeys("Iphone 14plus");
    
   // driver.findElement(By.cssSelector("input[name='q']")).sendKeys("T Shirts");
    //driver.findElement(By.cssSelector("[placeholder='Search for Products, Brands and More']")).sendKeys("Ladies wear");
    //driver.findElement(By.cssSelector("input.Pke_EE[name='q']")).sendKeys("Laptops");
    //driver.findElement(By.cssSelector(".Pke_EE[placeholder=\"Search for Products, Brands and More\"]")).sendKeys("Chargers");
    

	}

}
