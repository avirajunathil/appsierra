

package Pages;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import commons.BasePage;

public class CompanyName extends BasePage {


	 public CompanyName(WebDriver driver) {
		super(driver);
		// TODO Auto-generated constructor stub
	}
  
	@FindBy(css = "div.layout:nth-child(2) div.page div.container-fluid div.row:nth-child(2) div.col-sm-6.col-sm-offset-3.col-md-4.col-md-offset-4.mar-top-10 form.list-form div.form-group.single-org:nth-child(2) > input.form-control.select-org.list.autocomplete-0:nth-child(2)")
    WebElement company;
	
	@FindBy(css = "div.layout:nth-child(2) div.page div.container-fluid div.row:nth-child(2) div.col-sm-6.col-sm-offset-3.col-md-4.col-md-offset-4.mar-top-10 form.list-form nav.navbar.navbar-default.navbar-fixed-bottom:nth-child(6) div.container.pagenav-container > button.btn.btn-pagenav.btn-block.organisation-button")
	                   
	WebElement doneChoosing;
	
	@FindBy(xpath = "//a[contains(text(),'Perth Energy')]")
    
	WebElement click;
	    private static final Logger lOGGER = LogManager.getLogger(HomePage.class.getName());

	    
		
	    public void company() {
	    	wait.forPage();
	    	sendKeys(company, "Perth");
	    			}
	 public void click() {
	    	wait.forPage();
	    	click(click);
	 }

		
		public void doneChoosing() {
	    	wait.forPage();
	    	click(doneChoosing);
	    }
}
