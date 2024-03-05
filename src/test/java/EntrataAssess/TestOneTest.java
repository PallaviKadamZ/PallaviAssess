package EntrataAssess;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class TestOneTest {
	public static WebDriver driver;

	@BeforeMethod
	public void LaunchBrowser()
	{
		System.setProperty("webdriver.chrome.driver", "D:\\15 April\\chromedriver-win64\\chromedriver-win64\\chromedriver.exe");
		 driver= new ChromeDriver();
		//visit the url
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		driver.get("https://www.entrata.com/");
		driver.manage().window().maximize();
		
	}
	
	@Test
	public void testHomePageFunction() {
		// verify the logo
		WebElement logo = driver.findElement(By.xpath("//a[@title=\"Entrata Home Page\"]"));
		//Assertions
		boolean visible = logo.isDisplayed();
		Assert.assertTrue(visible);
	}
	
	@Test
	public void DemoForm() {
		// click on WatchDemo
				WebElement WatchDemo = driver
						.findElement(By.xpath("//*[@id=\"gatsby-focus-wrapper\"]/div/div[1]/div/div/div[3]/a[1]"));
				WatchDemo.click();
				// fill the All filled
				driver.findElement(By.cssSelector("#FirstName")).sendKeys("Pallavi");
				driver.findElement(By.xpath("//input[@id=\"LastName\"]")).sendKeys("Kadam");
				driver.findElement(By.xpath("//input[@id=\"Email\"]")).sendKeys("kadampallavi057@gmail.com");
				driver.findElement(By.xpath("//input[@id=\"Company\"]")).sendKeys("Wipro Limited");
				// 503-555-1212
				driver.findElement(By.cssSelector("#Phone")).sendKeys("503-555-1212");

				WebElement selectUnitCount = driver.findElement(By.cssSelector("#Unit_Count__c"));
				Select s = new Select(selectUnitCount);
				s.selectByValue("11 - 100");

				driver.findElement(By.cssSelector("input[id=\"Title\"]")).sendKeys("QA Test Engineer");

				WebElement iAm = driver.findElement(By.cssSelector("#demoRequest"));
				Select ss = new Select(iAm);
				ss.selectByValue("a Resident");
//				driver.findElement(By.cssSelector("button[type=\"submit\"]")).submit();

				// assertion for validate the url
				boolean url = driver.getCurrentUrl().contains("watch-demo.html");
				Assert.assertTrue(url);
				System.out.println(url);

	}

	@Test
	public void SignIn() {
		WebElement signIn = driver.findElement(By.xpath("//div//a[@class=\"button-default outline-dark-button\"]"));
		signIn.click();
		
		System.out.println(driver.getCurrentUrl());

	
		//Assertions
		//entrata/login
		boolean currentUrl=driver.getCurrentUrl().contains("entrata.com/sign-in");
		System.out.println(currentUrl);
		Assert.assertEquals(currentUrl, true);	

	}
	
	
	@AfterMethod
	public void tearDown() {
		driver.quit();
	}
	

	

}
