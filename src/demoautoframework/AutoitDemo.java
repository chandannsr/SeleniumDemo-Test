package demoautoframework;

import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class AutoitDemo {

	public static void main(String[] args) throws IOException, InterruptedException {
		System.setProperty("webdriver.chrome.driver", "./driver/chromedriver.exe");
		 WebDriver driver=new ChromeDriver();			

		 driver.get("http://demo.guru99.com/test/autoit.html");			
		 Thread.sleep(1000);
		 driver.findElement(By.xpath("(//*[@class='button'])[1]")).click();			
		 Thread.sleep(10000);
		    driver.findElement(By.id("input_3")).sendKeys("TESTER");                                 					
		    driver.findElement(By.xpath("//*[@id=\"input_4\"]")).sendKeys("test.tester@gmail.com");					
		    driver.findElement(By.xpath("//*[@id=\"input_5\"]")).click();			
		    Thread.sleep(10000);
		    // below line execute the AutoIT script .
		     Runtime.getRuntime().exec("D:\\DummyDocUpload.exe");
		     Thread.sleep(10000);
			     
		    driver.findElement(By.xpath("//*[@id=\"input_6\"]")).sendKeys("AutoIT in Selenium");					
		    driver.findElement(By.xpath("//*[@id=\"input_2\"]")).click();
		  //  driver.close();

	}

}
