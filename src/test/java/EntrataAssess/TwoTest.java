package EntrataAssess;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class TwoTest {
	
	public static WebDriver driver;

	@BeforeMethod
	public void LaunchBrowserMethod()
	{
		System.setProperty("webdriver.chrome.driver", "D:\\15 April\\chromedriver-win64\\chromedriver-win64\\chromedriver.exe");
		 driver= new ChromeDriver();
		//visit the url
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		driver.get("https://www.entrata.com/");
		driver.manage().window().maximize();
		
	}
	
	@Test
	public void ProductsIsVisible() {
		Actions action = new Actions(driver);
		WebElement hover = driver.findElement(By.cssSelector(
				"#gatsby-focus-wrapper > div > div.main-header > div > div > div.header-desktop-nav.hide-on-mobile > div:nth-child(1) > div.main-nav-link"));
		action.moveToElement(hover).build().perform();
		WebElement hoverElemnet = driver.findElement(By.xpath(
				"//*[@id=\"gatsby-focus-wrapper\"]/div/div[1]/div/div/div[2]/div[1]/div[2]/div/div[1]/div[1]/a[1]"));
		boolean visible = hoverElemnet.isDisplayed();
		Assert.assertTrue(visible);
	}

	@AfterMethod
	public void CloseBrowser() {
		driver.quit();
	}

}
