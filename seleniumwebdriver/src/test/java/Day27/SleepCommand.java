package Day27;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class SleepCommand {

	public static void main(String[] args) throws InterruptedException 
	{
		WebDriver driver=new ChromeDriver();
		driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
		driver.manage().window().maximize();
		Thread.sleep(2000);
		WebElement username=driver.findElement(By.xpath("//input[@placeholder='Username']"));
		WebElement Password=driver.findElement(By.xpath("//*[@placeholder='Password']"));
		WebElement login=driver.findElement(By.xpath("//button[normalize-space()='Login']"));
		JavascriptExecutor js=(JavascriptExecutor)driver;
		js.executeScript("arguments[0].setattribute('value','Admin')", username);
		js.executeScript("arguments[0].setattribute('value','admin123')", Password);
		js.executeScript("arguments[0].click()",login);

	}

}
