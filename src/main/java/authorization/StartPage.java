package authorization;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class StartPage {
	
	private WebDriver driver;
	
	@FindBy(xpath = "//div[@class=\"auth-bar__item auth-bar__item--text\"]")
	private WebElement enterBtn;
	
	public StartPage(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}
	
	public AuthorizationPopUp clickEnterBtn() {
		enterBtn.click();
		return new AuthorizationPopUp(driver);
	}
	
}
