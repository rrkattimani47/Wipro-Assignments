/*Write a program to initialize an integer array with values and check if a given number is present in the array or not.

If the number is not found, it will print -1 else it will print the index value of the given  number in the array.

Example 1) If the Array elements are  {1,4,34,56,7} and the search element is 90, then the output expected is -1.

Example 2)If the Array elements are  {1,4,34,56,7} and the search element is 56, then the output expected is 3.*/


package checkArray;
import java.util.Scanner;
public class check {

	 public static int  findIndex (int[] my_array, int t) {
	        if (my_array == null) return -1;
	        int len = my_array.length;
	        int i = 0;
	        while (i < len) {
	            if (my_array[i] == t) return i;
	            else i=i+1;
	        }
	        return -1;
	    }
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] my_array = {25, 14, 56, 15, 36, 56, 77, 18, 29, 49};
		int num;
		System.out.println("Enter the key element: ");
		Scanner input=new Scanner(System.in);
		num=input.nextInt();
	      System.out.println("Index position of key is: " + findIndex(my_array,num));
	     // System.out.println("Index position of 77 is: " + findIndex(my_array, 77));
	}
}
