package seleniumwithjava;

import static org.junit.Assert.*;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class OpeningChrome {
WebDriver driver;
	@Before
	public void setUp() throws Exception {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\MONU VERMA\\Downloads\\chromedriver_win32 (1)\\chromedriver.exe");
		driver=new ChromeDriver();
		driver.get("https://amazon.com");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(2000,TimeUnit.MILLISECONDS);
		
	}
	

	@After
	public void tearDown() throws Exception {
		driver.findElement(By.id("nav-hamburger-menu")).click();
		driver.findElement(By.xpath("//*[@id=\"hmenu-content\"]/ul[1]/li[25]/a")).click();
		//driver.close();
	}

	@Test
	public void test() throws IOException, InterruptedException {
		//fail("Not yet implemented");
		Thread.sleep(2000);
		if(driver.findElement(By.xpath("//*[@id=\"nav-main\"]/div[1]/div/div/div[3]/span[1]")).isEnabled())
		{
			driver.findElement(By.xpath("//*[@id=\"nav-main\"]/div[1]/div/div/div[3]/span[1]")).click();
		}
		driver.findElement(By.xpath("//*[@id=\"nav-link-accountList\"]")).click();
		
		if(driver.getCurrentUrl().equals("https://www.amazon.com/ap/signin?openid.pape.max_auth_age=0&openid.return_to=https%3A%2F%2Fwww.amazon.com%2F%3Fref_%3Dnav_ya_signin&openid.identity=http%3A%2F%2Fspecs.openid.net%2Fauth%2F2.0%2Fidentifier_select&openid.assoc_handle=usflex&openid.mode=checkid_setup&openid.claimed_id=http%3A%2F%2Fspecs.openid.net%2Fauth%2F2.0%2Fidentifier_select&openid.ns=http%3A%2F%2Fspecs.openid.net%2Fauth%2F2.0&")) 
		{
			driver.findElement(By.id("createAccountSubmit")).click();
			System.out.println("Create your amazon account is working fine");
			driver.navigate().back();
		}
		else
		{
			System.out.println("Create your amazon account is not  working fine");
		}
		String path="D:\\Excel1.xlsx";
		FileInputStream file=new FileInputStream(path);
		XSSFWorkbook book=new XSSFWorkbook(file);
		XSSFSheet sheet1=book.getSheetAt(0);
		int rowscount=sheet1.getLastRowNum();
		System.out.println(rowscount);
		
		driver.findElement(By.id("ap_email")).sendKeys(sheet1.getRow(1).getCell(1).getRawValue());
		driver.findElement(By.id("continue")).click();
		
		driver.findElement(By.id("ap_password")).sendKeys(sheet1.getRow(1).getCell(2).getStringCellValue());
		driver.findElement(By.id("signInSubmit")).click();
		
				
	

}
}