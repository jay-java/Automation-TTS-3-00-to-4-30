package selenium_test;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import connection.DriverConnection;

public class P007_IFrame {
	public static void main(String[] args) {
		String url ="https://demoqa.com/frames";
		WebDriver driver = DriverConnection.getDriver(url);
		
		WebElement iframe=  driver.findElement(By.id("frame1"));
		
		driver.switchTo().frame(iframe);
		WebElement ele =  driver.findElement(By.id("sampleHeading"));
		System.out.println(ele.getText());
	}
}
