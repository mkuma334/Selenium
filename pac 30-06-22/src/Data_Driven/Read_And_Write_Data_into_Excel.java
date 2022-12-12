package Data_Driven;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.testng.annotations.Test;

public class Read_And_Write_Data_into_Excel {
  @Test
  public void f() throws IOException 
  {
	  String s="C:\\Users\\HP\\Eclipse 30-06-2022\\pac 30-06-22\\TESTDATA_APACHE_POI\\HI.xlsx";
	  
	  FileInputStream fi=new FileInputStream(s);
	  
	  XSSFWorkbook book=new XSSFWorkbook(fi);
	  
	  
	  XSSFSheet sheet=book.getSheet("Output_Sheet");
	  
	  XSSFRow row=sheet.createRow(5);
	  
	  row.createCell(0).setCellValue("love");
	  
	  sheet.createRow(6).createCell(2).setCellValue("krishna");

	  
	  sheet.createRow(7).createCell(0).setCellValue("Harikiran");

	  
	  
	  FileOutputStream fo=new FileOutputStream("TESTDATA_APACHE_POI\\FILE2");
	  
	  book.write(fo);
	  
	  book.close();
  }
}
