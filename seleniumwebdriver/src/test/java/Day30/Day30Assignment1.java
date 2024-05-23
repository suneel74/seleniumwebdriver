package Day30;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Day30Assignment1 {

	public static void main(String[] args) throws InterruptedException 
	{
    WebDriver driver=new ChromeDriver();
    driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
    driver.get("https://mypage.rediff.com/login/dologin");
    driver.manage().window().maximize();
    //driver.findElement(By.xpath("//input[@value='Login']")).click();
    driver.findElement(By.xpath("//input[@id='captcha']")).sendKeys("Zgjgjg");
    driver.findElement(By.xpath("//input[@value='Login']")).click();
    Thread.sleep(5000);
    driver.switchTo().alert().accept();
	}

}
