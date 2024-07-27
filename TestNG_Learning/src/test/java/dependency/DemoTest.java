package dependency;

import static org.testng.Assert.assertFalse;

import org.testng.annotations.Test;

public class DemoTest {
	@Test
	public void createAccount() {
		System.out.println("create account");
	}
	@Test(dependsOnMethods = "createAccount")
	public void login() {
		System.out.println("login test");
		assertFalse(true);
	}
	@Test(dependsOnMethods = "login")
	public void profileMange() {
		System.out.println("profile mange");
	}
	@Test(dependsOnMethods = "login")
	public void logout() {
		System.out.println("logout");
	}
}
