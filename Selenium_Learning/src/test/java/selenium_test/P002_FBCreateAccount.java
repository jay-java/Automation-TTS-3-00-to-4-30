package selenium_test;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import connection.DriverConnection;

public class P002_FBCreateAccount {
	public static void main(String[] args) throws InterruptedException {
		String url ="https://www.facebook.com/";
		WebDriver driver  = DriverConnection.getDriver(url);
		
		driver.findElement(By.linkText("Create new account")).click();
		
		Thread.sleep(2000);
		
		WebElement fname = driver.findElement(By.name("firstname"));
		fname.sendKeys("selenium");
		WebElement lname = driver.findElement(By.name("lastname"));
		lname.sendKeys("testing");
		
	}
}
