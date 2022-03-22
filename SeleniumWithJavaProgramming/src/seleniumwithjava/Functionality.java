package seleniumwithjava;

import static org.junit.Assert.*;

import java.util.concurrent.TimeUnit;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Functionality {
WebDriver driver;
	@Before
	public void setUp() throws Exception {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\MONU VERMA\\Downloads\\chromedriver_win32 (1)\\chromedriver.exe");
		driver=new ChromeDriver();
		driver.get("https://sarkariresult.com");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(2000,TimeUnit.MILLISECONDS);

	}

	@After
	public void tearDown() throws Exception {
		driver.close();
	}

	@Test
	public void test() {
		//fail("Not yet implemented");
		driver.findElement(By.name(null)).getClass();
		driver.findElement(By.name(null)).getScreenshotAs(null);
		driver.findElement(By.name(null)).getTagName();
		driver.findElement(By.name(null)).getAccessibleName();
		driver.findElement(By.name(null)).getAriaRole();
		driver.findElement(By.name(null)).getAttribute(null);
		driver.findElement(By.name(null)).getCssValue(null);
		driver.findElement(By.name(null)).getDomAttribute(null);
		driver.findElement(By.name(null)).getDomProperty(null);
		driver.findElement(By.name(null)).getLocation();
		driver.findElement(By.name(null)).getRect();
		driver.findElement(By.name(null)).getShadowRoot();
		driver.findElement(By.name(null)).getText();
		driver.findElement(By.name(null)).isDisplayed();
		driver.findElement(By.name(null)).isEnabled();
		driver.findElement(By.name(null)).isDisplayed();
	}

}
