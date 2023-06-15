package test;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Locators {
	
	public static void main(String [] args) throws InterruptedException {
		
		
		
		System.setProperty("webdriver.chrome.driver", "F:\\Selenuim jars\\ChromeDriveree\\chromedriver.exe");
		
		WebDriver driver = new ChromeDriver () ; 
		// driver.get("https://www.google.com/");
		 driver.get("http://www.automationpractice.pl/index.php?");
		 
		 driver.manage().window().maximize();
		 
		 System.out.println("Searchbox...");
		// driver.findElement(By.id("APjFqb")).sendKeys("Automation search");
		 
		 
		 driver.findElement(By.xpath("//input[@id='search_query_top']")).sendKeys("T-shirts");
		 System.out.println("Serach done...");

		 Thread.sleep(3000);
		 driver.quit();

				 System.out.println("Closing the browser...");
		
	}

}
