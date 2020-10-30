

package Pages;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.Select;

import commons.BasePage;

public class Response extends BasePage {


	 public Response(WebDriver driver) {
		super(driver);
		// TODO Auto-generated constructor stub
	}
	
	@FindBy(css = "#contact-title")
    WebElement title;
	
	@FindBy(css = "#contact-firstname")
	WebElement firstName;

	@FindBy(css = "#contact-lastname")
	WebElement lastname;
	
	@FindBy(css = "#contact-email")
	WebElement email;
    
	@FindBy(css = "//LABEL[@class='checkbox-text clearfix'][text()='Post']")
	WebElement post;
	
	@FindBy(xpath = "//*[contains(text(), 'I would like to share my experience with others to improve awareness and outcomes.')]\n")
	WebElement option2;
	
	@FindBy(xpath = "//*[contains(text(), 'I would like to receive news and offers from Handle My Complaint')]\n")
	WebElement option3;
	
	@FindBy(css = "#submit-step")
	WebElement doneChoosing;

	    private static final Logger lOGGER = LogManager.getLogger(HomePage.class.getName());

	    
	    public void title() {
	    	wait.forPage();
	    	Select ab = new Select(title);
	    	ab.selectByValue("Mr");
	    	
	    }
	    
	    public void firstName() {
	    	wait.forPage();
	    	sendKeys(firstName, "aviraj");
	    }
	    public void lastname() {
	    	wait.forPage();
	    	sendKeys(lastname, "abc");
	    }

		
	    public void email() {
	    	wait.forPage();
	    	sendKeys(email, "pavirajuv@gmail.com");
	    }
	    
	    public void post() {
	    	wait.forPage();
	    	click(post);
	    }
	    public void option2() {
	    	wait.forPage();
	    	click(option2);
	    }
	    public void option3() {
	    	wait.forPage();
	    	click(option3);
	    }
	    public void doneChoosing() {
	    	wait.forPage();
	    	click(doneChoosing);
	    }
}
