package selenium_test;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import connection.DriverConnection;

public class P003_StaticTable {
	public static void main(String[] args) {
		String url = "https://www.techlistic.com/2017/02/automate-demo-web-table-with-selenium.html";
		WebDriver driver = DriverConnection.getDriver(url);
		WebElement name = driver.findElement(By.xpath("//*[@id=\"customers\"]/tbody/tr[4]/td[2]/span"));
//		System.out.println(name.getText());
		
	 	List<WebElement> thead = driver.findElements(By.xpath("//table[@id='customers']/tbody/tr[1]/th/span"));
	 	for(WebElement e:thead) {
	 		System.out.print(e.getText()+" ");
	 	}
	}
}
