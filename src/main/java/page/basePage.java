package page;

import java.util.Random;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.ui.Select;

public class basePage {
	WebDriver driver;
	@FindBy(how = How.XPATH, using = "//input[@id='email']")
	WebElement EMAIL_LOCATOR_ELEMENT;

	@FindBy(how = How.XPATH, using = "//input[@id='phone']")
	WebElement PHONE_LOCATOR_ELEMENT;

	@FindBy(how = How.XPATH, using = "//input[@id='address']")
	WebElement ADDRESS_LOCATOR_ELEMENT;

	@FindBy(how = How.XPATH, using = "//input[@id='city']")
	WebElement CITY_LOCATOR_ELEMENT;

	@FindBy(how = How.XPATH, using = "//input[@id='state']")
	WebElement STATE_LOCATOR_ELEMENT;
	@FindBy(how = How.XPATH, using = "//input[@id='zip']")
	WebElement ZIP_LOCATOR_ELEMENT;
	@FindBy(how = How.XPATH, using = "//select[@id='country']")
	WebElement COUNTRY_LOCATOR_ELEMENT;
	@FindBy(how = How.XPATH, using = "//select[@id='tags']")
	WebElement TAG_LOCATOR_ELEMENT;
	
	@FindBy(how = How.XPATH, using = "//button[@id='submit']")
	WebElement BTN_LOCATOR_ELEMENT;

	public int generateRandom(int generateRandom) {
         Random rd= new Random();
         int generatedRandom=rd.nextInt();
		return generatedRandom;
	}

	public void addEmail(String email) {
		EMAIL_LOCATOR_ELEMENT.sendKeys(email);
	}

	public void addPhone(String phone) {
		PHONE_LOCATOR_ELEMENT.sendKeys(generateRandom(999)+phone);
	}

	public void addAddress(String address) {
		ADDRESS_LOCATOR_ELEMENT.sendKeys(address);
	}

	public void addCity(String city) {

		CITY_LOCATOR_ELEMENT.sendKeys(city);
	}

	public void addState(String state) {
		STATE_LOCATOR_ELEMENT.sendKeys(state);
	}

	public void addZip(String zip) {

		ZIP_LOCATOR_ELEMENT.sendKeys(zip);
	}
	public void addCounrty(String country) {
		WebElement element = COUNTRY_LOCATOR_ELEMENT;
		Select select = new Select(element);
		select.selectByVisibleText(country);
	}
	public void addTag(String tag) {
		WebElement element = TAG_LOCATOR_ELEMENT;
		Select select = new Select(element);
		select.selectByVisibleText(tag);
	}
	
	public void clickButton() {
		BTN_LOCATOR_ELEMENT.click();
	}
	
	

}
