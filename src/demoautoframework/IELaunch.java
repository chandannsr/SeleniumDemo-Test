package demoautoframework;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;

public class IELaunch {

	public static void main(String[] args) throws InterruptedException {

		System.setProperty("webdriver.ie.driver", "./driver/IEDriverServer.exe");
		
		try {
			WebDriver driver = new InternetExplorerDriver();
			driver.get("https://www.amazon.in");
			Thread.sleep(10000);
			driver.close();
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

}
