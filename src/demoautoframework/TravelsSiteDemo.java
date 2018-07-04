package demoautoframework;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class TravelsSiteDemo {

	public static void main(String[] args) {

		System.setProperty("webdriver.chrome.driver", "./driver/chromedriver.exe");
		
		try {
			WebDriver driver= new ChromeDriver();
			driver.navigate().to("https://www.phptravels.net/");
			String pageTitle=driver.getTitle();
			
			
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
