import static org.junit.Assert.*;


import org.junit.Test;


import org.junit.Test;
public class MyUnitTest {
	MyUnit myunit = new MyUnit();
	@Test
	public void testPalindromeCheck() {
		//fail("Not yet implemented");
		assertTrue("Result: ", myunit.palindromeCheck("madam"));
		assertTrue("Result: ", myunit.palindromeCheck("mom"));
		assertTrue("Result: ", myunit.palindromeCheck("dad"));
		assertTrue("Result: ", myunit.palindromeCheck("malayalam"));
		assertFalse("Result: ", myunit.palindromeCheck("kerala"));
		assertFalse("Result: ", myunit.palindromeCheck("india"));
	}

}
