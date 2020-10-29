package Pages;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import commons.BasePage;

public class SubmitNewComplaint extends BasePage {

	public SubmitNewComplaint(WebDriver driver) {
		super(driver);
		// TODO Auto-generated constructor stub
	}

	@FindBy(css = "div.layout:nth-child(2) div.page div.container div.row:nth-child(2) div.col-md-12.text-center > a.btn.btn-primary.btn-block.new_complaint:nth-child(1)")
	WebElement submitComplaint;

	@FindBy(css = "div.layout:nth-child(2) div.page div.container-fluid div.row.indus-complain:nth-child(2) div.col-sm-6.col-sm-offset-3.col-md-4.col-md-offset-4.mar-top-10 div.row.text-center:nth-child(1) div.col-sm-6.col-md-6.industry-tile-left:nth-child(1) a:nth-child(1) > p:nth-child(1)")
	WebElement energyComplaint;

//	@FindBy(css = "div.layout:nth-child(2) div.page div.container-fluid div.row:nth-child(2) div.col-sm-6.col-sm-offset-3.col-md-4.col-md-offset-4.mar-top-10 form.list-form div.check-list:nth-child(3) div.radio > label.checkbox-text.clearfix.radio-label")
//    WebElement billAccount;

	@FindBy(css = "div.layout:nth-child(2) div.page div.container-fluid div.row:nth-child(2) div.col-sm-6.col-sm-offset-3.col-md-4.col-md-offset-4.mar-top-10 form.list-form div.check-list:nth-child(5) div.radio > label.checkbox-text.clearfix.radio-label")
	WebElement payingBill;

	@FindBy(css = "div.layout:nth-child(2) div.page div.container-fluid div.row:nth-child(2) div.col-sm-6.col-sm-offset-3.col-md-4.col-md-offset-4.mar-top-10 form.list-form nav.navbar.navbar-default.navbar-fixed-bottom:nth-child(9) div.container.pagenav-container > button.btn.btn-pagenav.btn-block")
	WebElement doneChoosing;

	private static final Logger lOGGER = LogManager.getLogger(HomePage.class.getName());

	public void submitComplaint() {
		wait.forPage();
		click(submitComplaint);
	}

	public void energyComplaint() {
		wait.forPage();
		click(energyComplaint);
	}

	// page4
	/*
	 * public void billAccount() { wait.forPage(); click(billAccount); }
	 */
	public void payingBill() {
		wait.forPage();
		click(payingBill);
	}

	public void doneChoosing() {
		wait.forPage();
		click(doneChoosing);
	}

}
