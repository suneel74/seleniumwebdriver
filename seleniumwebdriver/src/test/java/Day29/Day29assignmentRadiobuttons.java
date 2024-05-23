package Day29;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Day29assignmentRadiobuttons {

	public static void main(String[] args) 
	{
    WebDriver driver=new ChromeDriver();
    driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
    driver.get("https://practice.expandtesting.com/radio-buttons");
    driver.manage().window().maximize();
    List<WebElement> chckbox=driver.findElements(By.xpath("//input[@class='form-check-input' and @name='sport']"));
    System.out.println("Number of raido buttons:"+chckbox.size());
   for(WebElement Radio:chckbox)
    {
    if(Radio.isSelected())
    {
    	Radio.click();
    }
    else
    {
    	Radio.click();
    }
    }
	}

}
