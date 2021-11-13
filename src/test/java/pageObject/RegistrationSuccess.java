package pageObject;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class RegistrationSuccess extends HomePage{
	
	public RegistrationSuccess(WebDriver driver) {
		super(driver);
	}
	
	@FindBy(xpath = "//*[contains(text(),' Thank you ')]")
	public WebElement  successMessage;

}
