package Day27;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class GmailImplicitWaitCommand {

	public static void main(String[] args) 
	{

    WebDriver driver=new ChromeDriver();
    driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
    driver.get("https://accounts.google.com/v3/signin/identifier?continue=https%3A%2F%2Fmail.google.com%2Fmail%2Fu%2F0%2F&emr=1&followup=https%3A%2F%2Fmail.google.com%2Fmail%2Fu%2F0%2F&osid=1&passive=1209600&service=mail&ifkv=ARZ0qKKa_yh_Yrvuro68-yRVuSt45sRsEaKDlBiIPFw-ulblVBg0mW3S0rCP2YTPbcPdwO3ndEufeQ&theme=mn&ddm=0&flowName=GlifWebSignIn&flowEntry=ServiceLogin");
    driver.manage().window().maximize();
    driver.findElement(By.xpath("//input[@id='identifierId']")).sendKeys("Saisuneel.utk");
    driver.findElement(By.xpath("//span[normalize-space()='Next']")).click();
    driver.findElement(By.xpath("//input[@name='Passwd']")).sendKeys("cherukuri123");
    driver.findElement(By.xpath("//span[normalize-space()='Next']")).click();
	}

}
