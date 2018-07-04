package demoautoframework;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ChromeLaunch {

	public static void main(String[] args) throws InterruptedException {
		// 

		System.setProperty("webdriver.chrome.driver", "./driver/chromedriver.exe");
		
		try {
			WebDriver driver= new ChromeDriver();
			driver.navigate().to("https://google.co.in");
			String pageTitle=driver.getTitle();
			
			// insert search data to seach box in google
			
			System.out.println(pageTitle);
	
			WebElement searchBox;
	searchBox =	driver.findElement(By.id("lst-ib"));
	searchBox.sendKeys("Chandan Navara \n");
	
	
			Thread.sleep(10000);
			
			driver.quit();
		} catch (Exception e) {
			
			e.printStackTrace();
		}
		
	}

}
