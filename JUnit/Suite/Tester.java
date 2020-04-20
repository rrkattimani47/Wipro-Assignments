// Create a test suite for all the classes created in this tech module and execute the same

import static org.junit.Assert.*;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Suite;

@RunWith(Suite.class)
@Suite.SuiteClasses({
	CalcTest.class,
	StringmanipTest.class
})

public class Tester {
	
	public class AllTests {
		
	}
}
