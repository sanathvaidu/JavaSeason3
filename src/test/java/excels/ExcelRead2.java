package excels;

import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

import com.microsoft.schemas.office.visio.x2012.main.CellType;

public class ExcelRead2 {

	public static void main(String[] args) throws IOException {
		
		FileInputStream fis1= new FileInputStream("C:\\Users\\hp\\OneDrive\\Desktop\\FLM 15th july\\jars\\Book1.xlsx");
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
				
		System.out.println(cell +"\\+");
			
			
			}
			System.out.println();
	}

}
}