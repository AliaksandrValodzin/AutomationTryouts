package landing;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import authorization.AuthorizationPopUp;

public class StartPage {
	
	private WebDriver driver;
	
	@FindBy(xpath = "//div[@class=\"auth-bar__item auth-bar__item--text\"]")
	private WebElement entryBtn;
	
	@FindBy(xpath = "//*[@id=\"userbar\"]")
	private WebElement userBar;
	
	public StartPage(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}
	
	public AuthorizationPopUp clickEntryBtn() {
		entryBtn.click();
		return new AuthorizationPopUp(driver);
	}
	
}
