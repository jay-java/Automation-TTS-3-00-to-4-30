package selenium_test;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

import connection.DriverConnection;

public class P009_MouseEvent {
	public static void main(String[] args) throws InterruptedException {
		String url ="https://www.amazon.in/";
		WebDriver driver = DriverConnection.getDriver(url);
		
		WebElement miniTV = driver.findElement(By.linkText("Amazon miniTV"));
		WebElement sell = driver.findElement(By.linkText("Sell"));
		WebElement bs = driver.findElement(By.linkText("Best Sellers"));
		
		Actions action = new Actions(driver);
		action.moveToElement(miniTV).build().perform();
		Thread.sleep(2000);
		action.moveToElement(sell).build().perform();
		Thread.sleep(2000);
		action.moveToElement(bs).build().perform();
		
	}
}
