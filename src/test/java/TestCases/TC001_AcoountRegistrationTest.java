package TestCases;

import org.testng.Assert;
import org.testng.annotations.Test;

import PageObjects.AccountRegistrationPage;
import PageObjects.HomePage;
import TestBase.BaseClass;

public class TC001_AcoountRegistrationTest extends BaseClass{
	
	@Test(groups={"Regression","Master"})
	public void verification_of_accRegistration()
	{
		try 
		{
		logger.info("******Starting TC001_AcoountRegistrationTest ******");
		HomePage hp=new HomePage(driver);
		hp.click_myacc();
		logger.info("******Clicked on click_myacc******");
		hp.click_register();
		logger.info("******Clicked on click_register******");
		
		AccountRegistrationPage accReg=new AccountRegistrationPage(driver);
		
		logger.info("******Providing customer details******");
		accReg.set_Firstname(randomstring().toUpperCase());
		accReg.set_Lastname(randomstring().toUpperCase());
		accReg.set_email(randomstring()+"@gmail.com");
		accReg.set_phn(randomNumber());
		
		String pass=randomalphanumeric();
		accReg.set_pwd(pass);
		accReg.set_confirmpwd(pass);
		accReg.click_policy();
		accReg.click_continue();
		
		logger.info("********Validating expected msg*******");
		
		String confirmmsg=accReg.getconfirmMsg();
		
		if(confirmmsg.equals("Your Account Has Been Created!"))
		{
			Assert.assertTrue(true);
		}
		else
		{
			
			logger.error("Test failed..");
			logger.debug("Debug logs...");
			Assert.assertTrue(false);
		}
		}
		catch(Exception e)
		{
			
			Assert.fail();
		}
		logger.info("******Finished TC001_AcoountRegistrationTest ******");
	}

}
