package Day35;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class DragAndDropAction {

	public static void main(String[] args) {
	WebDriver driver=new ChromeDriver();
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
	driver.get("http://www.dhtmlgoodies.com/scripts/drag-drop-custom/demo-drag-drop-3.html");
	driver.manage().window().maximize();
	WebElement Capital=driver.findElement(By.xpath("//div[@id='box2']"));
	WebElement Country=driver.findElement(By.xpath("//div[@id='box101']"));
	Actions act=new Actions(driver);
	act.dragAndDrop(Capital, Country).perform();

	}

}
