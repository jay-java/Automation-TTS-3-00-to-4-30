package junit;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

public class P005_Annotations {
	@Test
	public void test1() {
		System.out.println("test 1 function");
	}

	@Test
	public void test2() {
		System.out.println("test 2 function");
	}

	@Before
	public void beforeMethod() {
		System.out.println("before method");
	}

	@After
	public void aftermethod() {
		System.out.println("after method");
	}

	@BeforeClass
	public static void beforeClass() {
		System.out.println("before class");
	}

	@AfterClass
	public static void afterClass() {
		System.out.println("after class");
	}
}
