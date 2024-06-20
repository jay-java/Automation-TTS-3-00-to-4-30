package selenium_test;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

import connection.DriverConnection;

public class P010_DragAndDrop {
	public static void main(String[] args) throws InterruptedException {
		String url="https://www.globalsqa.com/demo-site/draganddrop/";
		WebDriver driver= DriverConnection.getDriver(url);
		WebElement iFrame= driver.findElement(By.xpath("//*[@id=\"post-2669\"]/div[2]/div/div/div[1]/p/iframe"));
		driver.switchTo().frame(iFrame);
		Thread.sleep(2000);
		
		WebElement from = driver.findElement(By.xpath("//ul[@id='gallery']/li[1]/img"));
		WebElement to = driver.findElement(By.id("trash"));
		
		Actions action = new Actions(driver);
		action.clickAndHold(from).moveToElement(to).release().build().perform();
		
		
	}
}
