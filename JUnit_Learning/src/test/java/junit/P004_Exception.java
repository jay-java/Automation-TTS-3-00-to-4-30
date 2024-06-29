package junit;

import org.junit.Test;

public class P004_Exception {
	@Test(expected = ArithmeticException.class)
	public void division() {
		int a = 10/0;
		System.out.println("a = "+a);
	}
	@Test(expected = ArrayIndexOutOfBoundsException.class)
	public void getData() {
		int a[] = {1,2,3,4,5};
		System.out.println(a[6]);
	}
}
