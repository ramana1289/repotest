package pageobjectmodel;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class LoginPage {
	
	public WebDriver driver;
	
	private  By emailid=By.id("email");
	private   By pass = By.id("pass");
     private  By  button= By.xpath("//button[@value='1']");
	    
	    public LoginPage(WebDriver driver)
	    {
	    	   this.driver=driver;
			
		}
		
		public WebElement getEmailId()
	    {
	   
			return driver.findElement(emailid);
	    }
	    public WebElement getPassword()
	    {
	    	 return driver.findElement(pass);
	    }
	    public WebElement getButton()
	    {
	    	return driver.findElement(button);
	    }

}
