package demoautoframework;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class VisibleElement {

	public static void main(String[] args) throws InterruptedException {
	    System.setProperty("webdriver.chrome.driver", "./driver/chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        JavascriptExecutor js = (JavascriptExecutor) driver;

        //Launch the application		
        driver.get("http://demo.guru99.com/test/guru99home/");

        //Find element by link text and store in variable "Element"        		
        WebElement Element = driver.findElement(By.linkText("Linux"));

        //This will scroll the page till the element is found		
        js.executeScript("arguments[0].scrollIntoView();", Element);
   
        Thread.sleep(10000);
        //driver.quit();
        WebElement Element1 = driver.findElement(By.xpath("//*[@id=\"rt-feature\"]/div[1]/div/h3"));
        js.executeScript("arguments[0].scrollIntoView();", Element1);  
      
        Thread.sleep(10000);
        
        //Let's go back to Linux Text again
        js.executeScript("arguments[0].scrollIntoView();", Element);
        
        Thread.sleep(10000);
        
        
        
        
	}

}
