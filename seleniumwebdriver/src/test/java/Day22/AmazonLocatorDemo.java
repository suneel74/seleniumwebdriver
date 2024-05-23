package Day22;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class AmazonLocatorDemo {

	public static void main(String[] args) 
	{
    WebDriver driver=new ChromeDriver();
    driver.get("https://www.amazon.in/");
    driver.manage().window().maximize();
   // WebElement search= driver.findElement(By.name("field-keywords"));
    //search.sendKeys("Air Conditioners");
   // WebElement status=driver.findElement(By.id("twotabsearchtextbox"));
    //boolean status=logo.isDisplayed();
    //boolean status=driver.findElement(By.id("twotabsearchtextbox")).isDisplayed();
    //System.out.println("Display status is:"+status);
   // WebElement Link=driver.findElement(By.linkText("fresh"));
    driver.findElement(By.linkText("fresh")).click();
    
    

	}

}
