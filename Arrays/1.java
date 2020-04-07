//Write a program to initialize an integer array and print the sum and average of the array.

package avgArray;
import java.util.Scanner;
public class avg {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.print("Enter the size of the array ");
		Scanner scan=new Scanner(System.in);
		int i,j,s=0;
		i=scan.nextInt();
		int[] arr=new int[i];
		System.out.println("Enter the array");
		for(j=0;j<arr.length;j++)
		{
			arr[j]=scan.nextInt();
		}
		for(j=0;j<arr.length;j++)
		{
			s=s+arr[j];
		}
		System.out.println("Sum of the numbers in the array is "+s+"\n"+"Average of the numbers is "+s/i);
	}

}
