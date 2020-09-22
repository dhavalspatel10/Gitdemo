package Objectrepository;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Rediffhomepage {
	//This class is implemented using page object factory method

	WebDriver driver;
	public Rediffhomepage(WebDriver driver3)
	{
	this.driver=driver3;
	PageFactory.initElements(driver3, this);
}
	@FindBy(linkText="rediff.com")
	WebElement Home;
	
	@FindBy(id="srchword")
	WebElement Search;
	
	@FindBy(xpath=".//*[type='submit]")
	WebElement Submit;
	
	public WebElement Home()

	{
		return Home;
	}
	public WebElement Search()

	{
		return Search;
	}
	public WebElement Submit()

	{
		return Submit;
	}
	
	

}
