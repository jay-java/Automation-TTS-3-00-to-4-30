package junit;

import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import connection.DriverConnection;

public class P006_AnnotationPractical {
	static WebDriver driver = null;
	@BeforeClass
	public static void beforeClass() {
		String url = "https://www.facebook.com/";
		driver = DriverConnection.getDriver(url);
	}
	
	@Test
	public void loginTest() {
		WebElement emailEle= driver.findElement(By.name("email"));
		emailEle.sendKeys("selenium@gmail.com");
		WebElement passEle= driver.findElement(By.name("pass"));
		passEle.sendKeys("selenium@gmail.com");
		driver.findElement(By.name("login")).click();
	}
	
	@AfterClass
	public static void clodeBrowser() {
		driver.quit();
	}
	
	
	
	
}
