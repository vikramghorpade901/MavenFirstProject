package tests;

import org.openqa.selenium.WebDriver;

import org.openqa.selenium.edge.EdgeDriver;
import org.testng.Assert;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Test;

import com.pages.DashboardPage;
import com.pages.LogInPage;
import com.pages.UserPage;
public class Test1 {
	WebDriver driver = null ;
	LogInPage lp= null;
	DashboardPage dp = null;
	UserPage up = null;
@BeforeSuite
public void setup() {
System.setProperty("webdriver.edge.driver", "msedgedriver1.exe");
driver = new EdgeDriver();
driver.get("file:///C:/Users/vikra/Desktop/JBK/Selenium/Software/javabykiran-Selenium-Softwares/javabykiran-Selenium-Softwares/Offline%20Website/index.html");
lp= new LogInPage(driver);
}
	
	@Test
	public void logintest() {
		
		dp = lp.validLogin();
		boolean b = dp.verifyHeader();
		Assert.assertTrue(b);
}
	@Test
	public void usertest () {
		
		up = dp.clickUser();
		Assert.assertEquals(driver.getTitle(),"JavaByKiran | user");
	}
}
