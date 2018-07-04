package demoautoframework;

import java.util.ArrayList;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
//import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class JavascriptExector {

	public static void main(String[] args) throws InterruptedException {
		
		System.setProperty("webdriver.chrome.driver", "./driver/chromedriver.exe");
		
		WebDriver driver= new ChromeDriver();
		driver.navigate().to("https://www.phptravels.net");
		String pageTitle=driver.getTitle();
		Thread.sleep(10000);		
		
		
		
		System.out.println(pageTitle);

		driver.findElement(By.linkText("MY ACCOUNT")).click();
		/** driver.findElement(By.linkText("Login")).click();
		Thread.sleep(10000);
		driver.findElement(By.xpath("//*[@id=\"loginfrm\"]/div[1]/div[5]/div/div[1]/input")).sendKeys("user@phptravels.com");
		driver.findElement(By.xpath("//*[@id=\"loginfrm\"]/div[1]/div[5]/div/div[2]/input")).sendKeys("demouser");
		driver.findElement(By.xpath("//*[@id=\"loginfrm\"]/div[1]/div[5]/button")).click();
		Thread.sleep(10000);

		driver.findElement(By.xpath("//*[@id=\"offcanvas-menu\"]/ul/li[1]/a")).click();
		
		Thread.sleep(15000); */
		JavascriptExecutor js = ((JavascriptExecutor) driver);
		//Scroll Down
		js.executeScript("window.scrollTo(0, document.body.scrollHeight);");
		//Scroll Up
		Thread.sleep(5000);
		js.executeScript("window.scrollTo(0, -document.body.scrollHeight);");
 
		Thread.sleep(5000);
		
		
		driver.quit();
	}		
				
}
