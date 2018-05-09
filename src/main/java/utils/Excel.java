package utils;

import java.io.FileInputStream;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class Excel 
{

	Workbook wb;

	public Excel() throws Throwable{

		FileInputStream fis=new FileInputStream("./inputData/inputSheet.xlsx");

		wb=WorkbookFactory.create(fis);
	

	}

	public int rowCount(String sheet)
	{
		return 	wb.getSheet(sheet).getLastRowNum();

	}


	public int colCount(String sheet, int rowNum) {

		return wb.getSheet(sheet).getRow(rowNum).getLastCellNum();

	}


	public String getData(String sheet, int rowNum, int cellNum) {

		String a = wb.getSheet(sheet).getRow(rowNum).getCell(cellNum).toString();

		
		return a;

	}

	public void setData(String testSheet, int j, int i, String string) {
		
		// TODO Auto-generated method stub
		
	}


}
