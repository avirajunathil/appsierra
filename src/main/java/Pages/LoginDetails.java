package Pages;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import commons.BasePage;

public class LoginDetails extends BasePage {


	 @FindBy(xpath = "//input[@id='register-email']")
	    WebElement username;
	    
	    @FindBy(xpath = "//input[@id='register-password']")
	    WebElement password;
	    
	    @FindBy(css = "#LoginButton")
	    WebElement Click;
	    
	    private static final Logger lOGGER = LogManager.getLogger(HomePage.class.getName());

	    

		public LoginDetails(WebDriver driver) {
			super(driver);		}
		
		public void getUsername() {
	    	wait.forPage();
	    	sendKeys(username, "pavirajuv@gmail.com");
	    }
	    
	    public void getPassword() {
	    	wait.forPage();
	    	sendKeys(password, "aviraj123");
	    }
	    public void onClick() {
	    	wait.forPage();
	    	click(Click);
	    	
	    }
	    
	
}
