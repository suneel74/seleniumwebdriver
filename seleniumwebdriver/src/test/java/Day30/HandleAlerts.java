package Day30;

import java.time.Duration;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class HandleAlerts {

	public static void main(String[] args) throws InterruptedException 
	{
    WebDriver driver=new ChromeDriver();
    driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
    driver.get("https://the-internet.herokuapp.com/javascript_alerts");
    driver.manage().window().maximize();
    //Normal Alert with Ok button
   /*driver.findElement(By.xpath("//button[normalize-space()='Click for JS Alert']")).click();
   Thread.sleep(5000);
   driver.switchTo().alert().accept();
   driver.findElement(By.xpath("//button[normalize-space()='Click for JS Alert']")).click();
   Thread.sleep(5000);
   Alert myalert=driver.switchTo().alert();
   myalert.accept();
   driver.switchTo().alert().accept();*/
   //Confirmation alert ok&cancel
  // driver.findElement(By.xpath("//button[normalize-space()='Click for JS Confirm']")).click();
   //Thread.sleep(5000);
   //Alert myalert=driver.switchTo().alert();
   //myalert.accept();
   //myalert.dismiss();
   //driver.switchTo().alert().accept();
   //driver.switchTo().alert().dismiss();
    //Prompt alert- Input box 
    driver.findElement(By.xpath("//button[normalize-space()='Click for JS Prompt']")).click();
    Thread.sleep(5000);
    Alert myalert=driver.switchTo().alert();
    System.out.println("Texr message alert is:"+myalert.getText());
    myalert.sendKeys("Cherukuri Suneel");
    myalert.accept();
    String input=driver.findElement(By.xpath("//p[@id='result']")).getText();
    if(input.equals("Cherukuri Sueel"))
    		{
    	System.out.println("Test passed");
    		}
    else
    {
    	System.out.println("Test fialed");
    }
    
    
    
    
	}

}
