package selenium_test;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;

public class OpenDriver {
	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "D:\\webdriver\\chromedriver-win64\\chromedriver-win64\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.facebook.com/");
		
//		System.setProperty("webdriver.edge.driver", "D:\\webdriver\\edgedriver_win64\\msedgedriver.exe");
//		WebDriver	 driver = new EdgeDriver();
//		driver.manage().window().maximize();
//		driver.get("https://www.facebook.com/");
	}
}
