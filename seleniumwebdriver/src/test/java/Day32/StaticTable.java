package Day32;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class StaticTable {

	public static void main(String[] args) 
	{
     WebDriver driver=new ChromeDriver();
     driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
     driver.get("https://testautomationpractice.blogspot.com/");
     driver.manage().window().maximize();
     //1) find total number of rows in a table
     int rows=driver.findElements(By.xpath("//table[@name='BookTable']//th")).size();
     System.out.println("Number of rows:"+rows);
     //2) find total number of columns in a table
    int col= driver.findElements(By.xpath("//table[@name='BookTable']//tr")).size();
    System.out.println("Number of colums:"+col);
	//3) Read data from specific row and column (ex: 5th row and 1st colum)
    String Bookname=driver.findElement(By.xpath("//table[@name='BookTable']//tr[5]//td[1]")).getText();
    System.out.println("Book name is:"+Bookname);
    //String Authorname=driver.findElement(By.xpath("//table[@name='BookTable']//tr[5]//td[2]")).getText();
    //System.out.println("Book name is:"+Authorname);
  //4) read data from all the rows and colums
    //System.out.println("BookName"+"\t"+"Author"+"\t"+"Subject"+"\t"+"Price");
    System.out.println("BookName"+"\t"+"Author"+"\t"+"Subject"+"\t"+"Price");
	
	for(int r=2;r<=rows;r++)
	{
		for(int c=1;c<=col;c++)
		{
		String value=driver.findElement(By.xpath("//table[@name='BookTable']//tr["+r+"]//td["+c+"]")).getText();
		System.out.print(value+"\t");
		}
		System.out.println();
	}

	}

}
