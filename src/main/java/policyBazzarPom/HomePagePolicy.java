package policyBazzarPom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class HomePagePolicy {

	@FindBy(xpath = "(//div[@class='shadowHandlerBox'])[4]")
	private WebElement carInsurance;

	WebDriver driver;

	public HomePagePolicy(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}

	public void setCarInsurance() {
		carInsurance.click();
	}
}
