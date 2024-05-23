package Day32;

import java.time.Duration;
import java.util.Arrays;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Day32Assignment {

	public static void main(String[] args) throws InterruptedException 
	{
	 WebDriver driver=new ChromeDriver();
	 driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
	 driver.get("https://blazedemo.com/");
	 driver.manage().window().maximize();
	 driver.findElement(By.xpath("//select[@name='fromPort']")).sendKeys("Boston");
	 driver.findElement(By.xpath("//select[@name='toPort']")).sendKeys("Rome");
	 driver.findElement(By.xpath("//input[@value='Find Flights']")).click();
	int rows=driver.findElements(By.xpath("//table[@class='table']//tbody//tr")).size();
    System.out.println("Number of rows:"+rows );
    String priceArr[]=new String[rows];
    for(int r=1;r<=rows;r++)
    {
    	String price=driver.findElement(By.xpath("//table[@class='table']//tbody//tr["+r+"]/td[6]")).getText();
    	priceArr[r-1]=price;
    }
    for(String arrvalue:priceArr)
    {
    	System.out.println(arrvalue);
    }
	 Arrays.sort(priceArr);
	 String lowestPrice=priceArr[0];
	 System.out.println("Low price:"+lowestPrice);
	 for(int r=1;r<=rows;r++)
	 {
		String price=driver.findElement(By.xpath("//table[@class='table']//tbody//tr["+r+"]/td[6]")).getText();
		if(price.equals(lowestPrice))
		{
			driver.findElement(By.xpath("//table[@class='table']//tbody//tr["+r+"]/td[1]//input")).click();
			break;
		}
		
				
		
	 }
	 Thread.sleep(5000);
	driver.findElement(By.xpath("//input[@id='inputName']")).sendKeys("Cherukur");
	driver.findElement(By.xpath("//input[@id='address']")).sendKeys("Manikonda");
	driver.findElement(By.xpath("//input[@id='city']")).sendKeys("Hyderabad");
	driver.findElement(By.xpath("//input[@id='zipCode']")).sendKeys("500089");
	driver.findElement(By.xpath("//select[@id='cardType']")).sendKeys("American Express");
	driver.findElement(By.xpath("//input[@id='creditCardMonth']")).sendKeys("11");
	driver.findElement(By.xpath("//input[@id='creditCardYear']")).sendKeys("2024");
	driver.findElement(By.xpath("//input[@id='rememberMe']")).click();
	driver.findElement(By.xpath("//input[@value='Purchase Flight']")).click();
	String msg= driver.findElement(By.xpath("//h1[normalize-space()='Thank you for your purchase today!']")).getText();
	if(msg.equals("Thank you for your purchase today!"))
			{
		System.out.println("Sucess !! passed");
			}
	else
	{
		System.out.println("failed");
	}
	driver.quit();
	 

	}

}
