package Day27;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class GmailLogin {

	public static void main(String[] args) throws InterruptedException 
	{
   WebDriver driver=new ChromeDriver();
   driver.get("https://accounts.google.com/v3/signin/identifier?continue=https%3A%2F%2Fmail.google.com%2Fmail%2F%26ogbl%2F&emr=1&ltmpl=default&ltmplcache=2&osid=1&passive=true&rm=false&scc=1&service=mail&ss=1&ifkv=ARZ0qKKJuz5RQw93ZTKF2pxztEa31YKmHU6oEHOZP84uZm8JzSpFLgXRa1uONFah1X_dAMxKDYo43A&theme=mn&ddm=0&flowName=GlifWebSignIn&flowEntry=ServiceLogin");
   driver.manage().window().maximize();
   Thread.sleep(5000);
   driver.findElement(By.xpath("//input[@id='identifierId']")).sendKeys("saisuneel.utk");
   driver.findElement(By.xpath("//*[normalize-space()='Next']")).click();
	}

}
