package PageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class LoginPage extends BasePage {
	
	public LoginPage(WebDriver driver)
	{
		super(driver);
	}

	@FindBy(xpath="//input[@id='input-email']")
	WebElement txt_email;
	@FindBy(xpath="//input[@id='input-password']")
	WebElement txt_pwd;
	@FindBy(xpath="//input[@value='Login']")
	WebElement btn_login;
	
	
public void set_email(String em)
{
	txt_email.sendKeys(em);
	
}
public void set_pwd(String pwd)
{
	txt_pwd.sendKeys(pwd);
	
}
public void click_loginbtn()
{
	btn_login.click();
	
}

}