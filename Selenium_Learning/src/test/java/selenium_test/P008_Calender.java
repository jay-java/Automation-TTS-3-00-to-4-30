package selenium_test;
import java.util.List; 
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import connection.DriverConnection;
public class P008_Calender {
	public static void main(String[] args) throws InterruptedException {
		String url = "https://www.globalsqa.com/demo-site/datepicker/#Simple%20Date%20Picker";
		WebDriver driver = DriverConnection.getDriver(url);
		driver.findElement(By.id("Icon Trigger")).click();
		
		WebElement iFrame= driver.findElement(By.xpath("//*[@id=\"post-2661\"]/div[2]/div/div/div[3]/p/iframe"));
		driver.switchTo().frame(iFrame);
		System.out.println("switched to frame");
		Thread.sleep(3000);
		
		driver.findElement(By.xpath("//img[@title='Select date']")).click();
		
//		WebElement iFrame = driver.findElement(By.xpath("//*[@id=\"post-2661\"]/div[2]/div/div/div[1]/p/iframe"));
//		driver.switchTo().frame(iFrame);
//		Thread.sleep(2000);
//		driver.findElement(By.id("datepicker")).click();
//		String myDate = "9";
//		String myMonth = "March";
//		String myYear = "2004";
//
//		WebElement currentYear = driver.findElement(By.className("ui-datepicker-year"));
//		String cuYear = currentYear.getText();
//
//		int y1 = Integer.parseInt(myYear);
//		int y2 = Integer.parseInt(cuYear);
//
//		while (!myYear.equals(driver.findElement(By.className("ui-datepicker-year")).getText())) {
//			if (y1 > y2) {
//				driver.findElement(By.xpath("//a[@data-handler='next']/span")).click();
//			} else {
//				driver.findElement(By.xpath("//a[@data-handler='prev']/span")).click();
//			}
//			
//		}
//
//		while (!myMonth.equals(driver.findElement(By.className("ui-datepicker-month")).getText())) {
//			if (y1 > y2) {
//				driver.findElement(By.xpath("//a[@data-handler='next']/span")).click();
//			} else {
//				driver.findElement(By.xpath("//a[@data-handler='prev']/span")).click();
//			}
//		}
//
//		List<WebElement> dates = driver
//				.findElements(By.xpath("//table[@class='ui-datepicker-calendar']/tbody/tr/td/a"));
//		for (WebElement ele : dates) {
//			if (ele.getText().equals(myDate)) {
//				ele.click();
//			}
//		}
	}
}
