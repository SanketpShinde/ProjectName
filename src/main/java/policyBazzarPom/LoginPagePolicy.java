package policyBazzarPom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPagePolicy {

	@FindBy(xpath = "//a[normalize-space()='Sign in']")
	private WebElement singInButton1;

	@FindBy(xpath = "//div[@id='central-login-module-inner']//input[@id='central-login-module-sign-mobile']")
	private WebElement userName;

	@FindBy(xpath = "(//a[@id='central-loggin-with-pwd'])[2]")
	private WebElement signInwithPasswordButton;

	@FindBy(xpath = "//input[@id='central-login-password']")
	private WebElement password;

	@FindBy(xpath = "//a[@id='login-in-with-password']")
	private WebElement signInButton2;

	WebDriver driver;

	public LoginPagePolicy(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}

	public void setsingInButton1() {
		singInButton1.click();
	}
	
	public void setsetUserName() 
	{
		userName.sendKeys("7020748308");
	}
	public void setSignInWithPasswordButton() 
	{
		signInwithPasswordButton.click();
	}
	public void setPassword() {
		password.sendKeys("4@@2231Prime");
	}
	public void setSignInButton2() {
		signInButton2.click();
	}
}

