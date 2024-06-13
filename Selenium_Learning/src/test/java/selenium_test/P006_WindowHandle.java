package selenium_test;

import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.WebDriverWait;

import connection.DriverConnection;

public class P006_WindowHandle {
	public static void main(String[] args) throws InterruptedException {
		String url = "https://demo.guru99.com/popup.php";
		WebDriver driver = DriverConnection.getDriver(url);
		driver.findElement(By.linkText("Click Here")).click();
		String mainWin = driver.getWindowHandle();
		System.out.println(mainWin);
		Set<String> allWin = driver.getWindowHandles();
		for (String s : allWin) {
			if (!s.equals(mainWin)) {
				driver.switchTo().window(s);
				driver.findElement(By.name("emailid")).sendKeys("selenium@gmail.com");
				driver.findElement(By.name("btnLogin")).click();
			}
		}
		Thread.sleep(3000);
		driver.quit();
	}
}
