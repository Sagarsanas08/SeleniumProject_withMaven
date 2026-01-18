package DataDriven;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import org.apache.poi.ss.usermodel.CellType;
import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class ReadExcel {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub

	FileInputStream	f=new FileInputStream(new File("C:\\Users\\sagar\\Desktop\\Data.xlsx"));
	//FileInputStream is predefined class from java.io package
	//it is used to read data from the excel file
	
	XSSFWorkbook w=new XSSFWorkbook(f);
	//XSSFWorkbook is predefined class from org.apache.poi
	
	XSSFSheet sh=w.getSheetAt(0);
	
	XSSFCell c;
	
	for(int i=1; i<=sh.getLastRowNum();i++)
	{
		c=sh.getRow(i).getCell(0);
		//Row 1, Column 0
		c.setCellType(CellType.STRING);
		
		System.out.println(c.getStringCellValue());
		
		c=sh.getRow(i).getCell(1);
		//Row 1, Column 0
		c.setCellType(CellType.STRING);
		
		System.out.println(c.getStringCellValue());
		
		
		
	}
	
	
	
	
	
	
	
	
	
	
	
		
	}

}
