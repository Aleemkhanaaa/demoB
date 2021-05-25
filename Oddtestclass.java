package Task1;

import static org.junit.Assert.*;

import org.junit.Test;

public class Oddtestclass {

	@Test
	public void test() {
		Task1 obj=new Task1();
		int output=obj.odd(5);
		assertEquals(5, output);	
	}

}
