package Selenium_Practice;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class MyPractice_Selenium {

	public static void main(String[] args) throws InterruptedException {
		
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		
		
		driver.get("https://rahulshettyacademy.com/AutomationPractice/");
		driver.manage().window().maximize();

		
		driver.findElement(By.xpath("//input[@value='radio2']")).click();
		driver.findElement(By.xpath("//input[@id='autocomplete']")).sendKeys("Bangladesh");
		
		//dropdown -Select Class
		WebElement sl = driver.findElement(By.xpath("//select[@id='dropdown-class-example']"));
		Select select = new Select(sl);
		select.selectByVisibleText("Option1");
		driver.findElement(By.xpath("//input[@id='checkBoxOption1']")).click();
		
		Thread.sleep(6000);
		//alerts
		driver.findElement(By.xpath("//input[@id='alertbtn']")).click();
		driver.switchTo().alert().accept();
		
		//action class
		
		WebElement mouse= driver.findElement(By.xpath("//*[text()='Mouse Hover']"));
		JavascriptExecutor js =(JavascriptExecutor)driver;
		js.executeScript("arguments[0].scrollIntoView;",mouse);
		
		Actions action =new Actions(driver);
		action.moveToElement(mouse).perform();
		
		WebElement mouse2 = driver.findElement(By.xpath("//*[contains(text(),'Reload')]"));
		action.moveToElement(mouse2).click().perform();
		
		Thread.sleep(6000);
		
		
		
		
		
		
		driver.findElement(By.xpath("//input[@name='enter-name']")).clear();
		driver.findElement(By.xpath("//input[@name='enter-name']")).sendKeys("Dilshad");
		
		Thread.sleep(6000);
		
		driver.findElement(By.xpath("//input[@id='confirmbtn']")).click();
		driver.switchTo().alert().accept();
		
		Thread.sleep(6000);
		
		driver.quit();
		
		
		

	}

}
