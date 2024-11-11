package filesandfolders;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ScreenshotDemo1 {

	public static void main(String[] args) throws IOException {
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.amazon.in/");
		driver.manage().window().maximize();
		
		String projectFolder=System.getProperty("user.dir");
		
		
		System.out.println(projectFolder);
		
		File screenshotFolder=new File(projectFolder+"\\screenshots");
		
		screenshotFolder.mkdir();
		
		File srcFile=((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
		
		FileUtils.copyFile(srcFile, new File(screenshotFolder+"\\adactin1.png"));
		
		driver.quit();

	}

}
	
		
		