package authorization;

import org.apache.log4j.Logger;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import landing.StartPage;


public class AuthorizationPageTest {
	
	private static final Logger LOG = Logger.getLogger(AuthorizationPageTest.class);
	
	private final String EMAIL = "jimmy1512@mail.ru";
	private final String PASSWORD = "vaz2101";
	
	@Test
	public void test() {
		
		System.setProperty("webdriver.chrome.driver", "src/main/resources/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.navigate().to("https://www.onliner.by/");

		WebElement button = driver.findElement(By.xpath("//div[@class=\"auth-bar__item auth-bar__item--text\"]"));
		button.click();
	}
	
	@Test
	public void authorizationTest() {
		System.setProperty("webdriver.chrome.driver", "src/main/resources/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.navigate().to("https://www.onliner.by/");
	
		StartPage page = new StartPage(driver);
		AuthorizationPopUp popUp = page.clickEnterBtn();
		popUp.fillEmailField(EMAIL);
		popUp.fillPasswordField(PASSWORD);
		popUp.clickEntryBtn();
	}
	
}
