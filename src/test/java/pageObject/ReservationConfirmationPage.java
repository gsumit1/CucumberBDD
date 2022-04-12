package pageObject;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;


public class ReservationConfirmationPage extends HomePage{

	public ReservationConfirmationPage(WebDriver driver) {
		super(driver);
	}
	
	@FindBy(xpath = "(//font[contains(.,'After flight finder - No Seats Avaialble')])[2]")
	public WebElement reservationMessage;


}
