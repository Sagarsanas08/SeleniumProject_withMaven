package DataDriven;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.ss.usermodel.CellType;
import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class DrivenExcel {

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub

		FileInputStream f=new FileInputStream(new File("C:\\Users\\sagar\\Desktop\\Data.xlsx"));
		
		XSSFWorkbook w=new XSSFWorkbook(f);
		
		XSSFSheet sh=w.getSheetAt(0);
		
		XSSFCell c;
		
		WebDriver d=new FirefoxDriver();
		d.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
		Thread.sleep(10000);
		
		for(int i=1; i<=sh.getLastRowNum();i++)
		
		{
			c=sh.getRow(i).getCell(0);
			//Row 1, Column 0 
			c.setCellType(CellType.STRING);
		
			d.findElement(By.xpath("//input[@name='username']")).sendKeys(c.getStringCellValue());
			Thread.sleep(2000);
			
			
			c=sh.getRow(i).getCell(1);
			//Row 1, Column 1 
			c.setCellType(CellType.STRING);
		
			d.findElement(By.xpath("//input[@placeholder='Password']")).sendKeys(c.getStringCellValue());
			Thread.sleep(2000);
			
			d.findElement(By.xpath("//button[contains(.,'Login')]")).click();
			Thread.sleep(2000);
			
		}
		
		
		
		
		
		
		
	}

}
