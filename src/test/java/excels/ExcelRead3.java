package excels;

import java.io.FileInputStream;

import java.io.IOException;

import org.apache.poi.ss.usermodel.CellType;
import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;



public class ExcelRead3 {

	public static void main(String[] args) throws IOException {
		
		FileInputStream fis1= new FileInputStream("C:\\Users\\hp\\OneDrive\\Desktop\\FLM 15th july\\jars\\Book1.xlsx"		+ ".xlsx");
		XSSFWorkbook wb=new XSSFWorkbook(fis1);
		
		XSSFSheet ws =wb.getSheet("Sheet1");
		
		XSSFRow row=null;
		XSSFCell cell=null;
		for(int i=0;i<ws.getLastRowNum();i++)
		{
			row=ws.getRow(i);
			
			for(int j=0;j<row.getLastCellNum();j++)
			{
				cell=row.getCell(j);
				
		if(cell.getCellType()==CellType.STRING)
		{
			System.out.println(cell.getStringCellValue()+"is a string");
		}
		else if(cell.getCellType()==CellType.NUMERIC)
		{
			System.out.println(cell.getNumericCellValue()+"is a numeric");
		}
		else if(cell.getCellType()==CellType.BOOLEAN)
		{
			System.out.println(cell.getBooleanCellValue()+"is a boolean");
		}
			}
			System.out.println();
	}

}
}