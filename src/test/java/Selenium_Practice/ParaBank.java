package Selenium_Practice;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;

import io.github.bonigarcia.wdm.WebDriverManager;

public class ParaBank {

	public static void main(String[] args) {
		
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		
		driver.manage().deleteAllCookies();
		driver.manage().timeouts().pageLoadTimeout(6000l, TimeUnit.SECONDS);
		
		driver.get("https://parabank.parasoft.com/index.htm");
		driver.manage().window().maximize();
		
		
		
		driver.findElement(By.xpath("//a[text()='Register']")).click();
		
		//assertion
		String actual =driver.findElement(By.xpath("//h1[@class='title']")).getText();
		System.out.println("actual");
		String expected = "Signing up is easy!";
		System.out.println(expected);
		Assert.assertEquals(actual, expected);
		
		
        driver.findElement(By.xpath("//input[@id='customer.firstName']")).sendKeys("Dilshad");
        driver.findElement(By.id("customer.lastName")).sendKeys("Deepa");
        driver.findElement(By.xpath("//input[@id='customer.address.street']")).sendKeys("1722 sotogrande blvd");
        
        
        
        
        
        
	}

}
