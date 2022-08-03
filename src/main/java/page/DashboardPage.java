package page;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;

public class DashboardPage {
	WebDriver driver;
	
    @FindBy(how = How.XPATH, using = "//h2[normalize-space()='Dashboard']")
	WebElement DASHBOAD_LOCATOR_ELEMENT;
	
	@FindBy(how = How.XPATH, using = "//*[@id=\"side-menu\"]/li[3]/a/span[1]")
	WebElement CUSTOMER_LOCATOR_ELEMENT;
	
	
	@FindBy(how = How.XPATH, using = "//a[normalize-space()='Add Customer']")
	WebElement ADD_CUSTOMER_ELEMENT;
	
	
	public void validateDashBoard() {
		Assert.assertEquals(DASHBOAD_LOCATOR_ELEMENT.getText(), "Dashboard", "You are at wrong page");
	}
	public void clickToCustomer() {

	    CUSTOMER_LOCATOR_ELEMENT.click();
	}
	public void clickToaddCustomer() {
		ADD_CUSTOMER_ELEMENT.click();
	}
	
	
}
