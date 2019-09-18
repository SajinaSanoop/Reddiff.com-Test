package resources;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class base {
	public Properties p;
	public static WebDriver driver;
	
	public WebDriver initializeDriver() throws IOException 
	{
	p=new Properties();
	FileInputStream fis=new FileInputStream("C:\\Users\\Sanoop\\Eclipse_Workspace_Sajina\\Rediff_Testing\\src\\main\\java\\resources\\data.properties");
	p.load(fis);
	String browser=p.getProperty("browser");

	if(browser.equalsIgnoreCase("chrome"))
	{
		System.out.println(p.getProperty("url"));
		System.out.println(browser);
		driver=new ChromeDriver();
		
	}
	driver.manage().window().maximize();
	return driver;
	}
}
