
package keyword_driven;

import java.io.File;
import java.io.FileInputStream;

import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class MainClass {

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub

		FileInputStream f=new FileInputStream(new File("\"C:\\Users\\sagar\\Desktop\\keywoed_driven.xlsx\""));
		
		XSSFWorkbook w=new XSSFWorkbook(f);
		
		XSSFSheet sh=w.getSheet("Sheet1");
		
		for(int i=1; i<=sh.getLastRowNum();i++)
		{
		//i=1
			
			
			String keyword=sh.getRow(i).getCell(1).getStringCellValue();
			//                Row 1, Column 1
			
			String locatorType=sh.getRow(i).getCell(2).getStringCellValue();
			//                  Row 1, Column 2
			
			String locatorValue=sh.getRow(i).getCell(3).getStringCellValue();
			//                 Row 1, Column 3
			
			String testData=sh.getRow(i).getCell(4).getStringCellValue();
			//                  Row 1, Column 4
			
			
			
			switch(keyword)
			{
			case "openBrowser" -> ActionKeyword.openBrowser(testData);
			case "getURL" -> ActionKeyword.getURL(testData);
			case "EnterText"-> ActionKeyword.EnterText(locatorType, locatorValue, testData);
			case "onClick" -> ActionKeyword.onClick(locatorType, locatorValue);
			default -> throw new Exception("You selected wrong option");
			};
			
			
			
			
		}
		
		
		
		
		
		
		
	}

}



