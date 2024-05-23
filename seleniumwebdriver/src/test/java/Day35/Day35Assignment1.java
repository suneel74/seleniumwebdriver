package Day35;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Day35Assignment1 {

	public static void main(String[] args) 
	{
    WebDriver driver=new ChromeDriver();
    driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
    driver.get("https://testautomationpractice.blogspot.com/");
    driver.manage().window().maximize();
   /*WebElement box1=driver.findElement(By.xpath("//input[@id='field1']"));
   WebElement box2=driver.findElement(By.xpath("//input[@id='field2']"));
   WebElement button=driver.findElement(By.xpath("//button[normalize-space()='Copy Text']"));
   Actions act=new Actions(driver);
   box1.clear();
   box1.sendKeys("SUNEEL");
   act.doubleClick(button).perform();
   String text=box2.getAttribute("value");
   if(text.equalsIgnoreCase("Vinay"))
   {
	   System.out.println("Matched");
   }
   else
   {
	   System.out.println("Not matched");
   }*/
    WebElement text1=driver.findElement(By.xpath("//div[@id='draggable']"));
    WebElement text2=driver.findElement(By.xpath("//div[@id='droppable']"));
    Actions act=new Actions(driver);
    act.dragAndDrop(text1, text2).perform();
    
    }

}
