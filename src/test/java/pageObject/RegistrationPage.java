package pageObject;

import java.util.Map;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.WebElement;

public class RegistrationPage extends HomePage{

	public RegistrationPage(WebDriver driver) {
		super(driver);
	}
	
	@FindBy(xpath = "//input[contains(@name,'email')]")
	public WebElement  userName;

	@FindBy(xpath = "//input[@name='password']")
	public WebElement  password;

	@FindBy(xpath = "//input[@name='confirmPassword']")
	public WebElement  confirmPassword;
	
	@FindBy(xpath = "//input[@type='submit']")
	public WebElement  btn_submit;
	
	
	public void register_user(Map<String,String> userDetails) {
		userName.sendKeys(userDetails.get("UserName"));
		password.sendKeys(userDetails.get("Password"));
		confirmPassword.sendKeys(userDetails.get("Confirm Password"));
		btn_submit.click();
	}
	

}
