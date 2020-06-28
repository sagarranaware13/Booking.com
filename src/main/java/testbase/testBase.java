package testbase;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

import org.apache.commons.io.FileUtils;
import org.apache.commons.lang.RandomStringUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.firefox.FirefoxProfile;
import org.openqa.selenium.firefox.ProfilesIni;
import org.openqa.selenium.ie.InternetExplorerDriver;
import io.github.bonigarcia.wdm.WebDriverManager;

public class testBase {

	 public WebDriver driver;
	
	public WebDriver setup() throws Exception
	{
		String browser=readPropertiesFile("browser");

		if(browser.equalsIgnoreCase("firefox"))
		{
			  WebDriverManager.firefoxdriver().setup();
			  driver=new FirefoxDriver();
			  
			}
		else if(browser.equalsIgnoreCase("chrome"))
		{
			  WebDriverManager.chromedriver().setup();
			  driver=new ChromeDriver();
			  
			  }
		else if(browser.equalsIgnoreCase("IE"))
		{
			  WebDriverManager.iedriver().setup();
			  driver=new InternetExplorerDriver();
		}
		return driver;
	}

	public void takeSnapShot() throws Exception{
		
		  String ext = "png";
		  String name = String.format("%s.%s", RandomStringUtils.randomAlphanumeric(8), ext);
		  String fileWithPath=System.getProperty("user.dir") + "\\src\\main\\java\\screenshot\\" + name;
		  
		  System.out.println(fileWithPath);
		  TakesScreenshot scrShot =((TakesScreenshot)driver);
		  File SrcFile=scrShot.getScreenshotAs(OutputType.FILE);
		  File DestFile=new File(fileWithPath);
		  FileUtils.copyFile(SrcFile, DestFile);
	}
	
	public  String readPropertiesFile(String key) throws IOException {
			
		    FileInputStream fis = null;
		    Properties prop = null;
		    String fileName=System.getProperty("user.dir") + "\\src\\main\\java\\config\\properties\\global.properties";
		    
		    try {
		       fis = new FileInputStream(fileName);
		       prop = new Properties();
		       prop.load(fis);
		    
		    } 
		    catch(FileNotFoundException e) {
		       e.printStackTrace();
		    
		    } catch(IOException ioe) {
		       ioe.printStackTrace();
		    
		    } finally {
		       fis.close();
		    }
		    return prop.getProperty(key);
		 }
	}