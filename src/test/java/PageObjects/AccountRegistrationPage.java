package PageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class AccountRegistrationPage extends BasePage {
	
	public AccountRegistrationPage(WebDriver driver)
	{
		super(driver);
	}
	
	
@FindBy(xpath="//input[@id='input-firstname']")
WebElement txt_Fistname;
@FindBy(xpath="//input[@id='input-lastname']")
WebElement txt_Lastname;
@FindBy(xpath="//input[@id='input-email']")
WebElement txt_email;
@FindBy(xpath="//input[@id='input-telephone']")
WebElement txt_phn;
@FindBy(xpath="//input[@id='input-password']")
WebElement txt_pwd;
@FindBy(xpath="//input[@id='input-confirm']")
WebElement txt_confirmpwd;
@FindBy(xpath="//input[@name='agree']")
WebElement chkd_policy;
@FindBy(xpath="//input[@value='Continue']")
WebElement btn_continue;
@FindBy(xpath="//h1[normalize-space()='Your Account Has Been Created!']")
WebElement txt_confirmMsg;



public void set_Firstname(String fname)
{
	txt_Fistname.sendKeys(fname);
}
public void set_Lastname(String lname)
{
	txt_Lastname.sendKeys(lname);
}
public void set_email(String em)
{
	txt_email.sendKeys(em);
}
public void set_phn(String phn)
{
	txt_phn.sendKeys(phn);
}
public void set_pwd(String pwd)
{
	txt_pwd.sendKeys(pwd);
}
public void set_confirmpwd(String cnmfpwd)
{
	txt_confirmpwd.sendKeys(cnmfpwd);
}
public void click_policy()
{
	chkd_policy.click();
	
}
public void click_continue()
{
	//sol-->1
	btn_continue.click();
	
}
public String getconfirmMsg()
{
	try
	{
		return(txt_confirmMsg.getText());
	}
	catch(Exception e)
	{
		return(e.getMessage());
	}
	
}

}
