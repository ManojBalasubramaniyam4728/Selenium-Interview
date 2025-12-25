package ExcelAndJsonforDataDriveing;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.testng.annotations.Test;

public class GetDataFromExcel {

	public static String filePath = System.getProperty("user.dir")
			+ "/src/test/java/ExcelAndJsonforDataDriveing/TestData.xlsx";

	public String getData(String excelFilePath, String sheetName, int rowId, int columnId) throws IOException {
		FileInputStream fis = new FileInputStream(excelFilePath);
		Workbook workbook = new XSSFWorkbook(fis);
		Sheet sheet = workbook.getSheet(sheetName);
		Row row = sheet.getRow(rowId);
		Cell cell = row.getCell(columnId);
		String data = cell.getStringCellValue();
		fis.close();
		workbook.close();
		return data;
	}

	public void putData(String excelFilePath, String sheetName, int rowId, int columnId, String dataToPut)
			throws IOException {
		FileInputStream fis = new FileInputStream(excelFilePath);
		Workbook workbook = new XSSFWorkbook(fis);
		fis.close();
		Sheet sheet = workbook.getSheet(sheetName);
		if (sheet == null) {
			sheet = workbook.createSheet(sheetName);
		}
		Row row = sheet.getRow(rowId);
		if (row == null) {
			row = sheet.createRow(rowId);
		}
		Cell cell = row.getCell(columnId);
		if (cell == null) {
			cell = row.createCell(columnId);
		}
		cell.setCellValue(dataToPut);
		FileOutputStream fos = new FileOutputStream(excelFilePath);
		workbook.write(fos);
		fos.close();
		workbook.close();
	}

	@Test
	public void getTestDataFromExcel() throws IOException {
		String data = getData(filePath, "Sheet2", 0, 0);
		System.out.println("The data from Excel is : " + data);
	}

	@Test
	public void putAndGetTheCellValue() throws IOException {
		putData(filePath, "Sheet2", 0, 1, "Entering the Test Data here");
		String getEnteredTestData = getData(filePath, "Sheet2", 0, 1);
		System.out.println("The Entered Data from Excel is : " + getEnteredTestData);
	}

}
