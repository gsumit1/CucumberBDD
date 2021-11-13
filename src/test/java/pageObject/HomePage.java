package pageObject;

import java.util.List;

import org.openqa.selenium.By;
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
	
	
	
	public void clickOnRegistration() {
		System.out.println(all.size());
		rEGISTER.click();
	}

}
