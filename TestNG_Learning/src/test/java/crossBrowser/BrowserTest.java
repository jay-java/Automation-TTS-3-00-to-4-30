package crossBrowser;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import connection.DriverConnection;

public class BrowserTest {
	@Parameters("browser")
	@Test
	public void fbLoginTest(String browser) {
		WebDriver driver = null;
		if (browser.equals("chrome")) {
			driver = DriverConnection.getDriver("https://www.facebook.com/");
		}
		if (browser.equals("ff")) {
			System.setProperty("webdriver.gecko.driver", "D:\\webdriver\\geckodriver-v0.34.0-win32\\geckodriver.exe");
			driver = new FirefoxDriver();
			driver.get("https://www.facebook.com/");

		}
		if (browser.equals("edge")) {
			System.setProperty("webdriver.edge.driver", "D:\\webdriver\\edgedriver_win64\\msedgedriver.exe");
			driver = new EdgeDriver();
			driver.get("https://www.facebook.com/");
		}
	}
}
