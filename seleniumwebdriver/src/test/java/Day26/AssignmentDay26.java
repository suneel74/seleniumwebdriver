package Day26;

import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class AssignmentDay26 {

	public static void main(String[] args) throws InterruptedException 
	{
	WebDriver driver=new ChromeDriver();
	driver.manage().window().maximize();
	//getUrl
	driver.get("https://testautomationpractice.blogspot.com/");
	Thread.sleep(5000);
	//GetTitel
	//System.out.println(driver.getTitle());
	//get currentUrl
	//System.out.println(driver.getCurrentUrl());
	//get source code
	//System.out.println(driver.getPageSource());
	//single window id
	//String windowid=driver.getWindowHandle();
	//System.out.println("Window id is"+windowid);
	//multiple window id
	//driver.findElement(By.linkText("merrymoonmary")).click();
	//Set<String> windowids=driver.getWindowHandles();
	//System.out.println("Windown id is:"+windowids);
	//is displayed
	//WebElement logo=driver.findElement(By.xpath("//img[@class='wikipedia-icon']"));
	//System.out.println("Display status of logo is:"+logo.isDisplayed());
	//boolean status=driver.findElement(By.xpath("//*[@class='wikipedia-icon']")).isDisplayed();
	//System.out.println("Display logo status is:"+status);
	//is eanbled
	//WebElement enable=driver.findElement(By.xpath("//input[@id='name']"));
	//System.out.println("Enable status is:"+enable.isEnabled());
	//boolean status=driver.findElement(By.xpath("//*[@id='name']")).isEnabled();
	//System.out.println("Enable status is:"+status);
	//is selected
	WebElement sunday_r=driver.findElement(By.xpath("//input[@id='sunday']"));
	WebElement monday_r=driver.findElement(By.xpath("//input[@id='monday']"));
	WebElement tuesday_r=driver.findElement(By.xpath("//input[@id='tuesday']"));
	WebElement wednesday_r=driver.findElement(By.xpath("//input[@id='wednesday']"));
	WebElement thursday_r=driver.findElement(By.xpath("//input[@id='thursday']"));
	WebElement friday_r=driver.findElement(By.xpath("//input[@id='friday']"));
	WebElement saturday_r=driver.findElement(By.xpath("//input[@id='saturday']"));
	System.out.println("Befoore selection....");
	System.out.println(sunday_r.isSelected());
	System.out.println(monday_r.isSelected());
	System.out.println(tuesday_r.isSelected());
	System.out.println(wednesday_r.isSelected());
	System.out.println(thursday_r.isSelected());
	System.out.println(friday_r.isSelected());
	System.out.println(saturday_r.isSelected());
	System.out.println("After selecting Friday...");
	friday_r.click();
	saturday_r.click();
	tuesday_r.click();
	System.out.println(sunday_r.isSelected());
	System.out.println(monday_r.isSelected());
	System.out.println(tuesday_r.isSelected());
	System.out.println(wednesday_r.isSelected());
	System.out.println(thursday_r.isSelected());
	System.out.println(friday_r.isSelected());
	System.out.println(saturday_r.isSelected());
	
	
	
	
	
	
	}

}
