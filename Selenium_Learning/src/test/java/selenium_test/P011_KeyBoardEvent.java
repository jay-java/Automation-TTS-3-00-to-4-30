package selenium_test;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

import connection.DriverConnection;
public class P011_KeyBoardEvent {
	public static void main(String[] args) {
		String url = "https://www.google.com/";
		WebDriver driver = DriverConnection.getDriver(url);
		WebElement search = driver.findElement(By.name("q"));
		search.click();
		
		Actions action = new Actions(driver);
		action.keyDown(Keys.SHIFT)
				.sendKeys("learn testing")
				.keyUp(Keys.SHIFT)
				.keyDown(Keys.ENTER)
				.build()
				.perform();
	}
}
