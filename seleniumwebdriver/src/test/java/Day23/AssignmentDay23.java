package Day23;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class AssignmentDay23 {

	public static void main(String[] args) 
	{
		WebDriver driver=new ChromeDriver();
		driver.get("https://demo.opencart.com/");
		driver.manage().window().maximize();
		//by using tag id
		//driver.findElement(By.cssSelector("body#logo")).sendKeys("MacBook");
		
		//by using class Name
		//driver.findElement(By.cssSelector("input.form-control")).sendKeys("software");
		//driver.findElement(By.cssSelector(".form-control")).sendKeys("Laptops&Notebooks");
		//by using tag Attribute
		//driver.findElement(By.cssSelector("input[placeholder='Search']")).sendKeys("MacBook");
		//driver.findElement(By.cssSelector("[placeholder=\"Search\"]")).sendKeys("Software");
		//by using tag class Name atttribute
		//driver.findElement(By.cssSelector("input.form-control[placeholder='Search']")).sendKeys("MacBook");
		//driver.findElement(By.cssSelector(".form-control[placeholder=\"Search\"]")).sendKeys("Software");
		
	}

}
