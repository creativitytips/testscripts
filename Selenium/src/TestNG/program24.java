package TestNG;

import java.io.File;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.openxml4j.exceptions.InvalidFormatException;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class program24 {
	
	public static void main(String[] args) throws EncryptedDocumentException, InvalidFormatException, IOException
	{
		File f = new File("C:\\Users\\Sneha\\Desktop");
		Workbook wb = WorkbookFactory.create(f);
		org.apache.poi.ss.usermodel.Sheet sh = wb.getSheet("Sheet1");
		Row r = sh.getRow(0);
		org.apache.poi.ss.usermodel.Cell c = r.getCell(0);
		System.out.println(c.toString());
	}

}
