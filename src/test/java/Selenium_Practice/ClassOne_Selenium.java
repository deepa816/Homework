package Selenium_Practice;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;

import io.github.bonigarcia.wdm.WebDriverManager;
public class ClassOne_Selenium {

	public static void main(String[] args) throws InterruptedException {
		
		
		
		WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();
        driver.get("https://rahulshettyacademy.com/AutomationPractice/");
        
        String actual  = driver.getTitle();
		String expected ="Practice Page";
		Assert.assertEquals(actual, expected);



		driver.findElement(By.id("autocomplete")).clear();
		driver.findElement(By.id("autocomplete")).sendKeys("hello");
		Thread.sleep(2000);
		driver.findElement(By.id("autocomplete")).clear();


		driver.findElement(By.cssSelector("input[value='radio3']")).click();
		boolean nes= driver.findElement(By.cssSelector("input[value='radio3']")).isSelected();
	     Assert.assertTrue(nes, expected);

		

		Thread.sleep(4000);


		driver.quit();
        
       
	}

}
