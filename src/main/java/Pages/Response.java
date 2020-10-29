

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
    
	@FindBy(css = "div.layout:nth-child(2) div.page div.container-fluid form.list-form div.row.response-input-group:nth-child(3) div.col-md-12.pad-bot-25 div.row:nth-child(8) div.col-sm-6.col-sm-offset-3.col-md-4.col-md-offset-4.check-list.clearfix div.check-list:nth-child(3) div.radio > label.checkbox-text.clearfix")
	WebElement post;
	
	@FindBy(css = "div.layout:nth-child(2) div.page div.container-fluid form.list-form div.row.response-input-group:nth-child(3) div.col-md-12.pad-bot-25 div.row:nth-child(10) div.form-group.col-sm-6.col-sm-offset-3.col-md-4.col-md-offset-4 div.checkbox.reset-checkbox label.response-terms:nth-child(2) > p.pad-left-45.sml-font")
	WebElement option2;
	
	@FindBy(css = "div.layout:nth-child(2) div.page div.container-fluid form.list-form div.row.response-input-group:nth-child(3) div.col-md-12.pad-bot-25 div.row:nth-child(11) div.form-group.col-sm-6.col-sm-offset-3.col-md-4.col-md-offset-4 div.checkbox.reset-checkbox label.response-terms:nth-child(2) > p.pad-left-45.sml-font")
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
