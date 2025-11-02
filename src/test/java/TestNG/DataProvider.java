package TestNG;


import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.testng.annotations.Test;


public class DataProvider {
	
	@Test(dataProvider = "excelData")
	public void Test1(String userName, String password) {
		System.out.println("The userr name is "+userName+" and the Password is "+password);
	}
	
	@org.testng.annotations.DataProvider(name="excelData")
	public Object[][]  getDteFromExcel() throws IOException {
		
		FileInputStream fis=new FileInputStream("C:/Users/Manoj/OneDrive/Test/TestData.xlsx");
		Workbook workbook=new XSSFWorkbook(fis);
		Sheet sheet=workbook.getSheet("Sheet1");
		int rowCount= sheet.getPhysicalNumberOfRows();
		int cellCount=sheet.getRow(0).getPhysicalNumberOfCells();
		
		Object[][] data= new Object[rowCount-1][cellCount];
		
		for (int i = 1; i < rowCount; i++) {
			Row row=sheet.getRow(i);
			for (int j = 0; j < cellCount; j++) {
				Cell cell= row.getCell(j);
				data[i-1][j]=cell.getStringCellValue();
			}
		}
		
		workbook.close();
		fis.close();
		return data;
	}

}
