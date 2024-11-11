package regression;

import java.io.FileInputStream;
import java.io.IOException;
import java.time.Duration;
import java.util.Properties;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.Test;

public class ValidateLogin {
	WebDriver driver;
	@Test
	public void validateLoginTest() throws IOException
	{
		FileInputStream fis1=new FileInputStream("properties\\config.properties");
		
		 Properties  configProp=new Properties();
		 
		 configProp.load(fis1);
		 
		String browserName=configProp.getProperty("browser");
		
		if(browserName.equalsIgnoreCase("chrome"))
		{
		driver=new ChromeDriver();
		 
		}	
		else if(browserName.equalsIgnoreCase("firefox"))
		{
			driver=new FirefoxDriver();
		}
		else if(browserName.equalsIgnoreCase("edge"))
		{
			driver=new EdgeDriver();
		}
		driver.get(configProp.getProperty("url"));
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(Long.parseLong(configProp.getProperty("implicityWait"))));
}
	
	@AfterMethod
	public void teardown()
	{
		driver.quit(); 
	}
}