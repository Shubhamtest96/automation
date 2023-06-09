package test;

import java.io.File;
import java.io.IOException;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import com.google.common.io.Files;

public class Screenshot {
	
	public static void main (String []args) throws InterruptedException, IOException {
		
		System.setProperty("chromedriver.driver" , "");
		
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://amazon.in");
		Thread.sleep(1000);
		
		
		driver.manage().window().maximize();
		// ref link https://www.comrevo.com/2022/06/how-to-take-screenshot-in-selenium.html
		
		File f = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
		Files.copy(f,new File("C:\\Users\\Pechu\\Downloads\\sample\\amazonscreenshot1.jpg"));
		
	Thread.sleep(1000);
	driver.close();
		
	}

}
