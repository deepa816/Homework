package Selenium_Practice;

import java.util.Iterator;
import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;

import io.github.bonigarcia.wdm.WebDriverManager;

public class WindowSwitch {

	public static void main(String[] args) {
		
		 WebDriverManager.chromedriver().setup();
		 WebDriver driver = new ChromeDriver();
		    
		 driver.manage().window().maximize();
			driver.manage().deleteAllCookies();
			driver.manage().timeouts().pageLoadTimeout(6000l, TimeUnit.SECONDS);
			
			driver.get("https://rahulshettyacademy.com/AutomationPractice/");
	
			driver.manage().timeouts().implicitlyWait(3000l, TimeUnit.SECONDS);   
		
		
		//window switch
				driver.findElement(By.xpath("//*[text()='Open Window']")).click();
				Set<String> window = driver.getWindowHandles();
				
				Iterator<String> it = window.iterator();
				String parent = it.next();
				String child =  it.next();
				
				driver.switchTo().window(child);
				String childTitle = driver.getTitle();//QA Click Academy 
				Assert.assertEquals(childTitle, "QA Click Academy | Selenium,Jmeter,SoapUI,Appium,Database testing,QA Training Academy");
				System.out.println("child page title :---> "+childTitle);
				
				
				driver.switchTo().window(parent);
				String parentTitle = driver.getTitle();//Practice Page
				Assert.assertEquals(parentTitle,"Practice Page");
				System.out.println("parent page title :---> "+parentTitle);

	}

}
