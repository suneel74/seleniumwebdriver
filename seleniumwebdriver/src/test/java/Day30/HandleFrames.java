package Day30;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class HandleFrames {

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
    
    //Frame-2
    WebElement frame2=driver.findElement(By.xpath("//frame[@src='frame_2.html']"));
    driver.switchTo().frame(frame2);
    driver.findElement(By.xpath("//input[@name='mytext2']")).sendKeys("Cherukuru");
    driver.switchTo().defaultContent();
    //frame3
    WebElement frame3=driver.findElement(By.xpath("//frame[@src='frame_3.html']"));
    driver.switchTo().frame(frame3);
    driver.findElement(By.xpath("//input[@name='mytext3']")).sendKeys("Suneel");
    driver.switchTo().frame(0);
    driver.findElement(By.xpath("//div[@id='i8']//div[@class='AB7Lab Id5V1']")).click();
    driver.findElement(By.xpath("//div[@id='i19']//div[@class='uHMk6b fsHoPb']")).click();
    driver.findElement(By.xpath("//div[@id='i22']//div[@class='uHMk6b fsHoPb']")).click();
    driver.findElement(By.xpath("//div[@id='i25']//div[@class='uHMk6b fsHoPb']")).click();
    driver.findElement(By.xpath("//span[contains(text(),'Next')]")).click();
    
	}

}
