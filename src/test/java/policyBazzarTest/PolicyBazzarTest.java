package policyBazzarTest;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import policyBazzarPom.HomePagePolicy;
import policyBazzarPom.LoginPagePolicy;

public class PolicyBazzarTest {
	WebDriver driver;
	LoginPagePolicy login;
	HomePagePolicy home;

	@BeforeClass
	public void openingBrowser() throws InterruptedException {
		System.setProperty("webdriver.chrome.driver",
				"D:\\Soft Test Tools\\Drivers For Selenium\\chromedriver-win64\\chromedriver-win64\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.get("https://www.policybazaar.com/");
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		login = new LoginPagePolicy(driver);
		home = new HomePagePolicy(driver);
		Thread.sleep(3000);
	}
	@AfterClass
	public void closingBrowser(){
		driver.close();
		
	}

	@BeforeMethod
	public void logInSetUp() throws InterruptedException 
	{
		Thread.sleep(4000);
		login.setsingInButton1();
		Thread.sleep(7000);
		//driver.switchTo().alert().dismiss();
		login.setsetUserName();
		Thread.sleep(3000);
		login.setSignInWithPasswordButton();
		login.setPassword();
		login.setSignInButton2();
	}
	@Test
	public void test() {
	}
}
