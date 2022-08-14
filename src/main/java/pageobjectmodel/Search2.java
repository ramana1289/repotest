package pageobjectmodel;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class Search2 {
	
	public WebDriver driver;
	
	private  By emFd=	By.id("identify_email");
	
	
	 private  By subBut=	By.xpath("//*[@type='submit']");
	 
	 
	 public Search2(WebDriver driver)
	 {
		  this.driver= driver;
	}


	public WebElement getEmailF()
	 {
		return driver.findElement(emFd);	
	}
	 
	 
	 public WebElement getSubButton()
	 {
		return driver.findElement(subBut);
	 }

}
