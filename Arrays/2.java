//Write a program to initialize an integer array and find the maximum and minimum value of the array.


package arraymaxandmin;
import java.util.Scanner;
public class maxandmin {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.print("Enter the size of the array ");
		Scanner scan=new Scanner(System.in);
		int i,j,s=0,m=9999;
		i=scan.nextInt();
		int[] arr=new int[i];
		System.out.println("Enter the array");
		for(j=0;j<arr.length;j++)
		{
			arr[j]=scan.nextInt();
		}
		for(j=0;j<arr.length;j++)
		{
			if(arr[j]>s)
			{
				s=arr[j];
			}
			else if(arr[j]<m)
			{
				m=arr[j];
			}else {}
		}
		System.out.println("Max value is "+s +"\n"+"Min value is "+m);
	}

}
