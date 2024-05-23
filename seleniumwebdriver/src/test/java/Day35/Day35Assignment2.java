package Day35;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Day35Assignment2 {

	public static void main(String[] args) 
	{
	WebDriver driver=new ChromeDriver();
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
	driver.get("http://demo.guru99.com/test/drag_drop.html");
	driver.manage().window().maximize();
	WebElement bank=driver.findElement(By.xpath("//a[normalize-space()='BANK']"));
	WebElement Acount=driver.findElement(By.xpath("//ol[@id='bank']//li[@class='placeholder']"));
	WebElement amt=driver.findElement(By.xpath("//li[@id='credit3']//a[@class='button button-orange']"));
	WebElement amount=driver.findElement(By.xpath("//ol[@id='amt7']//li[@class='placeholder']"));
	WebElement bank1=driver.findElement(By.xpath("//a[normalize-space()='SALES']"));
	WebElement Acount1=driver.findElement(By.xpath("//ol[@id='loan']//li[@class='placeholder']"));
	WebElement amt5=driver.findElement(By.xpath("//a[normalize-space()='LOAN']"));
	WebElement amount6=driver.findElement(By.xpath("//ol[@id='amt8']//li[@class='placeholder']"));
	Actions act=new Actions(driver);
	act.dragAndDrop(bank, Acount).perform();
	act.dragAndDrop(amt, amount).perform();
	act.dragAndDrop(bank1, Acount1).perform();
	act.dragAndDrop(amt5, amount6).perform();
	

	}

}
