package listener;

import static org.testng.Assert.assertFalse;

import org.testng.annotations.Test;

public class Demo {
	@Test
	public void test1() {
		System.out.println("test 1");
		assertFalse(true);
	}

	@Test
	public void test2() {
		System.out.println("test 2");
	}

}
