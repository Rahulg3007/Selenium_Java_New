package Locators;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class XpathByIndex 
{
			
			public static void main(String[] args) throws InterruptedException 
			{
				System.setProperty("webdriver.chrome.driver", "E:\\Selenium_files\\chromedriver-win64\\chromedriver.exe");
				
				WebDriver driver = new ChromeDriver();
				
				driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
				
				Thread.sleep(2000);
				
				driver.findElement(By.xpath("(//input[@class='oxd-input oxd-input--active'])[1]")).sendKeys("Admin");
				
				Thread.sleep(2000);
				
				driver.findElement(By.xpath("(//input[@class='oxd-input oxd-input--active'])[2]")).sendKeys("admin123");
				
				Thread.sleep(2000);
				
				driver.findElement(By.xpath("//button[contains(@class,'oxd-button')]")).click();
					 
			}
}
