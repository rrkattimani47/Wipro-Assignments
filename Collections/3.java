/*Create an ArrayList that can store only Strings. 
Create a printAll method that will print all the elements of the ArrayList using an Iterator.*/

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class PrintAll {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<String> list = new ArrayList<>();
		list.add("Apple ");
		list.add("Mango ");
		list.add("Cherry");
		list.add("Watermelon");
		
		printAll(list);
	}

	public static void printAll(List<String> list) {
		Iterator<String> it = list.iterator();
		
		while (it.hasNext())
			System.out.println(it.next());
	}

}
