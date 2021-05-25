package Task1;

import static org.junit.Assert.*;

import org.junit.Test;

public class Eventestclass {

	@Test
	public void test() {
		Task1 obj=new Task1();
		int output=obj.even(4);
		assertEquals(4, output);
	}

}
