package authorization;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;


public class AuthorizationPageTest {
	
	@Test
	public void Test() {
		
		System.setProperty("webdriver.chrome.driver", "c:\\selenium\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.navigate().to("https://www.onliner.by/");

		WebElement button = driver.findElement(By.xpath("//div[@class=\"auth-bar__item auth-bar__item--text\"]"));
		button.click();
	}
	
	@Test
	public void PageObjectTest() {
		System.setProperty("webdriver.chrome.driver", "c:\\selenium\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.navigate().to("https://www.onliner.by/");
	
		StartPage page = new StartPage(driver);
		AuthorizationPopUp popUp = page.clickEnterBtn();
		popUp.clickEntryBtn();
	}
	
}
