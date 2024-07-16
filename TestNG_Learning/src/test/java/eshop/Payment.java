package eshop;

import org.testng.annotations.Test;

public class Payment {
	@Test(groups = "smoke")
	public void COD() {
		System.out.println("COD");
	}
	@Test(groups = "sanity")
	public void UPI() {
		System.out.println("UPI");
	}
	@Test
	public void creditCart() {
		System.out.println("credit card");
	}
	@Test
	public void debitCart() {
		System.out.println("debit card");
	}
	@Test
	public void netBanking() {
		System.out.println("net banking");
	}
}
