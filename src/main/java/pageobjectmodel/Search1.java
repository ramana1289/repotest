package pageobjectmodel;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class Search1 {
	
	
	public WebDriver driver;
	private  By   frgotpass =By.linkText("Forgotten password?");

	  
	    
	  
	  public Search1(WebDriver driver) 
	  {
	 	 this.driver =driver;
	 }


	
	public WebElement getForgotPassword()
	  {
	 	 
	 	return driver.findElement(frgotpass);
	  }
	     
}
