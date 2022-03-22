package seleniumwithjava;

import static org.junit.Assert.*;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.apache.commons.io.FileUtils;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class AF3_Selenium {
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
	public void test() throws InterruptedException, IOException {
		driver.findElement(By.linkText("Login")).click();
		Thread.sleep(2000);
		driver.findElement(By.id("")).sendKeys("");//username or user id
		driver.findElement(By.id("")).sendKeys("");//Password
		driver.findElement(By.xpath("")).click();//click on signup button
		Thread.sleep(2000);
		
		driver.findElement(By.linkText("")).click();
		driver.findElement(By.linkText("")).click();
		Thread.sleep(20000);

		//New_Connection
		
		WebElement name=driver.findElement(By.xpath(""));
		Select city=new Select(name);
		city.selectByVisibleText("");
		Thread.sleep(2000);
		
		WebElement type=driver.findElement(By.id(""));
		Select location=new Select(type);
		location.selectByVisibleText("");
		
		driver.findElement(By.xpath("")).click();
		driver.findElement(By.xpath("")).clear();
		driver.findElement(By.xpath("")).sendKeys("");
		driver.findElement(By.xpath("")).sendKeys("");
		driver.findElement(By.xpath("")).click();
		
		
		String[]str=driver.findElement(By.xpath("")).getText().split(" ");
		String str2=str[str.length-1];
		Thread.sleep(2000);
		
		driver.findElement(By.xpath("")).click();
		String path="";
		FileInputStream file=new FileInputStream(path);
		XSSFWorkbook book=new XSSFWorkbook(file);
		XSSFSheet sheet1=book.getSheetAt(0);
		
		sheet1.getRow(0).getCell(0).setCellValue(str2);
		System.out.println(sheet1.getRow(0).getCell(0).getStringCellValue());
		
		driver.findElement(By.xpath("")).click();
		String a=sheet1.getRow(1).getCell(0).getRawValue();
		String b=sheet1.getRow(2).getCell(0).getRawValue();
		String c=sheet1.getRow(3).getCell(0).getRawValue();
		String d=sheet1.getRow(4).getCell(0).getRawValue();
		String month=sheet1.getRow(5).getCell(0).getStringCellValue();
		String year=sheet1.getRow(6).getCell(0).getRawValue();
		String cvv=sheet1.getRow(7).getCell(0).getRawValue();
		driver.findElement(By.id("")).sendKeys(a);
		driver.findElement(By.id("")).sendKeys(b);
		driver.findElement(By.id("")).sendKeys(c);
		driver.findElement(By.id("")).sendKeys(d);
		
		Thread.sleep(2000);
		WebElement list1=driver.findElement(By.xpath(""));
		Select name1=new Select(list1);
		name1.selectByVisibleText(month);
		
		WebElement list2=driver.findElement(By.xpath(""));
		Select name2=new Select(list1);
		name2.selectByVisibleText(year);
		
		driver.findElement(By.xpath("")).sendKeys(cvv);
		
		
		if(driver.findElement(By.xpath("")).isEnabled())
		{
			driver.findElement(By.xpath("")).click();//same xpath 
		}
		Thread.sleep(2000);
		
		driver.findElement(By.xpath("")).click();
		//MobNo
		driver.findElement(By.linkText("")).click();
		driver.findElement(By.xpath("")).click();
		driver.findElement(By.xpath("")).sendKeys("");
		
		driver.findElement(By.id("")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("")).click();
		driver.findElement(By.xpath("")).click();
		driver.findElement(By.xpath("")).click();
		driver.findElement(By.xpath("")).click();
		driver.findElement(By.xpath("")).click();
		File img1=((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
		FileUtils.copyFile(img1,new File("Path"));
		driver.findElement(By.linkText("")).click();	
		
	}

}
