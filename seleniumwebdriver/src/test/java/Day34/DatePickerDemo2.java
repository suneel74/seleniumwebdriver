package Day34;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class DatePickerDemo2 {

	public static void main(String[] args) 
	{
    WebDriver driver=new ChromeDriver();
    driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
    driver.get("https://testautomationpractice.blogspot.com/");
    driver.manage().window().maximize();
    String requiredyear="2025";
   /* String requiredmonth="May";
    String requireddate="20";*/
    driver.switchTo().frame("frame-one796456169");
	driver.findElement(By.xpath("//span[@class='icon_calendar']")).click();
	/*WebElement yearDropdown=driver.findElement(By.xpath("//select[@class='ui-datepicker-year']"));
	Select selectyear=new Select(yearDropdown);
	selectyear.selectByVisibleText(requiredyear);
	WebElement yearDropDown=driver.findElement(By.xpath("//select[@class='ui-datepicker-year']"));
	Select selectYear=new Select(yearDropDown);
	selectYear.selectByVisibleText(requiredyear);*/
	

	}

}
