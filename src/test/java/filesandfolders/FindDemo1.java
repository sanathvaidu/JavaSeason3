package filesandfolders;

import java.io.File;
import java.io.IOException;

public class FindDemo1 {

	public static void main(String[] args) throws IOException   {
		
		File f1=new File("C:\\Users\\hp\\OneDrive\\Desktop\\FLM 15th july\\jars\\abc.txt");
		System.out.println(f1.createNewFile());

	}

}
