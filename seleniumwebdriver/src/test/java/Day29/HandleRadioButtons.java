package Day29;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class HandleRadioButtons {

	public static void main(String[] args) 
	{
    WebDriver driver=new ChromeDriver();
    driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
    driver.get("https://testautomationpractice.blogspot.com/");
    driver.manage().window().maximize();
    WebElement male_rd=driver.findElement(By.xpath("//input[@id='male']"));
    WebElement female_rs=driver.findElement(By.xpath("//input[@id='female']"));
    System.out.println("Before sellection....");
    System.out.println("Select status of male radio button:"+male_rd.isSelected());
    System.out.println("Select status of female radio button:"+female_rs.isSelected());
    /*male_rd.click();
    System.out.println("After selecting male radio button....");
    System.out.println("Select status of male radio button:"+male_rd.isSelected());
    System.out.println("Select status of female radio button:"+female_rs.isSelected());*/
    female_rs.click();
    System.out.println("After selecting frmale radio button....");
    System.out.println("Select status of male radio button:"+male_rd.isSelected());
    System.out.println("Select status of female radio button:"+female_rs.isSelected());
    
	}

}
