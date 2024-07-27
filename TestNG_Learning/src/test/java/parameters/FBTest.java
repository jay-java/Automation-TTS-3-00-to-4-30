package parameters;

import org.junit.BeforeClass;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import connection.DriverConnection;

public class FBTest {
	static WebDriver driver = null;

	@BeforeClass
	public static void openBrowser() {
		driver = DriverConnection.getDriver("https://www.facebook.com/");
	}

	@Parameters("dp")
	@Test
	public void test(String email, String password) {
		WebElement emailEle = driver.findElement(By.name("email"));
		emailEle.clear();
		emailEle.sendKeys(email);
		WebElement passEle = driver.findElement(By.name("pass"));
		passEle.clear();
		passEle.sendKeys(password);
	}

	@DataProvider(name = "dp")
	public static Object[][] data() {

		Object[][] obj = new Object[4][2];
		obj[0][0] = "correct@gmail.com";
		obj[0][1] = "correct@123";

		obj[1][0] = "correct@gmail.com";
		obj[1][1] = "incorrect@123";

		obj[2][0] = "incorrect@gmail.com";
		obj[2][1] = "correct@123";

		obj[3][0] = "incorrect@gmail.com";
		obj[3][1] = "incorrect@123";

		return obj;
	}

}
