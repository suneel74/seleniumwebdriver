package Day22;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class LocatorsDemo1ID {

	public static void main(String[] args) 
	{

     WebDriver driver=new ChromeDriver();
     driver.get("https://demo.opencart.com/");
     WebElement id=driver.findElement(By.id("logo"));
     //boolean status=id.isDisplayed();
     
     boolean status=driver.findElement(By.id("logo")).isDisplayed();
     System.out.println("Display status:"+status);
     
     
    
     
     

	}

}
