package Day34;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class DayPickerDemo1 {
	
	static void selectFutureMonthAndyear(WebDriver driver,String year, String month, String date)
	{
	//select month & year
    while(true)
    {
    	String currentMonth=driver.findElement(By.xpath("//span[@class='ui-datepicker-month']")).getText();
    	String CurrentYear=driver.findElement(By.xpath("//span[@class='ui-datepicker-year']")).getText();
    	if(currentMonth.equals(month)&& CurrentYear.equals(year))
    	{
    		break;
    	}
    	driver.findElement(By.xpath("//span[@class='ui-icon ui-icon-circle-triangle-e']")).click();
    	//driver.findElement(By.xpath("//span[@class='ui-icon ui-icon-circle-triangle-w']")).click();
    }
		//select date
		List<WebElement> alldates=driver.findElements(By.xpath("//*[@class='ui-datepicker-calendar']//tbody//tr//td/a"));
	    for(WebElement dt:alldates)
	    {
	    	if(dt.getText().equals(date))
	    	{
	    		dt.click();
	    		break;
	    	}
	    }	
	}
	
	static void selectPastMonthAndyear(WebDriver driver,String year, String month, String date)
	{
	//select month & year
    while(true)
    {
    	String currentMonth=driver.findElement(By.xpath("//span[@class='ui-datepicker-month']")).getText();
    	String CurrentYear=driver.findElement(By.xpath("//span[@class='ui-datepicker-year']")).getText();
    	if(currentMonth.equals(month)&& CurrentYear.equals(year))
    	{
    		break;
    	}
    	driver.findElement(By.xpath("//span[@class='ui-icon ui-icon-circle-triangle-w']")).click();
    }
		//select date
		List<WebElement> alldates=driver.findElements(By.xpath("//*[@class='ui-datepicker-calendar']//tbody//tr//td/a"));
	    for(WebElement dt:alldates)
	    {
	    	if(dt.getText().equals(date))
	    	{
	    		dt.click();
	    		break;
	    	}
	    }	
	}
	
public static void main(String[] args) 
	{
    WebDriver driver=new ChromeDriver();
    driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
    driver.get("https://jqueryui.com/datepicker/");
    driver.manage().window().maximize();
    driver.switchTo().frame(0);
    //Method1 using sendkeys
    driver.findElement(By.xpath("//*[@id='datepicker']")).sendKeys("04/08/2025");
    //Using date picker
    driver.findElement(By.xpath("//input[@id='datepicker']")).click();
    //selectFutureMonthAndyear(driver,"2025","April","18");
    selectPastMonthAndyear(driver,"2022","April","18");
    
    
    
    
	}

}
