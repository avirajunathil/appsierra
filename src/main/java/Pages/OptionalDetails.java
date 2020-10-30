
package Pages;

import java.awt.*;
import java.awt.datatransfer.StringSelection;
import java.awt.event.KeyEvent;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.Select;


import commons.BasePage;

public class OptionalDetails extends BasePage {

	 public OptionalDetails(WebDriver driver) {
		super(driver);
		// TODO Auto-generated constructor stub
	}
  
	@FindBy(css = "#outcome-field1")
    WebElement resolution;
	
	@FindBy(css = "#other-outcome1")
    WebElement outcome1;
	@FindBy(xpath = "//span[contains(text(),'CHOOSE FILE')]")
    WebElement chooseFile;
	
	@FindBy(css = "#btn-next")
    WebElement doneChoosing;

	    private static final Logger lOGGER = LogManager.getLogger(HomePage.class.getName());

	    public void resolution() {
	    	wait.forPage();
	    	Select ab = new Select(resolution);
	    	ab.selectByValue("10");
	    	
	    }
		
		public void outcome1() {
	    	wait.forPage();
	    	sendKeys(outcome1, "payment plan");
	    }
		
		public void chooseFile() throws AWTException {
	    	wait.forPage();
	    	click(chooseFile);
			String projectpath = System.getProperty("user.dir") + "\\aaaaaaaaaaa.PNG";

			Robot robot = new Robot();
			robot.delay(2000);
			StringSelection stringSelection = new StringSelection(projectpath);
			Toolkit.getDefaultToolkit().getSystemClipboard().setContents(stringSelection,null);

			robot.setAutoDelay(1000);
			robot.keyPress(KeyEvent.VK_CONTROL);
			robot.keyPress(KeyEvent.VK_V);
			robot.keyRelease(KeyEvent.VK_CONTROL);
			robot.keyRelease(KeyEvent.VK_V);
			robot.setAutoDelay(1000);
			robot.keyPress(KeyEvent.VK_ENTER);
			robot.keyRelease(KeyEvent.VK_ENTER);

		}
		
		public void doneChoosing() {
	    	wait.forPage();
	    	click(doneChoosing);
	    }
}
