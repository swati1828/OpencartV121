package TestCases;

import org.testng.Assert;
import org.testng.annotations.Test;

import PageObjects.HomePage;
import PageObjects.LoginPage;
import PageObjects.MyAccountPage;
import TestBase.BaseClass;

public class TC002_LoginTest extends BaseClass{
	
	@Test(groups={"Sanity","Master"})
	public void verification_of_loginPage()
	{
		try 
		{
		logger.info("******Starting TC002_LoginTest ******");
		
		HomePage hp=new HomePage(driver);
		hp.click_myacc();
		hp.click_login();
		
		logger.info("******Clicked on click_to_login page******");
		
		
		LoginPage lp=new LoginPage(driver);
		
		logger.info("******Providing customer valid email and vaild pwd******");
		lp.set_email(p.getProperty("email"));//it will fatch email from property file
		
		lp.set_pwd(p.getProperty("password"));//it will fatch pwd from property file
		
		lp.click_loginbtn();
		
		MyAccountPage myacc=new MyAccountPage(driver);
		boolean targetPage=myacc.isMyAccountExist();
		
		logger.info("********Validating expected msg*******");
		
           Assert.assertEquals(targetPage, true);
		}
		catch(Exception e)
		{
			Assert.fail();
		}
		
		logger.info("******Finished TC001_AcoountRegistrationTest ******");
	}

}
