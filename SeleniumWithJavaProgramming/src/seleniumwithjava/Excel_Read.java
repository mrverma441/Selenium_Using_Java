package seleniumwithjava;

import static org.junit.Assert.*;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.apache.commons.io.FileUtils;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
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

public class Excel_Read {
WebDriver driver;
	@Before
	public void setUp() throws Exception {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\MONU VERMA\\Downloads\\chromedriver_win32 (1)\\chromedriver.exe");
		driver=new ChromeDriver();
		driver.get("https://sarkariresult.com");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(2000,TimeUnit.MILLISECONDS);
		//xls-hssf
		//xlsx-xssf
	}

	@After
	public void tearDown() throws Exception {
		driver.close();
		
	}

	@Test
	public void test() throws IOException, InterruptedException {
		File img1=((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
		FileUtils.copyFile(img1,new File("Path"));
		
		driver.findElement(By.id("")).sendKeys("");//user_Id
		driver.findElement(By.id("")).sendKeys("");//Password
		
		driver.findElement(By.id("")).click();//Login
		driver.findElement(By.id("")).click();//Click on new tab
		
		
		String path="";
		FileInputStream file=new FileInputStream(path);
		XSSFWorkbook book=new XSSFWorkbook(file);
		XSSFSheet sheet1=book.getSheetAt(0);
		int rowscount=sheet1.getFirstRowNum();
		System.out.println(rowscount);
		
		for(int i=0;i<=sheet1.getLastRowNum();i++)
		{
			double loanamount=sheet1.getRow(i).getCell(0).getNumericCellValue();
			int month=(int)sheet1.getRow(i).getCell(1).getNumericCellValue();
			String la=String.valueOf(loanamount);
			String m=String.valueOf(month);
			Thread.sleep(5000);
			WebElement type=driver.findElement(By.id(""));
			Select type1=new Select(type);
			type1.selectByIndex(1);
			Thread.sleep(5000);
			WebElement name=driver.findElement(By.id(""));
			Select name1=new Select(name);
			name1.selectByIndex(1);
			Thread.sleep(5000);
			driver.findElement(By.id("")).sendKeys(la);
			driver.findElement(By.id("")).sendKeys(m);
			driver.findElement(By.id("")).click();
			
			
			
			Thread.sleep(5000);
			String abc=driver.findElement(By.id("")).getText();
			System.out.println(abc);
			
			Row newrow=sheet1.getRow(i);
			Cell newcell=newrow.createCell(2);
			newcell.setCellValue(abc);
			
			driver.findElement(By.id("")).click();
			//taking ss of page and saving it in file
			String nam="path";
			File img2=((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
			FileUtils.copyFile(img2,new File("Path"));
			FileUtils.copyFile(img2, new File(nam+i+" .png"));		
		}
		FileOutputStream fileout=new FileOutputStream(path);
		book.write(fileout);
		book.close();		
	}

}
