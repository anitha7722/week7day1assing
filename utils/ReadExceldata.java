package utils;

import java.io.File;
import java.io.IOException;

import org.apache.commons.compress.archivers.dump.InvalidFormatException;
import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class ReadExceldata {

	public static String[][] readExcel(String sheetName) throws InvalidFormatException, IOException, org.apache.poi.openxml4j.exceptions.InvalidFormatException {


		//workbook
		File excelFileName = new File("./data/leads.xlsx");
		XSSFWorkbook wbook = new XSSFWorkbook(excelFileName);

		//worksheet
		XSSFSheet sheet = wbook.getSheet(sheetName);

		//get Row count and col count
		int rowCount = sheet.getLastRowNum();
		int colCount = sheet.getRow(0).getLastCellNum();
		String[][] data = new String[rowCount][colCount];
		for (int i = 1; i <= rowCount; i++) {
			XSSFRow row = sheet.getRow(i);
			for (int j = 0; j < colCount; j++) {
				XSSFCell cell = row.getCell(j);
				System.out.println(cell.getStringCellValue());
				data[i-1][j] = cell.getStringCellValue();

			}
}
		return data;
	}
}
