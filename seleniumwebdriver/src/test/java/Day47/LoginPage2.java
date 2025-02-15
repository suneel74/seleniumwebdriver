package Day47;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;

public class LoginPage2 
{
	WebDriver driver;
	LoginPage2(WebDriver driver)
	{
		this.driver=driver;
		PageFactory.initElements(driver, this);
	}
	//@FindBy(xpath="//input[@placeholder='Username']")
	@FindBy(how=How.XPATH, using="//input[@placeholder='Username']")
	WebElement txt_username;
	//@FindBy(xpath="//input[@placeholder='Password']")
	@FindBy(how=How.XPATH, using="//input[@placeholder='Password']")
	WebElement txt_password;
	//@FindBy(xpath="//button[normalize-space()='Login']")
	@FindBy(how=How.XPATH, using="//button[normalize-space()='Login']")
	WebElement btn_login;
	
	public void SetUsername(String user)
	{
		txt_username.sendKeys(user);
	}
	public void SetPassword(String pwd)
	{
		txt_password.sendKeys(pwd);
	}
	public void clicklogin()
	{
		btn_login.click();
	}

	


}
