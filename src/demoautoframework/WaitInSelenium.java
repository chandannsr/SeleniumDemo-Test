package demoautoframework;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class WaitInSelenium {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "./driver/chromedriver.exe");

		try {
			WebDriver driver = new ChromeDriver();
			// Implicit Wait
			//driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

		//	driver.get("https://www.google.com");
		//	WebElement myDynamicElement = driver.findElement(By.id("lst-ib"));
		//	myDynamicElement.sendKeys("This is Selenium Implicit Demo wait Opration");
			
			// Explicit Wait
			driver.wait(10000);
			
			WebDriverWait wait = new WebDriverWait(driver, 40000);
			WebElement element = wait.until(ExpectedConditions.elementToBeClickable(By.id("lst-ib")));
			element.sendKeys("This is a demo for Explicit Wait ");

		//	driver.quit();
		} catch (Exception e) {
			e.printStackTrace();
		}

	}

}
