package Day47;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class LoginPage 
{
	//Constructor
	WebDriver Driver;
	LoginPage(WebDriver driver)
	{
		this.Driver=driver;
	}
	//Locator
	By txt_username_loc=By.xpath("//input[@placeholder='Username']");
	By txt_password_loc=By.xpath("//input[@placeholder='Password']");
	By btn_login_loc=By.xpath("//button[normalize-space()='Login']");
	
	//Action Methods.
	public void SetuserName(String user)
	{
		Driver.findElement(txt_username_loc).sendKeys(user);
	}
	public void SetPassword(String pwd)
	{
		Driver.findElement(txt_password_loc).sendKeys(pwd);
	}
	public void clickLogin()
	{
		Driver.findElement(btn_login_loc).click();
	}

}
