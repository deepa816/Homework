package Selenium_Practice;

import java.util.Iterator;
import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class WindowHandles {

	public static void main(String[] args) throws InterruptedException {
		
		
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		driver.manage().timeouts().pageLoadTimeout(6000l, TimeUnit.SECONDS);
		
		//getWindowHandle()
		driver.get("https://opensource-demo.orangehrmlive.com/");
		String windowParent = driver.getWindowHandle();//return ID of the single browser window
		System.out.println(windowParent);//CDwindow-numbers
		
		Thread.sleep(5000);
		//getWindowHandles()
       driver.findElement(By.xpath("//a[text()='OrangeHRM, Inc']")).click();//Open another browser window -child window
       Set<String>windowChild = driver.getWindowHandles();
       
       //First method- iterator()
       Iterator<String> it =windowChild.iterator();
       
       String parentWindow=it.next();
       String childWindow=it.next();
       
       System.out.println("parentWindow :" +parentWindow);
       System.out.println("childWindow  :" +childWindow);
       
       
       //How to use Switching multiple window's
       driver.switchTo().window(parentWindow);
       System.out.println("parentWindow title:"  + driver.getTitle());
       
       
       driver.switchTo().window(childWindow);
       System.out.println("childWindow:"  + driver.getTitle());
       
       driver.quit();//close browser
       
    // driver.close();//close only current browser
       
       
       
}
}
