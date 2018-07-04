package demoautoframework;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class FirefoxLaunch {

	public static void main(String[] args) throws InterruptedException {

		System.setProperty("webdriver.gecko.driver", "./driver/geckodriver.exe");		
		WebDriver driver = new FirefoxDriver();
		
		driver.navigate().to("https://www.google.com");
		
		//driver.get("https://www.google.co.in");
		
		System.out.println("Opened google search successfully!!!");
		
		Thread.sleep(10000);
		
		driver.quit();
		
		
	}
}
