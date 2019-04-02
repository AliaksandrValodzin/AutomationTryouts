package authorization;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import landing.StartPage;

public class AuthorizationPopUp {
	
	private WebDriver driver;
	
	@FindBy(xpath = "//div[@class=\"auth-form__control auth-form__control_condensed-additional\"]")
	private WebElement entryBtn;
	
	@FindBy(xpath = "//*[@id=\"auth-container\"]/div/div[2]/div/form/div[1]/div/div[2]/div/div/div/div/input")
	private WebElement emailField;
	
	@FindBy(xpath = "//*[@id=\"auth-container\"]/div/div[2]/div/form/div[2]/div/div/div/div/input")
	private WebElement passwordField;
	
	@FindBy(xpath = "//*[@id=\"auth-container\"]/div/div[2]/div/div[2]/div/div[2]/div/a[2]")
	private WebElement vkBtn;
	@FindBy(xpath = "//*[@id=\"auth-container\"]/div/div[2]/div/div[2]/div/div[2]/div/a[1]")
	private WebElement fbBtn;
	@FindBy(xpath = "//*[@id=\"auth-container\"]/div/div[2]/div/div[2]/div/div[2]/div/a[3]")
	private WebElement gBtn;
	
	@FindBy(xpath = "//*[@id=\"auth-container\"]/div/div[2]/div/form/div[4]/div[1]/a")
	private WebElement registerLink;
	@FindBy(xpath = "//*[@id=\"auth-container\"]/div/div[2]/div/form/div[4]/div[2]/a")
	private WebElement rememberPassLink;
	
	
	public AuthorizationPopUp(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}
	
	public StartPage clickEntryBtn() {
		entryBtn.click();
		return new StartPage(driver);
	}
	
	public void fillEmailField(String email) {
		emailField.sendKeys(email);
	}
	
	public void fillPasswordField(String password) {
		passwordField.sendKeys(password);
	}
	
	

}
