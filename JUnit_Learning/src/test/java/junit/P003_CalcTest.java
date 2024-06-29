package junit;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class P003_CalcTest {
	@Test
	public void test() {
		Calc c = new Calc();
		int actual = c.add(1, 2);
		int expected = 3;
		assertEquals(expected, actual);
	}
	
}
