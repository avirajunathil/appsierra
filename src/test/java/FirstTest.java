import Pages.LoginDetails;
import Pages.CompanyName;
import Pages.EnergyComplaint;
import Pages.Feel;
import Pages.HomePage;
import Pages.Issues;
import Pages.Location;
import Pages.LoginPage;
import Pages.OptionalDetails;
import Pages.PayingBillIssue;
import Pages.Response;
import Pages.SignUp;
import Pages.SubmitNewComplaint;
import commons.TestBase;

import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import static commons.Configuration.url;

import java.awt.AWTException;
import java.util.concurrent.TimeUnit;

public class FirstTest extends TestBase {

	@BeforeMethod
	public void openPage() {
		driver.get(url.asString());
	}

	@Test
	public void testHomePage() throws AWTException, InterruptedException {
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		HomePage homePage = new HomePage(driver);
		homePage.clickOnLoginButton();
		LoginPage loginPage = new LoginPage(driver);

		LoginDetails log = new LoginDetails(driver);
		log.getUsername();
		log.getPassword();
		log.onClick();

		SubmitNewComplaint sm = new SubmitNewComplaint(driver);
		sm.submitComplaint();
		EnergyComplaint en = new EnergyComplaint(driver);
		en.energyComplaint();
		PayingBillIssue pi = new PayingBillIssue(driver);
		pi.payingBill();
		pi.doneChoosing();
		Issues is = new Issues(driver);
		is.needMoreTime();
		is.doneChoosing();
		Feel f = new Feel(driver);
		f.disappointed();
		f.doneChoosing();
		Location loc = new Location(driver);
		loc.address1();
		loc.address2();
		loc.city();
		loc.state();
		loc.postcode();
		loc.country();
		loc.submit();
		CompanyName c = new CompanyName(driver);
		c.company();
		c.click();
		c.doneChoosing();
		OptionalDetails op = new OptionalDetails(driver);
		op.resolution();
		op.outcome1();
		op.chooseFile();
		op.doneChoosing();
		Response r = new Response(driver);
		r.title();
		r.firstName();
		r.lastname();
		r.email();
		r.doneChoosing();

		// SignUp sn = new SignUp(driver);
		/*
		 * sn.getTitle(); sn.firstName(); sn.lastName(); sn.password();
		 * sn.newPassword(); sn.checkbox(); sn.SignUpButton();
		 */
		// Assert.assertEquals(loginPage.getLoginFormTitle(), "Login");
	}

}
