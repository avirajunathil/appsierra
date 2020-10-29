
package Pages;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import commons.BasePage;

public class Issues extends BasePage {

	public Issues(WebDriver driver) {
		super(driver);
		// TODO Auto-generated constructor stub
	}

	@FindBy(css = "div.layout:nth-child(2) div.page div.container-fluid div.row:nth-child(2) div.col-sm-6.col-sm-offset-3.col-md-4.col-md-offset-4.mar-top-10 form.list-form div.check-list:nth-child(8) div.radio > label.checkbox-text.clearfix.radio-label")
	WebElement needMoreTime;

	@FindBy(css = "div.layout:nth-child(2) div.page div.container-fluid div.row:nth-child(2) div.col-sm-6.col-sm-offset-3.col-md-4.col-md-offset-4.mar-top-10 form.list-form nav.navbar.navbar-default.navbar-fixed-bottom:nth-child(18) div.container.pagenav-container > button.btn.btn-pagenav.btn-block")
	WebElement doneChoosing;

	private static final Logger lOGGER = LogManager.getLogger(HomePage.class.getName());

	public void needMoreTime() {
		wait.forPage();
		click(needMoreTime);
	}

	public void doneChoosing() {
		wait.forPage();
		click(doneChoosing);
	}
}
