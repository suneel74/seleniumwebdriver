package Day27;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class IndigoLogin {

	public static void main(String[] args) throws InterruptedException 
	{
	WebDriver driver=new ChromeDriver();
	driver.get("https://www.facebook.com/login.php/");
	driver.manage().window().maximize();
	Thread.sleep(5000);
	driver.findElement(By.xpath("//input[@id='email']")).sendKeys("saisuneel.utk@gmail.com");
	driver.findElement(By.xpath("//input[@id='pass']")).sendKeys("Password.123");
	driver.findElement(By.xpath("(//button[normalize-space()='Log in'])[1]")).click();

	}

}
