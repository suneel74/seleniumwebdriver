package Day26;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ConditionalMethods {

	public static void main(String[] args) 
	{

    WebDriver driver=new ChromeDriver();
    driver.manage().window().maximize();
    driver.get("https://demo.nopcommerce.com/register");
    //System.out.println(driver.getTitle());
   // WebElement logo=driver.findElement(By.xpath("//img[@alt='nopCommerce demo store']"));
    //System.out.println("Display status of logo:"+logo.isDisplayed());
   // boolean status=driver.findElement(By.xpath("//img[@alt='nopCommerce demo store']")).isDisplayed();
   // System.out.println("Display logo status is:"+status);
    //is enabled
    //WebElement enable=driver.findElement(By.xpath("//input[@id='small-searchterms']"));
    //System.out.println("Enable ststus is:"+enable.isDisplayed());
    //boolean status=driver.findElement(By.xpath("//input[@id='small-searchterms']")).isDisplayed();
    //System.out.println("Enable status is:"+status);
    WebElement male_rd=driver.findElement(By.xpath("//input[@id='gender-male']"));
    WebElement female_rd=driver.findElement(By.xpath("//input[@id='gender-female']"));
    //System.out.println("Before selecton.....");
    //System.out.println(male_rd.isSelected());
    //System.out.println(female_rd.isSelected());
    
    //System.out.println("after selecting male...");
    //male_rd.click();
    //System.out.println(male_rd.isSelected());
    //System.out.println(female_rd.isSelected());
   //System.out.println("after selecting female...");
   //female_rd.click();
   //System.out.println(male_rd.isSelected());
   //System.out.println(female_rd.isSelected());
    boolean Newsletterstatus=driver.findElement(By.xpath("//input[@id='Newsletter']")).isSelected();
    System.out.println("News letter check box status:"+Newsletterstatus);

	}

}
