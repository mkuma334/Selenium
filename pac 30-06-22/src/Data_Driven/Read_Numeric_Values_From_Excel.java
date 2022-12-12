package Data_Driven;

import java.io.FileInputStream;
import java.io.FileNotFoundException;

import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.testng.annotations.Test;

public class Read_Numeric_Values_From_Excel {
	@Test
	public void f() throws Exception {
		String file = "C:\\Users\\HP\\Eclipse 30-06-2022\\pac 30-06-22\\TESTDATA_APACHE_POI\\Input_Book1.xlsx";

		FileInputStream fi = new FileInputStream(file);

		XSSFWorkbook book = new XSSFWorkbook(fi);

		XSSFSheet sheet = book.getSheet("Numarics");

		String productname = sheet.getRow(1).getCell(0).getStringCellValue();

		System.out.println("productname is " + productname);

		double productid = sheet.getRow(1).getCell(1).getNumericCellValue();

		Double b = productid;

		long productid_in_long = b.longValue();

		System.out.println("product id in long " + productid_in_long);

		double price = sheet.getRow(1).getCell(2).getNumericCellValue();

		System.out.println("price is " + price);

		double quantity = sheet.getRow(1).getCell(3).getNumericCellValue();

		Double D = quantity;

		int quantity_in_int = D.intValue();

		System.out.println("quantity in int " + quantity_in_int);

		double contactno = sheet.getRow(1).getCell(4).getNumericCellValue();

		Double D1 = contactno;

		long contactno_in_long = D1.longValue();

		System.out.println("contact number in long " + contactno_in_long);

	}
}
