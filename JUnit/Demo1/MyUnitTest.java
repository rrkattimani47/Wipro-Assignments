import static org.junit.Assert.assertEquals;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class MyUnitTest {

	@Test
	void testStringConcat() {
		MyUnit myUnit = new MyUnit();
		assertEquals("Result", "HelloWorld", myUnit.stringConcat("Hello", "World"));
	}

}
