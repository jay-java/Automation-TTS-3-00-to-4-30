package eshop;

import org.testng.annotations.Test;

public class User {
	@Test(groups = "sanity")
	public void createAccount() {
		System.out.println("create account");
	}
	@Test(groups = {"smoke","sanity"})
	public void login() {
		System.out.println("login test");
	}
	@Test
	public void profileMange() {
		System.out.println("profile mange");
	}
	@Test
	public void logout() {
		System.out.println("logout");
	}
}
