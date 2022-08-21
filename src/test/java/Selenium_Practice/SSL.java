package Selenium_Practice;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.firefox.FirefoxOptions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class SSL {

	public static void main(String[] args) {
		
	 

		WebDriverManager.firefoxdriver().setup();		
		FirefoxDriver driver = new FirefoxDriver();

		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		driver.manage().timeouts().pageLoadTimeout(6000l, TimeUnit.SECONDS);		
		driver.manage().timeouts().implicitlyWait(3000l, TimeUnit.SECONDS);		
		//driver.get("https://expire.badssl.com/");
		driver.get("https://google.com");




	}



	}


