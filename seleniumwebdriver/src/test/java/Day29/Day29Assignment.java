package Day29;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Day29Assignment {

	public static void main(String[] args) 
	{
    WebDriver driver=new ChromeDriver();
    driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
    driver.get("https://practice.expandtesting.com/checkboxes");
    driver.manage().window().maximize();
  /* WebElement checkbox= driver.findElement(By.xpath("//input[@id='checkbox1']"));
   System.out.println("Before selection:"+checkbox.isSelected());
   driver.findElement(By.xpath("//input[@id='checkbox1']")).click();
   System.out.println("after selection:"+checkbox.isSelected());*/
    //capture all the check boxes
    List<WebElement> checkboxes=driver.findElements(By.xpath("//*[@class='form-check-input' and @type='checkbox']"));
    System.out.println("Number of checkboxes:"+checkboxes.size());
    /*for(int i=0;i<checkboxes.size();i++)
    {
    	checkboxes.get(i).click();
    }*/
    /*for(WebElement chckbx:checkboxes)
    {
    	if(chckbx.isSelected())
    	{
    		chckbx.click();
    	}
    	else
    	{
    		chckbx.click();
    	}
    }*/
    String checkboxname="Checkbox 1";
    switch(checkboxname)
    {
    case "Checkbox 1": driver.findElement(By.xpath("//input[@id='checkbox1']")).click();
                       break;
    case "Checkbox 2":driver.findElement(By.xpath("//input[@id='checkbox2']")).click();
                       break;
       default:System.out.println("Invalid checkbox");                   
    }
    
  
    
	}

}
