package Day34;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Day34Assignment1 {
	
	static void selectdate(WebDriver driver, String year,String month,String date)
	{
		//select year
	    WebElement yeardropdown=driver.findElement(By.xpath("//select[@aria-label='Select year']"));
	    Select selectyear=new Select(yeardropdown);
	    selectyear.selectByVisibleText(year);
	    //select month
	    WebElement monthdropdown=driver.findElement(By.xpath("//select[@aria-label='Select month']"));
	    Select selectmonth=new Select(monthdropdown);
	    selectmonth.selectByVisibleText(month);
	    //select date
	    List<WebElement> alldates=driver.findElements(By.xpath("//table[@class='ui-datepicker-calendar']//tbody//tr//td/a"));
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
    driver.get("https://www.dummyticket.com/dummy-ticket-for-visa-application/");
    driver.manage().window().maximize();
    driver.findElement(By.xpath("//input[@id='product_549']")).click();
    driver.findElement(By.xpath("//input[@id='travname']")).sendKeys("Suneel");
    driver.findElement(By.xpath("//input[@id='travlastname']")).sendKeys("Cherukuri");
    String year="2022";
    String month="Aug";
    String date="18";
    driver.findElement(By.xpath("//input[@id='dob']")).click();
    selectdate(driver,year,month,date);
    driver.findElement(By.xpath("//p[@id='dob_field']//span[@class='woocommerce-input-wrapper']")).click();
    driver.findElement(By.xpath("//input[@id='dob']")).click();
    driver.findElement(By.xpath("//textarea[@id='order_comments']")).sendKeys("Wanna see so many countries");
    driver.findElement(By.xpath("//input[@id='sex_1']")).click(); 
    driver.findElement(By.xpath("//input[@id='traveltype_2']")).click();
    driver.findElement(By.xpath("//input[@id='fromcity']")).sendKeys("Hyderabad");
    driver.findElement(By.xpath("//input[@id='tocity']")).sendKeys("Goa");
    driver.findElement(By.xpath("//input[@id='departon']")).click();
    selectdate(driver,year,month,date);
    driver.findElement(By.xpath("//textarea[@id='notes']")).sendKeys("Hi hello buddy");
    driver.findElement(By.xpath("//option[normalize-space()='Expedite passport renewal']")).click();
    driver.findElement(By.xpath("//input[@id='deliverymethod_2']")).click();
    driver.findElement(By.xpath("//input[@id='billname']")).sendKeys("BRC Infra Limited");
    driver.findElement(By.xpath("//input[@id='billing_phone']")).sendKeys("9640895747");
    driver.findElement(By.xpath("//input[@id='billing_email']")).sendKeys("Saisuneel.utk@gmail.com");
    //driver.findElement(By.xpath("//li[@id='select2-billing_country-result-fof3-ER']")).click();
    driver.findElement(By.xpath("//input[@id='billing_address_1']")).sendKeys("Jia Corpo");
    driver.findElement(By.xpath("//input[@id='billing_address_2']")).sendKeys("Web Element");
    driver.findElement(By.xpath("//input[@id='billing_city']")).sendKeys("Hyd");
   
    //driver.findElement(By.xpath("//li[@id='select2-billing_state-result-yx2a-GA']")).click();
    driver.findElement(By.xpath("//input[@id='billing_postcode']")).sendKeys("50089");
	}

}
