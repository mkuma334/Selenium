package Data_Driven;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;

import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.testng.annotations.Test;

public class Excel_Write_Data_into_Excel  {
  @Test
  public void f() throws Exception 
  {
	    String outputfile="TESTDATA_APACHE_POI\\HI.xlsx";
		FileOutputStream fo=new FileOutputStream(outputfile);
		System.out.println("File Created");

		XSSFWorkbook book=new XSSFWorkbook();
		System.out.println("New Worbook created");

		XSSFSheet sht=book.createSheet("Output_Sheet");
		System.out.println("Sheet Created");

		XSSFRow row1=sht.createRow(1);
		System.out.println("Row Created in excel");

		row1.createCell(0).setCellValue("Test");
		row1.createCell(1).setCellValue("Res");

		//Write Book data into file
		book.write(fo);
		book.close();
		System.out.println("Writing Runtime Data into Excel file completed");
	  
  }
}
//C:\Users\HP\Eclipse 30-06-2022\pac 30-06-22\TESTDATA_APACHE_POI\Output.xlsx.tmp