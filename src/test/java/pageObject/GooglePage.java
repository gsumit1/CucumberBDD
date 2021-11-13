package pageObject;

import java.util.Map;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class GooglePage {
	public GooglePage(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(xpath = "//input[contains(@name,'q')]")
	WebElement tbx_search;
	
	
	
	public void search(String q) {
		tbx_search.sendKeys(q);
	}


}
