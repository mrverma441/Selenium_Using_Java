package seleniumwithjava;

import static org.junit.Assert.*;

import java.util.concurrent.TimeUnit;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Creating_A_Repository {
	WebDriver driver;

	@Before
	public void setUp() throws Exception {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\MONU VERMA\\Downloads\\chromedriver_win32 (1)\\chromedriver.exe");
		driver=new ChromeDriver();
		driver.get("https://github.com");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(2000,TimeUnit.MILLISECONDS);
	}

	@After
	public void tearDown() throws Exception {
	}

	@Test
	public void test() throws InterruptedException {
		//fail("Not yet implemented");
		driver.findElement(By.xpath("/html/body/div[4]/main/div[1]/div[1]/div[1]/div/div/div[1]/form/div/button")).click();
		driver.findElement(By.xpath("/html/body/div[1]/header/div/div/div/a")).click();
		driver.findElement(By.id("login_field")).sendKeys("monuv6342@gmail.com");
		driver.findElement(By.id("password")).sendKeys("20Bca@21");
		driver.findElement(By.xpath("//*[@id=\"login\"]/div[4]/form/div/input[12]")).click();
		driver.findElement(By.xpath("//*[@id=\"repos-container\"]/h2/a")).click();
		driver.findElement(By.xpath("//*[@id=\"repository_name\"]")).sendKeys("MyFirstRepositoryUsingSelenium1");
		Thread.sleep(2000);
		driver.findElement(By.xpath("//*[@id=\"new_repository\"]/div[4]/button")).click();
	}

}
