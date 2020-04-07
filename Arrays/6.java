//Write a program to initialize an array and print them in a sorted order.


package largestandSmallestArray;
import java.util.Scanner;
public class largeSmall {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scn = new Scanner (System.in);
		System.out.print("Enter no. of elements you want in array:");
                int n = scn.nextInt();
 
		int array[] = new int[n];
                System.out.println("Enter all the elements:");
		for (int i = 0; i < array.length; i++)
		{
			array[i] = scn.nextInt();
		}
 
		int largest1, largest2, temp;
		int smallest1, smallest2,flag;
 
		largest1 = array[0];
		largest2 = array[1];
 
		if (largest1 < largest2)
		{
			temp = largest1;
			largest1 = largest2;
			largest2 = temp;
		}
		
		smallest1 = array[0];
		smallest2 = array[1];
 
		if (smallest1 > smallest2)
		{
			flag = smallest1;
			smallest1 = smallest2;
			smallest2 = flag;
		}
 
		for (int i = 2; i < array.length; i++)
		{
			if (array[i] > largest1)
			{
				largest2 = largest1;
				largest1 = array[i];
			}
			else if (array[i] > largest2 && array[i] != largest1)
			{
				largest2 = array[i];
			}
		}
 
		
		for (int i = 2; i < array.length; i++)
		{
			if (array[i] < smallest1)
			{
				smallest2 = smallest1;
				smallest1 = array[i];
			}
			else if (array[i] < smallest2 && array[i] != smallest1)
			{
				smallest2 = array[i];
			}
		}
		System.out.println ("The First largest is " + largest1);
		System.out.println ("The Second largest is " + largest2);
		
		System.out.println ("The First smallest is " + smallest1);
		System.out.println ("The Second smalest is " + smallest2);
	}

}
