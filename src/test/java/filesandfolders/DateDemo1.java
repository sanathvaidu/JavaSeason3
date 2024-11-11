package filesandfolders;

import java.text.SimpleDateFormat;
import java.util.Date;

public class DateDemo1 {

	public static void main(String[] args) {
		
	
		 System.out.println(new Date());
		 
		 String pattern = "yyyy-MM-dd HH:mm:ss";
		 SimpleDateFormat simpleDateFormat = new SimpleDateFormat(pattern);
		 
		 String date = simpleDateFormat.format(new Date());
		 System.out.println(date);
		 date=date.replace(":", "-");
		 System.out.println(date);
		

	}

}
