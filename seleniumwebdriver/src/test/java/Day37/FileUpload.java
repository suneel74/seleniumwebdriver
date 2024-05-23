package Day37;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class FileUpload {

	public static void main(String[] args) 
	{
    WebDriver driver=new ChromeDriver();
    driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
    driver.get("https://davidwalsh.name/demo/multiple-file-upload.php");
    driver.manage().window().maximize();
   /* driver.findElement(By.xpath("//input[@id='filesToUpload']")).sendKeys("D:\\Text");
    if(driver.findElement(By.xpath("//ul[@id='fileList']//li")).getText().equals("Text"))
    {
    	System.out.println("File is successfully uploaded");
    }
    else
    {
    	System.out.println("File upload is failed");
    }*/
    String file1="D:\\Text\\Text1.txt";
    String file2="D:\\Text\\Text2.txt";

    
    driver.findElement(By.xpath("//input[@id='filesToUpload']")).sendKeys(file1+"\n"+file2);
    int nooffileupload=driver.findElements(By.xpath("//ul[@id='fileList']//li")).size();
    if(nooffileupload==2)
    {
    	System.out.println("All files are uploaded");
    }
    else
    {
    System.out.println("Files aare not uploaded");	
    }
    if(driver.findElement(By.xpath("//ul[@id='fileList']//li[1]")).getText().equals("Text1.txt") 
    	&& driver.findElement(By.xpath("//ul[@id='fileList']//li[2]")).getText().equals("Text2.txt"))
    {
    	System.out.println("File name is matching");
    }
    else
    {
    	System.out.println("file not matching");
    }
	}

}
