package pageObject;

import java.util.List;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;

import base.Setup;

import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.WebElement;

public class HomePage extends Setup {
	public HomePage(WebDriver driver) {
		PageFactory.initElements(driver, this);
		//Setup.driver = driver;
	}

	@FindBy(xpath = "//a[contains(.,'Home')]")
	public WebElement home;

	@FindBy(xpath = "//a[contains(.,'REGISTER')]")
	public WebElement rEGISTER;
	
	
	@FindBy(xpath="//a")
	public List<WebElement> all;
	
	@FindBy(xpath = "//a[contains(.,'Flights')]")
	public WebElement flight_lnk;
	
	
	public void clickOnRegistration() {
		rEGISTER.click();
	}
	
	
	public void clickOnFlight() {
	
		flight_lnk.click();
	}

}
