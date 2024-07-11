package basic;

import org.testng.annotations.Test;

public class P002_Priority {
	@Test(priority = 2)
	public void login() {
		System.out.println("login user");
	}
	@Test(priority = 1)
	public void createUser() {
		System.out.println("create account");
	}
	@Test(priority = 3)
	public void profileMange() {
		System.out.println("profile manage");
	}
	@Test(priority = 6)
	public void logout() {
		System.out.println("logout");
	}
	@Test(priority = 4)
	public void addToCart() {
		System.out.println("add to cart");
	}
	@Test(priority = 5,expectedExceptions = Exception.class)
	public void payment() {
		System.out.println("payment");
	}
}
