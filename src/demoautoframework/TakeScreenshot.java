package demoautoframework;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class TakeScreenshot {

	public static void main(String[] args) throws InterruptedException {

		System.setProperty("webdriver.chrome.driver", "./driver/chromedriver.exe");

		WebDriver driver = new ChromeDriver();
		driver.navigate().to("https://www.phptravels.net");
		String pageTitle = driver.getTitle();
		Thread.sleep(10000);
		System.out.println(pageTitle);

		File src = ((TakesScreenshot) driver).getScreenshotAs(OutputType.FILE);
		try {

			FileUtils.copyFile(src, new File("./screenshot/" + System.currentTimeMillis() + ".png"));
		}

		catch (IOException e)

		{

			System.out.println(e.getMessage());

		}

	}

}
