package selenium_test;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.remote.DriverCommand;

import connection.DriverConnection;

public class P001_Locators {
	public static void main(String[] args) {
		String url = "https://www.facebook.com/";
		WebDriver driver = DriverConnection.getDriver(url);
		WebElement emailEle = driver.findElement(By.id("email"));
		WebElement passEle =  driver.findElement(By.id("pass"));
		emailEle.sendKeys("selenium@gmail.com");
		passEle.sendKeys("selenium@123");
		
		
	}
}
