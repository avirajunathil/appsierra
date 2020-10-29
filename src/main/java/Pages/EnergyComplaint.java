

package Pages;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import commons.BasePage;

public class EnergyComplaint extends BasePage {


	 public EnergyComplaint(WebDriver driver) {
		super(driver);
		// TODO Auto-generated constructor stub
	}

	@FindBy(css = "div.layout:nth-child(2) div.page div.container-fluid div.row.indus-complain:nth-child(2) div.col-sm-6.col-sm-offset-3.col-md-4.col-md-offset-4.mar-top-10 div.row.text-center:nth-child(1) div.col-sm-6.col-md-6.industry-tile-left:nth-child(1) a:nth-child(1) > p:nth-child(1)")
    WebElement energyComplaint;
	
	    private static final Logger lOGGER = LogManager.getLogger(HomePage.class.getName());

		public void energyComplaint() {
	    	wait.forPage();
	    	click(energyComplaint);
	    }
		
}
