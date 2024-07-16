package parameters;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import connection.DriverConnection;

public class ParametersDemo {
	@Parameters({"email","password"})
	@Test
	public void login(String email,String password) {
		String url = "https://www.facebook.com/";
		WebDriver driver =DriverConnection.getDriver(url);
		WebElement emailEle = driver.findElement(By.name("email"));
		emailEle.clear();
		emailEle.sendKeys(email);
		
		WebElement passEle =driver.findElement(By.name("pass"));
		passEle.clear();
		passEle.sendKeys(password);
	}
}
