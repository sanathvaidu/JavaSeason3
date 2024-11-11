package excels;

import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class ExcelRead1 {

	public static void main(String[] args) throws IOException {
		
		FileInputStream fis1= new FileInputStream("C:\\Users\\hp\\OneDrive\\Desktop\\FLM 15th july\\jars\\Book1.xlsx");
		XSSFWorkbook wb=new XSSFWorkbook(fis1);
		
		XSSFSheet ws =wb.getSheet("Sheet1");
		System.out.println("getLastRowNumws:"+ws.getLastRowNum());
		
		System.out.println(ws.getPhysicalNumberOfRows());// it removes blank rows and give physical number of rows
		XSSFRow row=ws.getRow(1);
		System.out.println("getLastCellNum:" +row.getLastCellNum());
		System.out.println("getPhysicalNumberOfCells" +row.getPhysicalNumberOfCells());
		
		XSSFCell cell=row.getCell(1);
		System.out.println( cell);
	}

}
