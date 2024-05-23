package Day23;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class IndigoAirlineCSSLocatorsDemo {

	public static void main(String[] args) 
	{
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.amazon.in/");
		driver.manage().window().maximize();
		//driver.findElement(By.cssSelector("input#twotabsearchtextbox")).sendKeys("Laptops&mobiles");
		//driver.findElement(By.cssSelector("#twotabsearchtextbox")).sendKeys("Laptops&mobiles");
	//driver.findElement(By.cssSelector("input.nav-input")).sendKeys("T shirts");
	//driver.findElement(By.cssSelector("input[placeholder='Search Amazon.in']")).sendKeys("Refridgerators");
	driver.findElement(By.cssSelector("input.nav-input[aria-label='Search Amazon.in']")).sendKeys("Jockey");
	}

}
