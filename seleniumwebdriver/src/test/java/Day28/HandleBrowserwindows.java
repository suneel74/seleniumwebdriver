package Day28;

import java.time.Duration;
import java.util.ArrayList;
import java.util.List;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class HandleBrowserwindows {

	public static void main(String[] args) 
	{
	WebDriver driver=new ChromeDriver();
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
	driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
	driver.manage().window().maximize();
	driver.findElement(By.xpath("//a[normalize-space()='OrangeHRM, Inc']")).click();
	Set<String> windowIds=driver.getWindowHandles();
	List<String> windowlist=new ArrayList(windowIds);
	/*String ParentId=windowlist.get(0);
	String ChildId=windowlist.get(1);
	driver.switchTo().window(ChildId);
	System.out.println(driver.getTitle());
	driver.switchTo().window(ParentId);
	System.out.println(driver.getTitle());*/
	for(String winid:windowIds)
	{
		String title=driver.switchTo().window(winid).getTitle();
		if(title.equals("Human Resources Management Software | OrangeHRM"))
		{
			System.out.println(driver.getCurrentUrl());
		}
			
				
	}
	
	
	
	
	}

}
