package excels;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class ExcelWrite {

	public static void main(String[] args) throws IOException {
		
		FileInputStream fis1= new FileInputStream("C:\\Users\\hp\\OneDrive\\Desktop\\FLM 15th july\\jars\\Book1.xlsx" );
		XSSFWorkbook wb
		=new XSSFWorkbook(fis1);
		
		XSSFSheet ws =wb.getSheet("Sheet1");
		//case 1,modifying an existing cell
		//ws.getRow(0).getCell(1).setCellValue("123");
		//ws.getRow(0).getCell(1).setCellValue("XYZ");
		//ws.getRow(1).createCell(3).setCellValue("python");
		ws.createRow(3).createCell(0).setCellValue("cypress");
		
		FileOutputStream fos1=new FileOutputStream("C:\\Users\\hp\\OneDrive\\Desktop\\FLM 15th july\\jars\\Book1.xlsx");
		
		wb.write(fos1);
		wb.close();
		
		
		

	}

}
