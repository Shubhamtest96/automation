package test;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class FirstPrac {
	

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "F:\\Selenuim jars\\ChromeDriveree\\chromedriver.exe");
		
		
		WebDriver driver = new ChromeDriver () ;
		
		driver.get("https://www.google.com/");
		System.out.println("Browser opening......");
		
		driver.findElement(By.name("q")).sendKeys("Automation testing");
        Thread.sleep(2000);
		driver.close();
		System.out.println("closing the browser...");
	}
}
	
