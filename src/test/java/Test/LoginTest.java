package Test;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;

import Util.BrowserFactory;
import page.DashboardPage;
import page.LoginPage;

public class LoginTest {
	WebDriver driver;
    
	@Test
    public void validUserNameShouldBeAbleToLogin() {
		driver=BrowserFactory.init();
//    	BrowserFactory.tearDown();
    LoginPage loginPage=PageFactory.initElements(driver,LoginPage.class);
    DashboardPage dashboardPage=PageFactory.initElements(driver,DashboardPage.class);
    loginPage.intertUserName("demo@techfios.com");
    loginPage.intertPassword("abc123");
    loginPage.performLogin();
    dashboardPage.validateDashBoard();
    
    
    
    }
}
