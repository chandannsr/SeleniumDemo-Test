package demoautoframework;

import java.util.ArrayList;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class TabsSwitch {

	public static void main(String[] args) throws InterruptedException {

		try {
			System.setProperty("webdriver.chrome.driver", "./driver/chromedriver.exe");

			WebDriver driver = new ChromeDriver();
			driver.navigate().to("https://www.phptravels.net");
			String pageTitle = driver.getTitle();
			Thread.sleep(10000);
			System.out.println(pageTitle);

			driver.findElement(By.linkText("MY ACCOUNT")).click();
			driver.findElement(By.linkText("Login")).click();
			Thread.sleep(10000);
			driver.findElement(By.xpath("//*[@id=\"loginfrm\"]/div[1]/div[5]/div/div[1]/input"))
					.sendKeys("user@phptravels.com");
			driver.findElement(By.xpath("//*[@id=\"loginfrm\"]/div[1]/div[5]/div/div[2]/input")).sendKeys("demouser");
			driver.findElement(By.xpath("//*[@id=\"loginfrm\"]/div[1]/div[5]/button")).click();
			Thread.sleep(10000);
			driver.findElement(By.xpath("//*[@id='bookings']/div[2]/div[4]/a")).click();

			// New Tab open here after Clicking on invoice..
			// Switch the control of tab to new tab

			ArrayList tabs = new ArrayList(driver.getWindowHandles());
			driver.switchTo().window((String) tabs.get(1));

			// Verifying the emenet in new Tab
			String title = driver.getTitle();
			System.out.println("Switch to Next Tab : Page Title is --> " + title);
			Thread.sleep(10000);

			driver.switchTo().window((String) tabs.get(0));
			title = driver.getTitle();
			System.out.println("Switch back to First Page Title is --> " + title);
			Thread.sleep(10000);
			driver.close();
			
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

}
