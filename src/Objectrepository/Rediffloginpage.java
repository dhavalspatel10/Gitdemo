package Objectrepository;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class Rediffloginpage 
//This class is implemented in normal object pattern style
	{

		WebDriver driver;
		public Rediffloginpage(WebDriver driver2)
		{
		this.driver=driver2;
	}
		
		

		By username=By.xpath(".//*[@id='login1']");
		By password=By.name("passwd");
	    By go=By.name("proceed");
		

public WebElement Emailid()

{
	return driver.findElement(username);
}
public WebElement Password()

{
	return driver.findElement(password);
}
public WebElement Submit()

{
	return driver.findElement(go);
}
	}
