/*Write a program to print the sum of the elements of an array following the given below condition.

If the array has 6 and 7 in succeeding orders, ignore the numbers between 6 and 7 and consider the other numbers for calculation of sum.

Eg1) Array Elements - 10,3,6,1,2,7,9
O/P: 22   
[i.e 10+3+9]

Eg2) Array Elements - 7,1,2,3,6
O/P:19

Eg3) Array Elements - 1,6,4,7,9
O/P:10 */

package exceptionSum;
import java.util.Scanner;
public class exceptSum {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 Scanner in = new Scanner(System.in);
	        System.out.print("Enter size of array: ");
	        int size = in.nextInt();
	        int arr[] = new int[size];
	        System.out.print("Enter array elements: ");
	        boolean six = false, seven = false;
	        int id_six = -1, id_seven = arr.length;

	        for (int i = 0; i < arr.length; i++) {
	            arr[i] = in.nextInt();
	            if (arr[i] == 6) {
	                six = true;
	                id_six = i;
	            }
	            if (six && arr[i] == 7) {
	                seven = true;
	                id_seven = i;
	            }
	        }

	        int sum = 0;

	        for (int i = 0; i < arr.length; i++) {
	            if (six && seven) {
	                if (i < id_six || i > id_seven)
	                    sum += arr[i];
	            } else
	                sum += arr[i];
	        }

	        System.out.println(sum);
	}

}
