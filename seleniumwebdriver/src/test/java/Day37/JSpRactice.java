package Day37;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class JSpRactice {

	public static void main(String[] args) 
	{
	WebDriver driver=new ChromeDriver();
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
	driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
	driver.manage().window().maximize();
	driver.findElement(By.xpath("input[@placeholder='Username']")).sendKeys("Admin");
    driver.findElement(By.xpath("//input[@placeholder='Password']")).sendKeys("admin123");
    /*WebElement us=driver.findElement(By.xpath("input[@placeholder='Username']"));
	WebElement pw=driver.findElement(By.xpath("//input[@placeholder='Password']"));
	JavascriptExecutor js=(JavascriptExecutor)driver;
	js.executeScript("arguments[0].setattribute('value','Admin')",us);
	js.executeScript("arguments[0].setattribute('value','admin123')", pw);
	WebElement cl=driver.findElement(By.xpath("//button[normalize-space()='Login']"));
	js.executeScript("arguments[0].click()",cl);
*/
	}

}
