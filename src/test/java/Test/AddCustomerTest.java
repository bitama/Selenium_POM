package Test;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;

import Util.BrowserFactory;
import page.AddCustomerPage;
import page.DashboardPage;
import page.LoginPage;

public class AddCustomerTest {
	WebDriver driver;

//	public AddCustomerTest(WebDriver driver) {
//		this.driver=driver;
//	}
	@Test
	public void userShoulBeAbleToAddCustomer() {
		driver = BrowserFactory.init();
		LoginPage login=PageFactory.initElements(driver,LoginPage.class);
		login.intertUserName("demo@techfios.com");
	    login.intertPassword("abc123");
	    login.performLogin();
	    
	    
	    DashboardPage dashboardPage=PageFactory.initElements(driver,DashboardPage.class);
        dashboardPage.validateDashBoard();
        dashboardPage.clickToCustomer();
        dashboardPage.clickToaddCustomer();
        AddCustomerPage addCustomerPage = PageFactory.initElements(driver, AddCustomerPage.class);
        addCustomerPage.fillFullName("Patrick Niyibizi");
        addCustomerPage.selectCompany("Amazon");
        addCustomerPage.addEmail("niyibizipatr@gmail.com");
        addCustomerPage.addPhone("0786347037");
        addCustomerPage.addAddress("1324 Boston Rd");
        addCustomerPage.addCity("Fort Worth");
        addCustomerPage.addState("texas");
        addCustomerPage.addZip("45673");
        addCustomerPage.addCounrty("Rwanda");
        addCustomerPage.addTag("Enrico");
        addCustomerPage.clickButton();
	}
}
