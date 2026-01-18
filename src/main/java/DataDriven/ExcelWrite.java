package DataDriven;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class ExcelWrite {

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub

FileInputStream f=new FileInputStream(new File("C:\\Users\\sagar\\Desktop\\Data.xlsx"));
		
		XSSFWorkbook w=new XSSFWorkbook(f);
		
		XSSFSheet sh=w.getSheetAt(0);
		
		Cell c;
		
		
		for(int i=1; i<=sh.getLastRowNum();i++)
		
		{ 
			
			Row r=sh.getRow(0);
			
			if(r==null) // check if row value is null or empty
			{
			
				r=sh.createRow(i);
				//row 1
			}
			
		
			c=r.createCell(2);
			c.setCellValue("Test Status");
			
			FileOutputStream fo=new FileOutputStream("C:\\Users\\sagar\\Desktop\\Data.xlsx");
			
			w.write(fo);
			
			
		}
		
		
	}

}
