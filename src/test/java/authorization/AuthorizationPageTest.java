package authorization;

import org.apache.log4j.Logger;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

import landing.StartPage;


public class AuthorizationPageTest {
	
	private static final Logger LOG = Logger.getLogger(AuthorizationPageTest.class);
	
	private final String EMAIL = "jimmy1512@mail.ru";
	private final String PASSWORD = "vaz2101";
	
	
	@Test
	public void authorizationTest() {
		
		LOG.info("start");
		
		System.setProperty("webdriver.chrome.driver", "src/main/resources/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.onliner.by/");
	
		StartPage page = new StartPage(driver);
		AuthorizationPopUp popUp = page.clickEnterBtn();
		popUp.fillEmailField(EMAIL);
		popUp.fillPasswordField(PASSWORD);
		popUp.clickEntryBtn();
		
		try {
			Thread.sleep(3000);
		} catch (InterruptedException e) {
			LOG.error(e.getMessage());
		}
		
		Assert.assertTrue(driver.findElement(By.xpath("//*[@id=\"userbar\"]")).isDisplayed(), "No userbar displayed.");
		
		driver.close();
	}
	
}
