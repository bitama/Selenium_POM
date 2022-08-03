package page;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.Wait;
import org.openqa.selenium.support.ui.WebDriverWait;

public class AddCustomerPage extends basePage {
	WebDriver driver;

	@FindBy(how = How.XPATH, using = "//input[@id='account']")
	WebElement FULLNAME_LOCATOR_ELEMENT;

	@FindBy(how = How.XPATH, using = "//select[@id='cid']")
	WebElement COMPANY_LOCATOR_ELEMENT;

	public void fillFullName(String fullName) {
		FULLNAME_LOCATOR_ELEMENT.sendKeys(generateRandom(999)+fullName);
	}

	public void selectCompany(String company) {
		WebElement element = COMPANY_LOCATOR_ELEMENT;
		Select select = new Select(element);
		select.selectByVisibleText(company);
	}

}
