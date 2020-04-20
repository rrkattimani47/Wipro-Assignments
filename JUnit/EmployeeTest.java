import static org.junit.Assert.*;
import java.util.ArrayList;
import org.junit.jupiter.api.Test;
	

	class EmployeeTest {
		Employee e = new Employee();
		ArrayList<String> list = new ArrayList<>();
		{
			list.add("Bob");
			list.add("Alice");
			list.add("John");
		}
		
		


		@Test
		void testFindName() {
			System.out.println(list);
			assertEquals("Result", "FOUND", e.findName(list, "Alice"));
			System.out.println("test");
		}

	}

//Rigth click on this test, then debug as- junit- green horrizontal line appears n left bar...
