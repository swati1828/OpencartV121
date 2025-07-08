package TestCases;

import org.testng.Assert;
import org.testng.annotations.Test;

import PageObjects.HomePage;
import PageObjects.LoginPage;
import PageObjects.MyAccountPage;
import TestBase.BaseClass;
import UtilityFiles.DataProviders;



public class TC003_LoginDDT extends BaseClass {
	
	@Test(dataProvider="LoginData",dataProviderClass=DataProviders.class,groups={"Datadriven"})
	public void verify_loginDDT(String email,String pwd,String exp)
	{
		logger.info("********Satrting TC003_LoginDDT*****");
		//HomePage
        try 
        {
		HomePage hp=new HomePage(driver);
		hp.click_myacc();
		hp.click_login();
		
		//LoginPage
		
        LoginPage lp=new LoginPage(driver);
		lp.set_email(email);//it will fatch email from property file
		lp.set_pwd(pwd);//it will fatch pwd from property file
		lp.click_loginbtn();
		
		//MyAccountPage
		MyAccountPage myacc=new MyAccountPage(driver);
		boolean targetPage=myacc.isMyAccountExist();
		
		
		/*Data is valid  - login success - test pass  - logout
		                   login failed - test fail

		Data is invalid - login success - test fail  - logout
		                  login failed - test pass
		*/
		
		if(exp.equalsIgnoreCase("Valid"))
		{
			if(targetPage==true)
			{
				myacc.click_logOut();
				Assert.assertTrue(true);
			}
			else
			{
				Assert.assertTrue(false);
			}
		}
		else if(exp.equalsIgnoreCase("InValid"))
		{
			if(targetPage==true)
			{
				myacc.click_logOut();
				Assert.assertTrue(false);
			}
			else
			{
				Assert.assertTrue(true);
			}
		}
        }
        catch(Exception e)
        {
        	Assert.fail();
        }
		logger.info("******* Finished TC003_LoginDDT***********");
	}

}
