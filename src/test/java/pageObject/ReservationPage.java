package pageObject;


import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.Select;


public class ReservationPage extends HomePage{

	public ReservationPage(WebDriver driver) {
		super(driver);
	}
	
	@FindBy(xpath = "//select[@name='fromPort']")
	public WebElement ddl_from;
	
	@FindBy(xpath = "//select[@name='toPort']")
	public WebElement ddl_to;
	
	@FindBy(xpath = "//input[@name='findFlights']")
	public WebElement btn_continue;
	
	
	
	
	public void setFromLocation(String locationName) {	
		setLocation(ddl_from,locationName);
	}
	
	public void setToLocation(String locationName) {	
		setLocation(ddl_to,locationName);
	}
	
	
	private void setLocation(WebElement e, String s ) {
		Select select=new Select(e);
		select.selectByVisibleText(s);
		
	}
	
	public void clickOnContinue() {
		btn_continue.click();
	}
	
	

}
