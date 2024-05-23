package Day29;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class HandleCheckBox 
{

	public static void main(String[] args) 
	{
    WebDriver driver=new ChromeDriver();
    driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
    driver.get("https://testautomationpractice.blogspot.com/");
    driver.manage().window().maximize();
    //select check box
    WebElement checkbox=driver.findElement(By.xpath("//input[@id='sunday']"));
    System.out.println("Before selection:"+checkbox.isSelected());
    driver.findElement(By.xpath("//input[@class='form-check-input']")).click();
    System.out.println("After selection:"+checkbox.isSelected());
    //Capturing all checkboxes
    List<WebElement> checkboxes=driver.findElements(By.xpath("//input[@class='form-check-input' and @type='checkbox']"));
    System.out.println("Number of checkboxes:"+checkboxes.size());
    //select all the checkboxes
    /*for(int i=0;i<checkboxes.size();i++)
    {
    	checkboxes.get(i).click();
    }*/
    /*for(WebElement chkbx:checkboxes)
    {
    chkbx.click();	
    }*/
    // select last 3 check box
   /* for(int i=4;i<checkboxes.size();i++)
    {
    	checkboxes.get(i).click();
    }*/
    for(int i=0;i<4;i++)
    {
    	checkboxes.get(i).click();
    }
    //select/unselect
    for(WebElement chkxb:checkboxes)
    {
    	if(chkxb.isSelected())
    	{
    		chkxb.click();
    	}
    	else
    	{
    		chkxb.click();
    	}
    }
	}
}
	


