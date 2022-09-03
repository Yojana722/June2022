package Parameterization;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class Example1_getStringData {

	public static void main(String[] args) throws EncryptedDocumentException, IOException {
		//1. getStringCellValue() - to read string data
		FileInputStream file = new FileInputStream("E:\\Yojana\\new\\JUNE2022\\New folder\\Excel1.xlsx");
		//String data = WorkbookFactory.create(file).getSheet("Sheet1").getRow(0).getCell(0).getStringCellValue();
		//System.out.println(data);
		
		//2. getNumericCellValue - to read numeric data
		/*double data1 = WorkbookFactory.create(file).getSheet("Sheet1").getRow(0).getCell(1).getNumericCellValue();
		System.out.println(data1);//100.0
		
		int data2 = (int)data1;//explicit casting
		System.out.println(data2);//100*/
		
		//3. getBooleanCellValue - to read boolean data
		//boolean data3 = WorkbookFactory.create(file).getSheet("Sheet1").getRow(0).getCell(2).getBooleanCellValue();
		//System.out.println(data3);//true
		
		//String data4 = WorkbookFactory.create(file).getSheet("Sheet1").getRow(0).getCell(3).getStringCellValue();
		//System.out.println(data4);//200.50
		
		//4. getLastRowNum -> returns number of rows from 0th index
		/*int rowSize = WorkbookFactory.create(file).getSheet("Sheet1").getLastRowNum();
		System.out.println(rowSize);//3
		System.out.println(rowSize+1);//4 - actual row count*/
		
		
		//5. getLastCellNum -> it returns number of values present in cell/column
		short cellSize = WorkbookFactory.create(file).getSheet("Sheet1").getRow(1).getLastCellNum();
		System.out.println(cellSize);//3
		

		
		
	}
}
