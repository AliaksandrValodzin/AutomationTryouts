package authorization;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class AuthorizationPopUp {
	
	private WebDriver driver;
	
	@FindBy(xpath = "//div[@class=\"auth-form__control auth-form__control_condensed-additional\"]")
	private WebElement entryBtn;
	
	public AuthorizationPopUp(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}
	
	public void clickEntryBtn() {
		entryBtn.click();
	}

}
