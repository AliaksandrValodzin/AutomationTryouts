package authorization;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class AuthorizationPopUp {
	
	private WebDriver driver;
	
	@FindBy(xpath = "//div[@class=\"auth-form__control auth-form__control_condensed-additional\"]")
	private WebElement entryBtn;
	
	@FindBy(xpath = "//*[@id=\"auth-container\"]/div/div[2]/div/form/div[1]/div/div[2]/div/div/div/div/input")
	private WebElement emailField;
	
	@FindBy(xpath = "//*[@id=\"auth-container\"]/div/div[2]/div/form/div[2]/div/div/div/div/input")
	private WebElement passwordField;
	
	private WebElement vkBtn;
	private WebElement fbBtn;
	private WebElement gBtn;
	
	private WebElement registerLink;
	private WebElement rememberPassLink;
	
	
	public AuthorizationPopUp(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}
	
	public void clickEntryBtn() {
		entryBtn.click();
	}
	
	public void fillEmailField(String email) {
		emailField.sendKeys(email);
	}
	
	public void fillPasswordField(String password) {
		passwordField.sendKeys(password);
	}

}
