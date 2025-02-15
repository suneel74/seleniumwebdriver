package Day31;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Day31Assignment1 {

	public static void main(String[] args) 
	{
    WebDriver driver=new ChromeDriver();
    driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
    driver.get("https://phppot.com/demo/jquery-dependent-dropdown-list-countries-and-states/");
    driver.manage().window().maximize();
    WebElement drycountry=driver.findElement(By.xpath("//select[@id='country-list']"));
    Select country=new Select(drycountry);
    //country.selectByVisibleText("Brazil");
    //country.selectByValue("3");
   List<WebElement> options= country.getOptions();
   System.out.println("Total number of options:"+options.size());
 /*  for(int i=0;i<options.size();i++)
   {
	   System.out.println(options.get(i).getText());
   }*/
   for(WebElement op:options)
   {
	   System.out.println(op.getText());
   }
    
    
    		}

}
