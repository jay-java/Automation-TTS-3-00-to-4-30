package selenium_test;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import connection.DriverConnection;

public class P003_StaticTable {
	public static void main(String[] args) {
		String url ="https://www.techlistic.com/2017/02/automate-demo-web-table-with-selenium.html";
		WebDriver driver = DriverConnection.getDriver(url);
//		WebElement text = driver.findElement(By.xpath("//table[@id='customers']/tbody/tr[3]/td[2]/span"));
//		System.out.println(text.getText());
		
		List<WebElement> list = driver.findElements(By.xpath("//table[@id='customers']/tbody/tr[1]/th/span"));
		System.out.println(list.size());
		for(WebElement e:list) {
			System.out.print(e.getText()+" ");
		}
		System.out.println();
		
		for(int i=2;i<=7;i++) {
			List<WebElement> rows = driver.findElements(By.xpath("//table[@id='customers']/tbody/tr["+i+"]"));
			for(int j=1;j<=3;j++) {
				 WebElement data = driver.findElement(By.xpath("//table[@id='customers']/tbody/tr["+i+"]/td["+j+"]/span"));
				 System.out.print(data.getText()+" ");
			}
			System.out.println();
		}
		
		
	}
}
