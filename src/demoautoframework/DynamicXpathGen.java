package demoautoframework;

import java.util.ArrayList;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
//import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class DynamicXpathGen {

	public static void main(String[] args) throws InterruptedException {
		
		System.setProperty("webdriver.chrome.driver", "./driver/chromedriver.exe");
		
		WebDriver driver= new ChromeDriver();
		driver.navigate().to("https://www.phptravels.net");
		String pageTitle=driver.getTitle();
		Thread.sleep(10000);		
		System.out.println(pageTitle);

		driver.findElement(By.linkText("MY ACCOUNT")).click();
		driver.findElement(By.linkText("Login")).click();
		Thread.sleep(10000);
		driver.findElement(By.xpath("//*[@id=\"loginfrm\"]/div[1]/div[5]/div/div[1]/input")).sendKeys("user@phptravels.com");
		driver.findElement(By.xpath("//*[@id=\"loginfrm\"]/div[1]/div[5]/div/div[2]/input")).sendKeys("demouser");
		driver.findElement(By.xpath("//*[@id=\"loginfrm\"]/div[1]/div[5]/button")).click();
		Thread.sleep(10000);
		driver.findElement(By.xpath("//*[@id=\"offcanvas-menu\"]/ul/li[1]/a")).click();
		
		Thread.sleep(10000);
		List <WebElement> hotelList =driver.findElements(By.xpath("//*[@id=\"body-section\"]/div[5]/div[3]/div/table/tbody/tr"));
		int size = hotelList.size();
				System.out.println(size);
				List<String> hotelNames = new ArrayList<String>();
				for(int i=1; i<=size; i++) {
					hotelNames.add(driver.findElement(By.xpath("//*[@id=\"body-section\"]/div[5]/div[3]/div/table/tbody/tr["+i+"]/td/div[2]/div/h4/a/b")).getText());
				Thread.sleep(2000);
					//System.out.println(hotelNames.toString());
				}
		
	}

}
