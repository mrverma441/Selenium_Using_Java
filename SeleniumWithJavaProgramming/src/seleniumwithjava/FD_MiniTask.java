package seleniumwithjava;

import static org.junit.Assert.*;

import java.util.concurrent.TimeUnit;

import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class FD_MiniTask {
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
	public void test() throws InterruptedException {
		driver.findElement(By.id("")).sendKeys("");//userid
		driver.findElement(By.id("")).sendKeys("");//Password
		driver.findElement(By.id("")).click();//login button click
		Thread.sleep(5000);
		driver.findElement(By.xpath("")).click();//tab click
		driver.findElement(By.id("")).click();//tab click
		Thread.sleep(5000);
		driver.findElement(By.id("")).click();
		Thread.sleep(50000);
		driver.findElement(By.xpath("")).click();
		Thread.sleep(5000);
		
		WebElement list1=driver.findElement(By.xpath(""));
		Select type=new Select(list1);
		type.selectByIndex(1);
		Thread.sleep(2000);
		driver.findElement(By.id("")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("")).click();
		Thread.sleep(2000);
		driver.findElement(By.id("")).click();
		Thread.sleep(2000);
		WebElement list2=driver.findElement(By.xpath(""));
		Select type1=new Select(list2);
		type1.selectByIndex(2);
		Thread.sleep(2000);
		driver.findElement(By.xpath("")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("")).click();
		Thread.sleep(2000);
		
		String val=driver.findElement(By.xpath("")).getText();
		Assert.assertEquals("Already a requesr is raised", val);
		
		
		
		
		
		
		
		
		
	}

}
