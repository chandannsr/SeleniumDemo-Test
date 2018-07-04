




/**
 * 
 */
package demoautoframework;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

/**
 * @author Chandan N
 *
 */
public class Alerts_iFrame {

	public static void main(String[] args) throws InterruptedException {

		System.setProperty("webdriver.chrome.driver", "./driver/chromedriver.exe");

		WebDriver driver = new ChromeDriver();
		// Alert Message handling
		driver.get("https://www.w3schools.com/jsref/tryit.asp?filename=tryjsref_alert");
		/**
		 * driver.findElement(By.name("cusid")).sendKeys("53920");
		 * driver.findElement(By.name("submit")).submit();
		 */

		driver.switchTo().frame("iframeResult");
		System.out.println("Swtiched to iFrame");
		Thread.sleep(5000);
		driver.findElement(By.xpath("/html/body/button")).click();
		// Switching to Alert
		Alert alert = driver.switchTo().alert();

		// Capturing alert message.
		String alertMessage = driver.switchTo().alert().getText();
		Thread.sleep(5000);
		// Displaying alert message
		System.out.println(alertMessage);
		Thread.sleep(5000);

		// Accepting alert
		alert.accept();
		// alert.dismiss();
		
		driver.quit();
	}

}
