package Day30;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Day30Assignment2 {

	public static void main(String[] args) 
	{
    WebDriver driver=new ChromeDriver();
    driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
    driver.get("https://ui.vision/demo/webtest/frames/");
    driver.manage().window().maximize();
    WebElement frame1=driver.findElement(By.xpath("//frame[@src='frame_1.html']"));
    driver.switchTo().frame(frame1);
    driver.findElement(By.xpath("//input[@name='mytext1']")).sendKeys("Welcome");
    driver.switchTo().defaultContent();
    WebElement frame2=driver.findElement(By.xpath("//frame[@src='frame_2.html']"));
    driver.switchTo().frame(frame2);
    driver.findElement(By.xpath("//input[@name='mytext2']")).sendKeys("Suneel");
    driver.switchTo().defaultContent();
    WebElement frame5=driver.findElement(By.xpath("//frame[@src='frame_5.html']"));
    driver.switchTo().frame(frame5);
   driver.findElement(By.xpath("//input[@name='mytext5']")).sendKeys("Selenium");
   //driver.switchTo().defaultContent();
   driver.findElement(By.xpath("//a[@href='https://a9t9.com']")).click();
   WebElement display=driver.findElement(By.xpath("//img[@alt='UI Vision by a9t9 software - Image-Driven Automation']"));
   System.out.println("Logo status is:"+display.isDisplayed());
  
    
    
	

	}

}
