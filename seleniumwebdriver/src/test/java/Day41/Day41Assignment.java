package Day41;

import java.io.IOException;
import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Day41Assignment {

	public static void main(String[] args) throws IOException 
	{
    WebDriver driver=new ChromeDriver();
    driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
    driver.get("https://www.cit.com/cit-bank/resources/calculators/certificate-of-deposit-calculator");
    driver.manage().window().maximize();
    driver.findElement(By.xpath("//input[@id='mat-input-0']")).clear();
    driver.findElement(By.xpath("//input[@id='mat-input-1']")).clear();
    driver.findElement(By.xpath("//input[@id='mat-input-2']")).clear();
    String filepath=System.getProperty("user.dir")+"\\testdata\\caldata2.xlsx";
   int rows= ExcelUtils.getRowCount(filepath, "sheet1");
   for(int i=1;i<=rows;i++)
   {
    String IDA=ExcelUtils.getCellData(filepath, "sheet1", i, 0);
    String LofCD=ExcelUtils.getCellData(filepath, "sheet1", i, 1);
    String IR=ExcelUtils.getCellData(filepath, "sheet1", i, 2);
    String compound=ExcelUtils.getCellData(filepath, "sheet1", i, 3);
    String exp_value=ExcelUtils.getCellData(filepath, "sheet1", i, 4);
    driver.findElement(By.xpath("//input[@id='mat-input-0']")).sendKeys(IDA);
    driver.findElement(By.xpath("//input[@id='mat-input-1']")).sendKeys(LofCD);
    driver.findElement(By.xpath("//input[@id='mat-input-2']")).sendKeys(IR);
    Select cmpdrp=new Select(driver.findElement(By.xpath("//div[@id='mat-select-value-1']")));
    cmpdrp.selectByVisibleText(compound);
    driver.findElement(By.xpath("//button[@id='CIT-chart-submit']")).click();
    
   }
	}

}
