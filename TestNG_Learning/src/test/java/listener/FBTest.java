package listener;

import static org.testng.Assert.assertEquals;
import static org.testng.Assert.assertFalse;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.ITestContext;
import org.testng.annotations.Test;

import connection.DriverConnection;

public class FBTest {
	WebDriver driver = null;
	String url="https://www.facebook.com/";
	@Test
	public void titleTest() {
		driver = DriverConnection.getDriver(url);
		String actualTtitle = driver.getTitle();
		System.out.println(actualTtitle);
		String expectedTitle = "Facebook";
		assertEquals(actualTtitle, expectedTitle);
	}
	
	@Test
	public void loginTest(ITestContext con) {
		driver = DriverConnection.getDriver(url);
		con.setAttribute("selenium", driver);
		WebElement emailEle = driver.findElement(By.name("email"));
		emailEle.sendKeys("selenium@gmail.com");
		WebElement passEle = driver.findElement(By.name("pass"));
		passEle.sendKeys("selenium@123");
		driver.findElement(By.name("login")).click();
		assertFalse(true);
	}
}
