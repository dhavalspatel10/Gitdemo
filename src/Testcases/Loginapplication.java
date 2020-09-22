package Testcases;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import Objectrepository.Rediffhomepage;
import Objectrepository.Rediffloginpage;
import Objectrepository.Rediffloginpage;

public class Loginapplication {

		@Test
		public void Login()

		{
			System.setProperty("webdriver.chrome.driver", "C:\\Users\\DhavalDipal\\Downloads\\chromedriver_win32//chromedriver.exe");
			WebDriver driver=new ChromeDriver();
			 
			driver.get("https://mail.rediff.com/cgi-bin/login.cgi");
			Rediffloginpage rd=new Rediffloginpage(driver);
			rd.Emailid().sendKeys("d2");
			rd.Password().sendKeys("hello");
			rd.Submit().click();
			Rediffhomepage rf=new Rediffhomepage(driver);
			rf.Home().click();
			rf.Search().click();
			rf.Search().sendKeys("Hi");
			rf.Search().submit();
			
			
		}

}
