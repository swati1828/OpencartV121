package PageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;


public class HomePage extends BasePage {
	
	public  HomePage(WebDriver driver)
	{
		super(driver);//invoking parent class constructor with super key in child class
	}
	
	@FindBy(xpath="//span[normalize-space()='My Account']")
			WebElement lnk_myacc;
	@FindBy(xpath="//ul[@class='dropdown-menu dropdown-menu-right']//a[normalize-space()='Register']")
	WebElement lnk_register;
	@FindBy(xpath="//a[normalize-space()='Login']")
	WebElement lnk_login;


public void click_myacc()
{
	lnk_myacc.click();
}
public void click_register()
{
	lnk_register.click();
}
public void click_login()
{
	lnk_login.click();
}
}
