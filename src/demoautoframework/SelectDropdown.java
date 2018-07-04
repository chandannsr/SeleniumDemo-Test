/**
 * 
 */
package demoautoframework;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

/**
 * @author Chandan N
 *
 */
public class SelectDropdown {

	public static void main(String[] args) {

		try {
			System.setProperty("webdriver.chrome.driver", "./driver/chromedriver.exe");
			String baseURL = "http://www.phptravels.net/";
			WebDriver driver = new ChromeDriver();
			driver.get(baseURL);
	
			driver.findElement(By.linkText("MY ACCOUNT")).click();
			driver.findElement(By.linkText("Login")).click();
			Thread.sleep(10000);
			driver.findElement(By.xpath("//*[@id=\"loginfrm\"]/div[1]/div[5]/div/div[1]/input"))
					.sendKeys("user@phptravels.com");
			driver.findElement(By.xpath("//*[@id=\"loginfrm\"]/div[1]/div[5]/div/div[2]/input")).sendKeys("demouser");
			driver.findElement(By.xpath("//*[@id=\"loginfrm\"]/div[1]/div[5]/button")).click();
			Thread.sleep(10000);
			
			driver.findElement(By.xpath("//*[@id=\"collapse\"]/ul[1]/li[3]/a")).click();
			Thread.sleep(10000);
						
			Select dropDown = new Select(driver.findElement(By.xpath("//*[@id=\"body-section\"]/div[2]/div/form/div[9]/div[3]/div/select")));
			// Selecting by Index
			dropDown.selectByIndex(2);
			Thread.sleep(5000);
			
			dropDown.selectByIndex(1);
			Thread.sleep(5000);
			
			dropDown.selectByIndex(0);
			
			Thread.sleep(5000);
/*
			// Select by Value
			dropDown.selectByValue("business");
			Thread.sleep(5000);

			// Select By Visible Text
			dropDown.selectByVisibleText("Economy");
			Thread.sleep(5000);
*/
	
		} catch (Exception e) {
			e.printStackTrace();
		}

	}
	
	
	
	

}
