package Day26;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Exampls {

	public static void main(String[] args) 
	{
    WebDriver driver=new ChromeDriver();
    driver.manage().window().maximize();
    driver.get("https://testautomationpractice.blogspot.com/");
    WebElement male_r=driver.findElement(By.xpath("//input[@id='male']"));
    WebElement female_r=driver.findElement(By.xpath("//input[@id='female']"));
    System.out.println("Before selection...");
    System.out.println(male_r.isSelected());
    System.out.println(female_r.isSelected());
    System.out.println("After male selection...");
    female_r.click();
    System.out.println(male_r.isSelected());
    System.out.println(female_r.isSelected());
    

    

    
    
	}

}
