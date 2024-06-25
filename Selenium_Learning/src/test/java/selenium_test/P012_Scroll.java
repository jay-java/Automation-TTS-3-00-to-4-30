package selenium_test;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import connection.DriverConnection;

public class P012_Scroll {
	public static void main(String[] args) throws InterruptedException {
		String url ="https://demoqa.com/automation-practice-form";
		WebDriver driver =DriverConnection.getDriver(url);
		
		JavascriptExecutor js = (JavascriptExecutor)driver;
		//1.By pixels
//		js.executeScript("window.scrollBy(0,350)", "");
		
		//2.By Element
//		WebElement btn = driver.findElement(By.id("uploadPicture"));
//		js.executeScript("arguments[0].scrollIntoView();", btn);
//		
//		Thread.sleep(1000);
//		btn.sendKeys("C:\\Users\\jay-pc\\Downloads\\tshirt.png");
		
		//3.vertical scroll Down
		js.executeScript("window.scrollBy(0,document.body.scrollHeight)");
	}
}
