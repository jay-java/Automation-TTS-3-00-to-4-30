package eshop;

import org.testng.annotations.Test;

public class Product {
	@Test(groups = "smoke")
	public void serachProduct() {
		System.out.println("search product");
	}
	
	@Test(groups = "sanity")
	public void compareProduct() {
		System.out.println("compare product");
	}
	@Test(groups = {"smoke","sanity"})
	public void addToCart() {
		System.out.println("add to cart");
	}
	@Test
	public void addToWishlist() {
		System.out.println("add to wishlist");
	}
	@Test
	public void removeFromcart() {
		System.out.println("remove from cart");
	}
}
