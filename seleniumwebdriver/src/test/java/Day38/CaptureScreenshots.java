package Day38;

import java.io.File;
import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class CaptureScreenshots {

	public static void main(String[] args) 
	{
    WebDriver driver=new ChromeDriver();
    driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
    driver.get("https://demo.nopcommerce.com/");
    driver.manage().window().maximize();
    TakesScreenshot ts=(TakesScreenshot)driver;
   /* File Sourcefile=ts.getScreenshotAs(OutputType.FILE);
    File Targetfile=new File(System.getProperty("user.dir")+"\\Screenshots\\fullpage.png");
    Sourcefile.renameTo(Targetfile);
    
    WebElement featureproduct=driver.findElement(By.xpath("//div[@class='product-grid home-page-product-grid']"));
    File Sourcefile=featureproduct.getScreenshotAs(OutputType.FILE);
    File Targetfile=new File(System.getProperty("user.dir")+"\\Screenshots\\featureproduct.png");
    Sourcefile.renameTo(Targetfile);*/
    
    WebElement logo=driver.findElement(By.xpath("//img[@alt='nopCommerce demo store']"));
    File SourceFile=logo.getScreenshotAs(OutputType.FILE);
    File TargetFile=new File(System.getProperty("user.dir")+"\\Screenshots\\logo.png");
    SourceFile.renameTo(TargetFile);
    
	}

}
