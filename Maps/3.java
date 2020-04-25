/* Write a program that will have a Properties class object which is capable of storing some States of India and their Capital.
Use an Iterator to list all the elements stored in the Properties.*/


import java.util.Iterator;
import java.util.Map.Entry;
import java.util.Properties;
import java.util.Set;

public class Assignment3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Properties properties = new Properties();
		
		properties.setProperty("Karnataka", "Bangalore");
		properties.setProperty("Maharashtra", "Mumbai");
		properties.setProperty("Kerala", "Thiruvananthpuram");

		Set<Entry<Object, Object>> set = properties.entrySet();
		Iterator<Entry<Object, Object>> it = set.iterator();
		
		while (it.hasNext()) {
			Entry<Object, Object> me = it.next();
			System.out.println(me);
		}
	}

}
