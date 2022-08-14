package utils;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class WebDriverTools {
	
	
	@Test
	public void webdriver() throws IOException 
	{
		
		Properties prop=new Properties();
		FileInputStream  fis= new FileInputStream("C:\\Users\\N saikumar\\eclipse-workspace\\SubMavenProject\\src\\test\\java\\MavenProject\\SubMavenProject\\data.properties");
		
		WebDriverManager.chromedriver().setup();
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		
	 String url	=prop.getProperty("url");
	 driver.get(url);
		// return driver;
		
	}

	
}
