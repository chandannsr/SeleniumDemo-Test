

package demoautoframework;

import java.util.ArrayList;

//import java.util.ArrayList;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class AmazonUC {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "./driver/chromedriver.exe");
		try {
			WebDriver driver= new ChromeDriver();
			driver.navigate().to("http://www.amazon.in/");//launch amazon url
			driver.manage().window().maximize();
			driver.findElement(By.xpath("(//*[@id='nav-tools']/a)[1]")).click();//signin
			driver.findElement(By.xpath("//*[@id='ap_email']")).sendKeys("9731121995");//enter email
			Thread.sleep(5000);
			driver.findElement(By.xpath("//*[@id='continue']")).click();
			driver.findElement(By.xpath("//*[@id='ap_password']")).sendKeys("Amazon@123");//enter password
			driver.findElement(By.xpath("//*[@id='signInSubmit']")).click();//login
			driver.findElement(By.xpath("//*[@id='twotabsearchtextbox']")).sendKeys("Watches");//search watches
			driver.findElement(By.xpath("//*[@id='nav-search']/form/div[2]/div/input")).click();
			driver.findElement(By.xpath("//*[@id='result_1']")).click();//Select anyProduct off first frame
			
			 @SuppressWarnings("rawtypes")
			ArrayList tabs = new ArrayList(driver.getWindowHandles());
			driver.switchTo().window((String) tabs.get(1));
			driver.findElement(By.xpath("//*[@id='add-to-cart-button']")).click();//clickon addcart Thread.sleep(5000);

			Thread.sleep(5000);
			driver.quit();
		} catch (Exception e) {
			e.printStackTrace();
		} 

	}

}
