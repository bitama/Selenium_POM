package page;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;

public class LoginPage {
	WebDriver driver;
	public LoginPage(WebDriver driver) {
		this.driver=driver;
		
	}
	@FindBy(how = How.XPATH, using = "//input[@id='username']")
	WebElement USERNAME_ELEMENT;
	@FindBy(how = How.XPATH, using = "//input[@id='password']")
	WebElement PASSWORD_ELEMENT;
	@FindBy(how = How.XPATH, using = "//button[@name='login']")
	WebElement LOGIN_ELEMENT;

	public void intertUserName(String username) {
		USERNAME_ELEMENT.sendKeys(username);
	}
	public void intertPassword(String password) {
		PASSWORD_ELEMENT.sendKeys(password);
	}
	public void performLogin() {
		LOGIN_ELEMENT.click();
	}
}
