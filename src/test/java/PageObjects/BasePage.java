package PageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;

//this class will be parent class for all page object classes(only constructor will be here )
public class BasePage {
	
	WebDriver driver;
	
	public  BasePage(WebDriver driver)
	{
		this.driver=driver;//this keyword always comes with class variable/object
		
		PageFactory.initElements(driver,this);
	}

}
