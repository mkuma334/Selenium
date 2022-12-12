package Data_Driven;

import java.io.FileInputStream;
import java.io.IOException;
import java.sql.Date;
import java.text.SimpleDateFormat;

import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.testng.annotations.Test;

public class  Boolean_And_Data_Cell_Values  {
  @Test
  public void f() throws IOException 
  {
	  String file = "C:\\Users\\HP\\Eclipse 30-06-2022\\pac 30-06-22\\TESTDATA_APACHE_POI\\Input_Book1.xlsx";

		FileInputStream fi = new FileInputStream(file);

		XSSFWorkbook book = new XSSFWorkbook(fi);

		XSSFSheet sheet = book.getSheet("Numarics");
		
		
	java.util.Date	d=sheet.getRow(3).getCell(0).getDateCellValue();
	
	SimpleDateFormat sdf=new SimpleDateFormat("dd/MM/yyy");
	String formated_date=sdf.format(d);
	
	System.out.println("given date is " + formated_date);
	
	
	boolean flag=sheet.getRow(3).getCell(1).getBooleanCellValue();
	System.out.println("flag is " + flag);

  }
}
