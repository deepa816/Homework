package Selenium_Practice;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Selenium2ND_class {

//Select Class -----------------------------------------------	
//JavascriptExecutor	---------------------------------
//Actions class ------------------------------------------------
//assertion	---------------------------------------------------
	public static void main(String[] args) throws InterruptedException {

		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();

		driver.manage().timeouts().pageLoadTimeout(6000l, TimeUnit.SECONDS);
		driver.manage().timeouts().implicitlyWait(3000l, TimeUnit.SECONDS);

		// WebDriver driver = new FirefoxDriver();

		driver.get("https://rahulshettyacademy.com/AutomationPractice/");

		//Page title test 
		String actual = driver.getTitle();// Practice Page
		String expected = "Practice Page";
		Assert.assertEquals(actual, expected);
		
		//Selecting radio button 
		driver.findElement(By.cssSelector("input[value='radio3']")).click();
		boolean nes = driver.findElement(By.cssSelector("input[value='radio3']")).isSelected();
		Assert.assertTrue(nes);

		//Giving Sendkeys to text field 
		driver.findElement(By.id("autocomplete")).clear();
		driver.findElement(By.id("autocomplete")).sendKeys("hello");
		Thread.sleep(2000);
		driver.findElement(By.id("autocomplete")).clear();
		
		
	//WebElement	se = driver.findElement(By.cssSelector("#dropdown-class-example"));
	
	Select select =  new Select(driver.findElement(By.cssSelector("#dropdown-class-example")));
	
	//select.selectByIndex(1);
	select.selectByVisibleText("Option3");
	//select.selectByValue("option2");
	
	System.out.println("before checked : "+driver.findElement(By.id("checkBoxOption2")).isSelected());
	
    driver.findElement(By.id("checkBoxOption2")).click();
	
	System.out.println("after checked "+driver.findElement(By.id("checkBoxOption2")).isSelected());
	boolean b = driver.findElement(By.id("checkBoxOption2")).isSelected();
	
	Assert.assertTrue(b);
	
	driver.findElement(By.xpath("//*[@value='Alert']")).click();
	Thread.sleep(3000);
	
	String text = driver.switchTo().alert().getText();
	//driver.switchTo().alert().accept();
	
	if (text.equalsIgnoreCase("Hello , share this practice page and share your knowledge")) {
		driver.switchTo().alert().accept();
	}else {
		System.out.println("Thats no a currect alert");
	}
	
	
	WebElement sd  = driver.findElement(By.xpath("//*[text()='Mouse Hover']"));
	
	JavascriptExecutor  js = (JavascriptExecutor) driver;
	js.executeScript("arguments[0].scrollIntoView();", sd);
	
	Actions action = new Actions(driver);
	
	action.moveToElement(sd).perform();
	
	WebElement sdd = driver.findElement(By.xpath("//*[contains(text(),'Top')]"));
	action.moveToElement(sdd).click().perform();

		Thread.sleep(3000);

		driver.quit();

	}


}