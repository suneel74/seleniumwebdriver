package Day31;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class colorsmultiselectbox {

	public static void main(String[] args) 
	{
    WebDriver driver=new ChromeDriver();
    driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
    driver.get("https://testautomationpractice.blogspot.com/");
    driver.manage().window().maximize();
    WebElement dryoptions=driver.findElement(By.xpath("//*[@id='colors']"));
    Select options=new Select(dryoptions);
    //options.selectByVisibleText("Yellow");
    //options.selectByValue("yellow");
    //options.selectByIndex(4);
    List<WebElement> opt=options.getOptions();
    System.out.println("Avaible colours number:"+opt.size());
    /*for(int i=0;i<opt.size();i++)
    {
    	System.out.println(opt.get(i).getText());
    }*/
    for(WebElement op:opt)
    
    {
    	
    	
    	{
    		op.click();
    	}
    }
	}

}
