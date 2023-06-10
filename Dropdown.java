package test;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Dropdown {

	public static void main(String[] args) throws InterruptedException {
		System.out.println("Executing...");
		System.setProperty("webdriver.chrome.driver", "F:\\Selenuim jars\\ChromeDriveree\\chromedriver.exe");
		
		WebDriver driver = new ChromeDriver ();
		 driver.navigate().to("https://trytestingthis.netlify.app/");
		 System.out.println("Opening the app...");
	
		 driver.navigate().refresh();      
		   driver.manage().window().maximize();
		   System.out.println("Maximize the app...");
		 Thread.sleep(2000);
		 
		WebElement dropdown =  driver.findElement(By.id("option"));
          Select selectObject = new Select(dropdown);
        // select value from the dropdown   
          selectObject.selectByIndex(1);
          Thread.sleep(1000);
          driver.quit();
          System.out.println("Closing...");
		// TODO Auto-generated method stub

	}

}
